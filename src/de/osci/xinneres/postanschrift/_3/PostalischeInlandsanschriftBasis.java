//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.osci.xinneres.postanschrift._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.osci.xinneres.meldeanschrift._3.Meldeanschrift;


/**
 * Dieser Datentyp bildet die Basis einer postalischen Gebäudeanschrift. Er basiert auf der Meldeanschrift, enthält aber nur die für die Adressierung erforderlichen Angaben. Die Angabe des Wohnort, der Postleitzahl und der Straße sind in diesem Datentyp verpflichtend.
 * 
 * <p>Java-Klasse für PostalischeInlandsanschrift.Basis complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PostalischeInlandsanschrift.Basis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift">
 *       &lt;sequence>
 *         &lt;element name="hausnummer" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Hausnummer" minOccurs="0"/>
 *         &lt;element name="hausnummerBuchstabeZusatzziffer" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.HausnummerBuchstabeZusatzziffer" minOccurs="0"/>
 *         &lt;element name="postleitzahl" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Postleitzahl"/>
 *         &lt;element name="stockwerkswohnungsnummer" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Stockwerkswohnungsnummer" minOccurs="0"/>
 *         &lt;element name="strasse" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Strasse"/>
 *         &lt;element name="teilnummerDerHausnummer" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.TeilnummerDerHausnummer" minOccurs="0"/>
 *         &lt;element name="wohnort" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Wohnort"/>
 *         &lt;element name="wohnortFruehererGemeindename" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.WohnortFruehererGemeindename" minOccurs="0"/>
 *         &lt;element name="wohnungsinhaber" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Wohnungsinhaber" minOccurs="0"/>
 *         &lt;element name="zusatzangaben" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Zusatzangaben" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalischeInlandsanschrift.Basis")
@XmlSeeAlso({
    PostalischeInlandsanschriftGebaeudeanschrift.class
})
public class PostalischeInlandsanschriftBasis
    extends Meldeanschrift
{


}
