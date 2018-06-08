//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package de.osci.xinneres.basisnachricht._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ realisiert die abstrakte Oberklasse für alle Nachrichten zwischen Behörden und anderen (öffentlichen) Stellen. Jede in den Fachstandards definierte konkrete Nachricht erbt von diesem Typ. Auf diese Weise wird für alle Nachrichten der Fachstandards eine einheitliche Grundstruktur gewährleistet.
 * Der Zusatz G2G ist die Abkürzung für den Begriff  government-to-government, also die Kommunikation zwischen staatlichen Einrichtungen.
 * 
 * <p>Java class for Nachricht.G2G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Nachricht.G2G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nachrichtenkopf" type="{http://www.osci.de/xinneres/basisnachricht/3}Nachrichtenkopf.G2G" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="produkt" use="required" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *       &lt;attribute name="produkthersteller" use="required" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *       &lt;attribute name="produktversion" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *       &lt;attribute name="standard" use="required" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *       &lt;attribute name="test" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *       &lt;attribute name="version" use="required" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nachricht.G2G", propOrder = {
    "nachrichtenkopf"
})
@XmlSeeAlso({
    de.is_argebau.xbau._2.NachrichtG2G.class
})
public abstract class NachrichtG2G {

    @XmlElement(required = true)
    protected NachrichtenkopfG2G nachrichtenkopf;
    @XmlAttribute(name = "produkt", required = true)
    protected String produkt;
    @XmlAttribute(name = "produkthersteller", required = true)
    protected String produkthersteller;
    @XmlAttribute(name = "produktversion")
    protected String produktversion;
    @XmlAttribute(name = "standard", required = true)
    protected String standard;
    @XmlAttribute(name = "test")
    protected String test;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the nachrichtenkopf property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtenkopfG2G }
     *     
     */
    public NachrichtenkopfG2G getNachrichtenkopf() {
        return nachrichtenkopf;
    }

    /**
     * Sets the value of the nachrichtenkopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtenkopfG2G }
     *     
     */
    public void setNachrichtenkopf(NachrichtenkopfG2G value) {
        this.nachrichtenkopf = value;
    }

    /**
     * Gets the value of the produkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdukt() {
        return produkt;
    }

    /**
     * Sets the value of the produkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdukt(String value) {
        this.produkt = value;
    }

    /**
     * Gets the value of the produkthersteller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdukthersteller() {
        return produkthersteller;
    }

    /**
     * Sets the value of the produkthersteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdukthersteller(String value) {
        this.produkthersteller = value;
    }

    /**
     * Gets the value of the produktversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduktversion() {
        return produktversion;
    }

    /**
     * Sets the value of the produktversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduktversion(String value) {
        this.produktversion = value;
    }

    /**
     * Gets the value of the standard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandard() {
        return standard;
    }

    /**
     * Sets the value of the standard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandard(String value) {
        this.standard = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTest(String value) {
        this.test = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}