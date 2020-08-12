package de.rub.bi.inf.xbau.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class XBauImporter {
	
	public XBauImporter() {
		// TODO Auto-generated constructor stub
	}
	
	public Object readFromFile(String path) throws JAXBException, FileNotFoundException, XMLStreamException {
		
		File file = new File(path);
		
		JAXBContext context = JAXBContext.newInstance("de.xleitstelle.xbau.schema._2._1");

		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		Unmarshaller um = context.createUnmarshaller();

		XMLStreamReader reader = xmlInputFactory.createXMLStreamReader(new FileInputStream(file));
		Object o = um.unmarshal(reader);
		
		return o;
	}
     
}
