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
 * Arten von Befunden einer universell einsetzbaren Befundliste für die formelle Prüfung von Anträgen, Anzeigen und Erklärungen.
 * 
 * In diesen Typ  ist eine auszuwählende bzw. selbst zu definierende Codeliste einzubinden, die eine solche Klassifikation bietet. Im Anwendungskontext sind in die Attribute des vorliegenden Typs die Codelisten-URI und die Nummer der Version der ausgewählten Codeliste (in die XBau-Nachrichteninstanzen) einzutragen.
 * 
 * Als Muster wurde die Codeliste Befunde einer formellen Prüfung (URI: urn:xoev-de:xbau:codeliste:formellebefundeart) als Angebot zur Einbindung für diesen Typ  bereitgestellt. 
 * 
 * Die angebotene Codeliste ist  im XRepository (www.xrepository.de) unter dem Stichwort "XBau" auffindbar und kann von dort im XML-Format OASIS Genericode abgerufen werden.
 * 
 * <p>Java-Klasse für Code.FormelleBefundeArt complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Code.FormelleBefundeArt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://xoev.de/schemata/code/1_0}Code">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="listURI" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="listVersionID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code.FormelleBefundeArt")
public class CodeFormelleBefundeArt
    extends Code
{


}
