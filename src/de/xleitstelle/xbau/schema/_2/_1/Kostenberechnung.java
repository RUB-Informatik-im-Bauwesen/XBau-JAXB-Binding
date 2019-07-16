//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * [nd]
 * 
 * <p>Java-Klasse für Kostenberechnung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Kostenberechnung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gebuehrenposition" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gebuehrenordnung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *                   &lt;element name="gebuehrentatbestand" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *                   &lt;element name="position" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Position"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="auslagenposition" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="position" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Position"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="summe" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kostenberechnung", propOrder = {
    "gebuehrenposition",
    "auslagenposition",
    "summe"
})
public class Kostenberechnung {

    protected List<Kostenberechnung.Gebuehrenposition> gebuehrenposition;
    protected List<Kostenberechnung.Auslagenposition> auslagenposition;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger summe;

    /**
     * Gets the value of the gebuehrenposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gebuehrenposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGebuehrenposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kostenberechnung.Gebuehrenposition }
     * 
     * 
     */
    public List<Kostenberechnung.Gebuehrenposition> getGebuehrenposition() {
        if (gebuehrenposition == null) {
            gebuehrenposition = new ArrayList<Kostenberechnung.Gebuehrenposition>();
        }
        return this.gebuehrenposition;
    }

    /**
     * Gets the value of the auslagenposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auslagenposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuslagenposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kostenberechnung.Auslagenposition }
     * 
     * 
     */
    public List<Kostenberechnung.Auslagenposition> getAuslagenposition() {
        if (auslagenposition == null) {
            auslagenposition = new ArrayList<Kostenberechnung.Auslagenposition>();
        }
        return this.auslagenposition;
    }

    /**
     * Ruft den Wert der summe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSumme() {
        return summe;
    }

    /**
     * Legt den Wert der summe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSumme(BigInteger value) {
        this.summe = value;
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
     *         &lt;element name="position" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Position"/>
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
        "position"
    })
    public static class Auslagenposition {

        @XmlElement(required = true)
        protected Position position;

        /**
         * Ruft den Wert der position-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Position }
         *     
         */
        public Position getPosition() {
            return position;
        }

        /**
         * Legt den Wert der position-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Position }
         *     
         */
        public void setPosition(Position value) {
            this.position = value;
        }

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
     *         &lt;element name="gebuehrenordnung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
     *         &lt;element name="gebuehrentatbestand" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
     *         &lt;element name="position" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Position"/>
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
        "gebuehrenordnung",
        "gebuehrentatbestand",
        "position"
    })
    public static class Gebuehrenposition {

        @XmlElement(required = true)
        protected String gebuehrenordnung;
        @XmlElement(required = true)
        protected String gebuehrentatbestand;
        @XmlElement(required = true)
        protected Position position;

        /**
         * Ruft den Wert der gebuehrenordnung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGebuehrenordnung() {
            return gebuehrenordnung;
        }

        /**
         * Legt den Wert der gebuehrenordnung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGebuehrenordnung(String value) {
            this.gebuehrenordnung = value;
        }

        /**
         * Ruft den Wert der gebuehrentatbestand-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGebuehrentatbestand() {
            return gebuehrentatbestand;
        }

        /**
         * Legt den Wert der gebuehrentatbestand-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGebuehrentatbestand(String value) {
            this.gebuehrentatbestand = value;
        }

        /**
         * Ruft den Wert der position-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Position }
         *     
         */
        public Position getPosition() {
            return position;
        }

        /**
         * Legt den Wert der position-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Position }
         *     
         */
        public void setPosition(Position value) {
            this.position = value;
        }

    }

}
