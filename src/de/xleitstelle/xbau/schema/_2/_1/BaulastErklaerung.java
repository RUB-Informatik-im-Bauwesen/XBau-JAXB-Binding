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
 * Dieser Typ beinhaltet die Daten zu Anlass und Inhalt einer Baulasterklärung.
 * 
 * <p>Java-Klasse für BaulastErklaerung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaulastErklaerung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anlass" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
 *         &lt;element name="beschreibung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
 *         &lt;element name="sachverhalt" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="baulastgegenstand" type="{http://www.xleitstelle.de/xbau/schema/2/1/}GeoreferenzierteLage"/>
 *                   &lt;element name="beschreibung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaulastErklaerung", propOrder = {
    "anlass",
    "beschreibung",
    "sachverhalt"
})
public class BaulastErklaerung {

    @XmlElement(required = true)
    protected Text anlass;
    @XmlElement(required = true)
    protected Text beschreibung;
    @XmlElement(required = true)
    protected List<BaulastErklaerung.Sachverhalt> sachverhalt;

    /**
     * Ruft den Wert der anlass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getAnlass() {
        return anlass;
    }

    /**
     * Legt den Wert der anlass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setAnlass(Text value) {
        this.anlass = value;
    }

    /**
     * Ruft den Wert der beschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getBeschreibung() {
        return beschreibung;
    }

    /**
     * Legt den Wert der beschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setBeschreibung(Text value) {
        this.beschreibung = value;
    }

    /**
     * Gets the value of the sachverhalt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sachverhalt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSachverhalt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaulastErklaerung.Sachverhalt }
     * 
     * 
     */
    public List<BaulastErklaerung.Sachverhalt> getSachverhalt() {
        if (sachverhalt == null) {
            sachverhalt = new ArrayList<BaulastErklaerung.Sachverhalt>();
        }
        return this.sachverhalt;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="baulastgegenstand" type="{http://www.xleitstelle.de/xbau/schema/2/1/}GeoreferenzierteLage"/>
     *         &lt;element name="beschreibung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "baulastgegenstand",
        "beschreibung"
    })
    public static class Sachverhalt {

        @XmlElement(required = true)
        protected GeoreferenzierteLage baulastgegenstand;
        @XmlElement(required = true)
        protected Text beschreibung;

        /**
         * Ruft den Wert der baulastgegenstand-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link GeoreferenzierteLage }
         *     
         */
        public GeoreferenzierteLage getBaulastgegenstand() {
            return baulastgegenstand;
        }

        /**
         * Legt den Wert der baulastgegenstand-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link GeoreferenzierteLage }
         *     
         */
        public void setBaulastgegenstand(GeoreferenzierteLage value) {
            this.baulastgegenstand = value;
        }

        /**
         * Ruft den Wert der beschreibung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Text }
         *     
         */
        public Text getBeschreibung() {
            return beschreibung;
        }

        /**
         * Legt den Wert der beschreibung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Text }
         *     
         */
        public void setBeschreibung(Text value) {
            this.beschreibung = value;
        }

    }

}
