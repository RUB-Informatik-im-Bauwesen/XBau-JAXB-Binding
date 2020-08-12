//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import de.xoev.schemata.code._1_0.Code;


/**
 * Diese Codeliste stellt die Klassifikation von Gebäuden gemäß Bauwerkszuordnungskatalog dar. Der Bauwerkszuordnungskatalog  beschreibt die Art eines Gebäudes, indem die Art seiner Nutzung angegeben wird.
 * 
 * Die Codeliste ist im XRepository (www.xrepository.de) unter Nennung ihrer Codelisten-URI auffindbar und kann von dort im XML-Format OASIS Genericode abgerufen werden.
 * 
 * <p>Java-Klasse für Code.BaulicheAnlagenGebaeude complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Code.BaulicheAnlagenGebaeude">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://xoev.de/schemata/code/1_0}Code">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="urn:xoev-de:bmk:codeliste:bauwerkszuordnungskatalog" />
 *       &lt;attribute name="listVersionID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code.BaulicheAnlagenGebaeude")
public class CodeBaulicheAnlagenGebaeude
    extends Code
{


}
