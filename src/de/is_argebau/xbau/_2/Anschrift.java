//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package de.is_argebau.xbau._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Eine Anschrift beschreibt einen Ort mit den klassischen Ordnungsbegriffen wie Orts- und Straßennamen sowie ergänzenden Informationen wie Ortsteil und Postfach.
 * 
 * <p>Java class for Anschrift complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Anschrift">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strasse" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="hausnummer" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="postfach" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="postleitzahl" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="ort" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="wohnungsgeber" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="zusatz" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="staat" type="{http://www.is-argebau.de/xbau/2}Staat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Anschrift", propOrder = {
    "strasse",
    "hausnummer",
    "postfach",
    "postleitzahl",
    "ort",
    "wohnungsgeber",
    "zusatz",
    "staat"
})
@XmlSeeAlso({
    AnschriftBaugrundstueck.class
})
public class Anschrift {

    protected String strasse;
    protected String hausnummer;
    protected String postfach;
    protected String postleitzahl;
    protected String ort;
    protected String wohnungsgeber;
    protected String zusatz;
    protected Staat staat;

    /**
     * Gets the value of the strasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * Sets the value of the strasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrasse(String value) {
        this.strasse = value;
    }

    /**
     * Gets the value of the hausnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHausnummer() {
        return hausnummer;
    }

    /**
     * Sets the value of the hausnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausnummer(String value) {
        this.hausnummer = value;
    }

    /**
     * Gets the value of the postfach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostfach() {
        return postfach;
    }

    /**
     * Sets the value of the postfach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostfach(String value) {
        this.postfach = value;
    }

    /**
     * Gets the value of the postleitzahl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
     * Sets the value of the postleitzahl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostleitzahl(String value) {
        this.postleitzahl = value;
    }

    /**
     * Gets the value of the ort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the value of the ort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Gets the value of the wohnungsgeber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnungsgeber() {
        return wohnungsgeber;
    }

    /**
     * Sets the value of the wohnungsgeber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnungsgeber(String value) {
        this.wohnungsgeber = value;
    }

    /**
     * Gets the value of the zusatz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZusatz() {
        return zusatz;
    }

    /**
     * Sets the value of the zusatz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatz(String value) {
        this.zusatz = value;
    }

    /**
     * Gets the value of the staat property.
     * 
     * @return
     *     possible object is
     *     {@link Staat }
     *     
     */
    public Staat getStaat() {
        return staat;
    }

    /**
     * Sets the value of the staat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staat }
     *     
     */
    public void setStaat(Staat value) {
        this.staat = value;
    }

}