//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package de.is_argebau.xbau._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ beinhaltet die Parameter, die eine Nebenbestimmung definieren.
 * 
 * <p>Java class for Nebenbestimmung complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Nebenbestimmung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="art" type="{http://www.is-argebau.de/xbau/2}Code.NebenbestimmungArt"/>
 *         &lt;element name="rechtsbereich" type="{http://www.is-argebau.de/xbau/2}Code.Rechtsbereich"/>
 *         &lt;element name="nebenbestimmung" type="{http://www.is-argebau.de/xbau/2}Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nebenbestimmung", propOrder = {
    "art",
    "rechtsbereich",
    "nebenbestimmung"
})
public class Nebenbestimmung {

    @XmlElement(required = true)
    protected CodeNebenbestimmungArt art;
    @XmlElement(required = true)
    protected CodeRechtsbereich rechtsbereich;
    @XmlElement(required = true)
    protected Text nebenbestimmung;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link CodeNebenbestimmungArt }
     *     
     */
    public CodeNebenbestimmungArt getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeNebenbestimmungArt }
     *     
     */
    public void setArt(CodeNebenbestimmungArt value) {
        this.art = value;
    }

    /**
     * Gets the value of the rechtsbereich property.
     * 
     * @return
     *     possible object is
     *     {@link CodeRechtsbereich }
     *     
     */
    public CodeRechtsbereich getRechtsbereich() {
        return rechtsbereich;
    }

    /**
     * Sets the value of the rechtsbereich property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeRechtsbereich }
     *     
     */
    public void setRechtsbereich(CodeRechtsbereich value) {
        this.rechtsbereich = value;
    }

    /**
     * Gets the value of the nebenbestimmung property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getNebenbestimmung() {
        return nebenbestimmung;
    }

    /**
     * Sets the value of the nebenbestimmung property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setNebenbestimmung(Text value) {
        this.nebenbestimmung = value;
    }

}