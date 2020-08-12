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
 * Identifkationsmerkmale zu einer Nachricht. Dieser Typ kann im ID-Block zu einer Nachricht verwendet werden oder in einem Abschnitt, der auf eine Nachricht referenziert.
 * 
 * <p>Java-Klasse für Identifikation.Nachricht complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Identifikation.Nachricht">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.osci.de/xinneres/basisnachricht/4}Identifikation.Nachricht">
 *       &lt;sequence>
 *         &lt;element name="nachrichtenUUID" type="{http://www.osci.de/xinneres/basisnachricht/4}UUID" form="unqualified"/>
 *         &lt;element name="nachrichtentyp" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.XBauNachrichten" form="unqualified"/>
 *         &lt;element name="erstellungszeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifikation.Nachricht")
public class IdentifikationNachricht
    extends de.osci.xinneres.basisnachricht._4.IdentifikationNachricht
{


}
