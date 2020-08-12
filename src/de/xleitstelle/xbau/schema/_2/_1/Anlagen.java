//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ dient dazu aufzunehmen: (a) in jedem Fall die Angaben (Metadaten) zu den Anlagen eines Antrags und (b) optional diese Anlagen (Primärdokumente) selbst. Anlagen zum Antrag sind in erster Linie Bauvorlagen, in vielen Fällen zusätzlich weitere Anlagen (wie Nachweise und ergänzende Dokumentationen).
 * 
 * <p>Java-Klasse für Anlagen complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Anlagen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anlage" type="{http://www.xleitstelle.de/xbau/schema/2/1/}AnlageBauvorlage" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Anlagen", propOrder = {
    "anlage"
})
public class Anlagen {

    @XmlElement(required = true)
    protected List<AnlageBauvorlage> anlage;

    /**
     * Gets the value of the anlage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anlage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnlage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnlageBauvorlage }
     * 
     * 
     */
    public List<AnlageBauvorlage> getAnlage() {
        if (anlage == null) {
            anlage = new ArrayList<AnlageBauvorlage>();
        }
        return this.anlage;
    }

}
