package de.rub.bi.inf.xbau.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CodeListReader {
	
	private static CodeListReader instance = null;
	
	public static CodeListReader getInstance() {
		if(instance==null) {
			instance = new CodeListReader();
			instance.init();
		}
		return instance;
	}
	
	private NodeList nodeList=null;
	private Map<String, CodeList> codeLists = new HashMap<String, CodeList>();
	
	private void init() {
		readXSDCodelists("./schemata/xbau-codes.xsd");
		readGenericodeCodelist("./codelisten/Bauwerkszuordnungskatalog.xml");
	}
	
	private void readXSDCodelists(String filename) {
		FileInputStream fileIS;
		try {
			fileIS = new FileInputStream(filename);
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document xmlDocument = builder.parse(fileIS);
			XPath xPath = XPathFactory.newInstance().newXPath();
			String expression = "/schema/simpleType";
			nodeList = (NodeList) xPath.compile(expression).evaluate(
					xmlDocument, XPathConstants.NODESET);
		} catch (XPathExpressionException | SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		for (int i=0; i<nodeList.getLength(); i++) {
			Node simpleTypeNode = nodeList.item(i);
		
			Node nameNode = simpleTypeNode.getAttributes().getNamedItem("name");
//			System.out.println(nameNode.getNodeValue());
			
			Node restrictionNode = getFirstNodeByName(
					simpleTypeNode.getChildNodes(), "xs:restriction");
//			System.out.println(restrictionNode.getNodeName());
			
			CodeListXSD codeList = new CodeListXSD();
			NodeList childNodes = restrictionNode.getChildNodes();
			for (int j = 0; j <= childNodes.getLength(); j++) {
				Node enumNode = childNodes.item(j);

				if (enumNode != null && enumNode.getNodeName().equals("xs:enumeration")) {
					Node enumValueNode = enumNode.getAttributes().getNamedItem("value");
					String enumValue = enumValueNode.getNodeValue();
//					System.out.println(enumValue);

					Node annotationNode = getFirstNodeByName(enumNode.getChildNodes(), "xs:annotation");

					Node appInfoNode = getFirstNodeByName(annotationNode.getChildNodes(), "xs:appinfo");

					Node beschreibungNode = getFirstNodeByName(appInfoNode.getChildNodes(),
							"wertErsteBeschreibungsspalte");
					String beschreibung = beschreibungNode.getTextContent();
//					System.out.println(beschreibung);

					Node documentationNode = getFirstNodeByName(annotationNode.getChildNodes(), "xs:documentation");
					
					String documentation = null;
					if(documentationNode!=null) {
						documentation = documentationNode.getTextContent();
//						System.out.println(documentation);
					}
					
					
					int token = Integer.valueOf(enumValue);
					codeList.getWerte().put(token, beschreibung);
					codeList.getDocumentation().put(token, documentation);	
					codeLists.put(nameNode.getNodeValue(), codeList);
				}

			}
		}
	}
	
	private void readGenericodeCodelist(String filename) {
		FileInputStream fileIS;
		try {
			fileIS = new FileInputStream(filename);
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document xmlDocument = builder.parse(fileIS);
			XPath xPath = XPathFactory.newInstance().newXPath();
			String expression = "/CodeList/SimpleCodeList/Row";
			nodeList = (NodeList) xPath.compile(expression).evaluate(
					xmlDocument, XPathConstants.NODESET);
		} catch (XPathExpressionException | SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
//		System.out.println(nodeList.toString());
		
		CodeListGenericode codeList = new CodeListGenericode();
		codeLists.put("BMK.Bauwerkszuordnungskatalog", codeList);
		
		for (int i=0; i<nodeList.getLength(); i++) {
			Node rowNode = nodeList.item(i);
			
//			System.out.println(rowNode.getNodeName());
			
			NodeList valueNodes = rowNode.getChildNodes();
			
			String schluessel = null, 
					bezeichnung = null, 
					beispiel = null;
			
			for (int j = 0; j <= valueNodes.getLength(); j++) {
		
				Node valueNode = valueNodes.item(j);
				if(valueNode != null &&
						valueNode.getNodeName().equals("Value")){
					
					Node columRefNode = valueNode.getAttributes().getNamedItem("ColumnRef");
				    String columRef = columRefNode.getNodeValue();

				    if(columRef.equals("SCHLUESSEL")) {
						Node simpleValueNode = getFirstNodeByName(valueNode.getChildNodes(), "SimpleValue");
				        if (simpleValueNode!=null) {
				        	schluessel = simpleValueNode.getTextContent();
//				        	System.out.println(schluessel);
				        }
				    }else if(columRef.equals("Bezeichnung")) {
						Node simpleValueNode = getFirstNodeByName(valueNode.getChildNodes(), "SimpleValue");
				        if (simpleValueNode!=null) {
				        	bezeichnung = simpleValueNode.getTextContent();
//				        	System.out.println(bezeichnung);
				        }
				    }else if(columRef.equals("Beispiel")) {
						Node simpleValueNode = getFirstNodeByName(valueNode.getChildNodes(), "SimpleValue");
				        if (simpleValueNode!=null) {
				        	beispiel = simpleValueNode.getTextContent();
//				        	System.out.println(beispiel);
				        }
				    }
		
				} //end if
				
				
				
			}//end for value Node
			
			
			  if(schluessel!=null && bezeichnung!=null) {
			    	int _schluessel = Integer.valueOf(schluessel);
			    	codeList.getBezeichnung().put(_schluessel, bezeichnung);
			    	
			    	if(beispiel!=null) {
			    		codeList.getBeispiel().put(_schluessel, beispiel);
			    	}	
			    	
			   }
		

		}// end for row node
	}
	
	public CodeList getCodeList (String name){
		return this.codeLists.get(name);
	}
	
	private Node getFirstNodeByName(NodeList nodeList, String name) {
		Node searchNode = null;
		
		for (int ci=0; ci<nodeList.getLength(); ci++) {
			Node childNode = nodeList.item(ci);
		
			if (childNode.getNodeName().equals(name)) {
				searchNode = childNode;
			}	
			
		}
		
		return searchNode;
	}

}
