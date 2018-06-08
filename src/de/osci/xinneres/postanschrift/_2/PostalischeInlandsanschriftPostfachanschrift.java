//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package de.osci.xinneres.postanschrift._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Datentyp beinhaltet die Angaben für die Adressierung im Inland, soweit es sich um eine Postfachanschrift (und nicht um eine Gebäudeanschrift) handelt.
 * 
 * <p>Java class for PostalischeInlandsanschrift.Postfachanschrift complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalischeInlandsanschrift.Postfachanschrift">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postfach" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="wohnort" type="{http://www.osci.de/xinneres/meldeanschrift/2}Meldeanschrift.Wohnort"/>
 *         &lt;element name="postleitzahl" type="{http://www.osci.de/xinneres/meldeanschrift/2}Meldeanschrift.Postleitzahl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalischeInlandsanschrift.Postfachanschrift", propOrder = {
    "postfach",
    "wohnort",
    "postleitzahl"
})
public class PostalischeInlandsanschriftPostfachanschrift {

    protected String postfach;
    @XmlElement(required = true)
    protected String wohnort;
    @XmlElement(required = true)
    protected String postleitzahl;

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
     * Gets the value of the wohnort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnort() {
        return wohnort;
    }

    /**
     * Sets the value of the wohnort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnort(String value) {
        this.wohnort = value;
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

}