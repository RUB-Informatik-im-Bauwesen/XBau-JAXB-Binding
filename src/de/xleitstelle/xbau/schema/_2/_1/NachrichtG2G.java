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


/**
 * Nachrichtenstruktur für die Kommunikation von Behörden mit anderen Behörden.
 * 
 * <p>Java-Klasse für Nachricht.G2G complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Nachricht.G2G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.osci.de/xinneres/basisnachricht/4}Nachricht.G2G">
 *       &lt;sequence>
 *         &lt;element name="nachrichtenkopf" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Nachrichtenkopf.G2G" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="produkt" use="required" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *       &lt;attribute name="produkthersteller" use="required" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *       &lt;attribute name="produktversion" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *       &lt;attribute name="standard" use="required" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *       &lt;attribute name="test" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *       &lt;attribute name="version" use="required" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nachricht.G2G")
public class NachrichtG2G
    extends de.osci.xinneres.basisnachricht._4.NachrichtG2G
{


}
