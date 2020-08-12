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
 * Diese Codeliste nennt Arten von Bauvorlagen, die einem Bauantrag als Anlagen beigefügt sein können und die zur Bearbeitung des Bauantrags benötigt werden.  Quelle ist § 68 Abs. 2 MBO in Verbindung mit MBauVorlVO Teil II+III.
 * 
 * <p>Java-Klasse für Code.VorlagenBauantragBearbeitung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Code.VorlagenBauantragBearbeitung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://xoev.de/schemata/code/1_0}Code">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Codelist.VorlagenBauantragBearbeitung" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="urn:xoev-de:xbau:codeliste:vorlagenbauantragbearbeitung" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" fixed="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code.VorlagenBauantragBearbeitung")
public class CodeVorlagenBauantragBearbeitung
    extends Code
{


}
