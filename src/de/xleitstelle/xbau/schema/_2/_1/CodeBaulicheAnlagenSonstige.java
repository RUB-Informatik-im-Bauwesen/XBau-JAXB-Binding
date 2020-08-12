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
 * Dieser Code-Typ steht für eine Klassifikation der baulichen Anlagen, die nicht Gebäude sind. 
 * 
 * In diesen Typ  ist eine auszuwählende bzw. selbst zu definierende Codeliste einzubinden, die eine solche Klassifikation bietet. Im Anwendungskontext sind in die Attribute des vorliegenden Typs die Codelisten-URI und die Nummer der Version der ausgewählten Codeliste (in die XBau-Nachrichteninstanzen) einzutragen.
 * 
 * Als Muster wurde eine passende Codeliste definiert und als Angebot zur Einbindung für diesen Typ  bereitgestellt. Diese Codeliste kann auf Antrag erweitert bzw. geändert werden. Sie ist  im XRepository (www.xrepository.de) unter der Codelisten-URI urn:xoev-de:xbau:codeliste:baulicheanlagen.sonstige  auffindbar und kann von dort im XML-Format OASIS Genericode abgerufen werden.
 * 
 * <p>Java-Klasse für Code.BaulicheAnlagenSonstige complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Code.BaulicheAnlagenSonstige">
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
@XmlType(name = "Code.BaulicheAnlagenSonstige")
public class CodeBaulicheAnlagenSonstige
    extends Code
{


}
