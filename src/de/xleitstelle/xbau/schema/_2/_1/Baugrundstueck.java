//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Das Baugrundstück ist der Ort der Baumaßnahme. Dieser kann aus mehreren Grundstücken im Sinne des Grundbuchs bestehen. Ein Grundstück kann aus mehreren Fluren bzw. Flurstücken bestehen.
 * 
 * <p>Java-Klasse für Baugrundstueck complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Baugrundstueck">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anschrift" type="{http://www.xleitstelle.de/xbau/schema/2/1/}AnschriftBaugrundstueck" minOccurs="0"/>
 *         &lt;element name="flurstueckkennzeichnung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}FlurstueckKennzeichnung"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Baugrundstueck", propOrder = {
    "anschrift",
    "flurstueckkennzeichnung"
})
public class Baugrundstueck {

    protected AnschriftBaugrundstueck anschrift;
    @XmlElement(required = true)
    protected FlurstueckKennzeichnung flurstueckkennzeichnung;

    /**
     * Ruft den Wert der anschrift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnschriftBaugrundstueck }
     *     
     */
    public AnschriftBaugrundstueck getAnschrift() {
        return anschrift;
    }

    /**
     * Legt den Wert der anschrift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnschriftBaugrundstueck }
     *     
     */
    public void setAnschrift(AnschriftBaugrundstueck value) {
        this.anschrift = value;
    }

    /**
     * Ruft den Wert der flurstueckkennzeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlurstueckKennzeichnung }
     *     
     */
    public FlurstueckKennzeichnung getFlurstueckkennzeichnung() {
        return flurstueckkennzeichnung;
    }

    /**
     * Legt den Wert der flurstueckkennzeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlurstueckKennzeichnung }
     *     
     */
    public void setFlurstueckkennzeichnung(FlurstueckKennzeichnung value) {
        this.flurstueckkennzeichnung = value;
    }

}
