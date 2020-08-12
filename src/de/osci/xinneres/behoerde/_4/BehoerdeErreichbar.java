//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.osci.xinneres.behoerde._4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ enthält Angaben über den Namen und die Erreichbarkeit einer Behörde. Eine Behörde  im Sinne des Verwaltungsverfahrensgesetzes ist jede Stelle, die Aufgaben der öffentlichen Verwaltung wahrnimmt.
 * Anders als in dem Typ Behoerde sind in diesem Typen alle Angaben zur Kontaktaufnahme mit der übermittelten Behörde Pflichtelemente.
 * 
 * <p>Java-Klasse für Behoerde.Erreichbar complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Behoerde.Erreichbar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.osci.de/xinneres/behoerde/4}Behoerde">
 *       &lt;sequence>
 *         &lt;element name="behoerdenkennung" type="{http://www.osci.de/xinneres/behoerde/4}Behoerdenkennung"/>
 *         &lt;element name="erreichbarkeit" type="{http://www.osci.de/xinneres/kommunikation/3}Kommunikation" maxOccurs="unbounded"/>
 *         &lt;element name="anschrift" type="{http://www.osci.de/xinneres/postanschrift/3}PostalischeInlandsanschrift"/>
 *         &lt;element name="behoerdenname" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Behoerde.Erreichbar")
public class BehoerdeErreichbar
    extends Behoerde
{


}
