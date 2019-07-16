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
 * Nachrichtenkopf für Nachrichten von Behörden an andere Behörden.
 * 
 * <p>Java-Klasse für Nachrichtenkopf.G2G complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Nachrichtenkopf.G2G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.osci.de/xinneres/basisnachricht/4}Nachrichtenkopf.G2G">
 *       &lt;sequence>
 *         &lt;element name="identifikation.nachricht" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Identifikation.Nachricht" form="unqualified"/>
 *         &lt;element name="leser" type="{http://www.osci.de/xinneres/behoerde/4}Behoerde" form="unqualified"/>
 *         &lt;element name="autor" type="{http://www.osci.de/xinneres/behoerde/4}Behoerde.Erreichbar" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nachrichtenkopf.G2G")
public class NachrichtenkopfG2G
    extends de.osci.xinneres.basisnachricht._4.NachrichtenkopfG2G
{


}
