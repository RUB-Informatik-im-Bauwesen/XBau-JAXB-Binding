//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Nachrichtenstruktur für die Kommunikation von Behörden mit Privaten.
 * 
 * <p>Java-Klasse für Nachricht.G2privat complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Nachricht.G2privat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nachrichtenkopf.G2privat" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Nachrichtenkopf.G2privat"/>
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
@XmlType(name = "Nachricht.G2privat", propOrder = {
    "nachrichtenkopfG2Privat"
})
@XmlSeeAlso({
    BaugenehmigungFormellePruefung0201 .class,
    BaugenehmigungBescheid0205 .class,
    BaugenehmigungAnhoerung0203 .class,
    BaugenehmigungGebuehrenbescheid0206 .class
})
public class NachrichtG2Privat {

    @XmlElement(name = "nachrichtenkopf.G2privat", required = true)
    protected NachrichtenkopfG2Privat nachrichtenkopfG2Privat;
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
     * Ruft den Wert der nachrichtenkopfG2Privat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtenkopfG2Privat }
     *     
     */
    public NachrichtenkopfG2Privat getNachrichtenkopfG2Privat() {
        return nachrichtenkopfG2Privat;
    }

    /**
     * Legt den Wert der nachrichtenkopfG2Privat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtenkopfG2Privat }
     *     
     */
    public void setNachrichtenkopfG2Privat(NachrichtenkopfG2Privat value) {
        this.nachrichtenkopfG2Privat = value;
    }

    /**
     * Ruft den Wert der produkt-Eigenschaft ab.
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
     * Legt den Wert der produkt-Eigenschaft fest.
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
     * Ruft den Wert der produkthersteller-Eigenschaft ab.
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
     * Legt den Wert der produkthersteller-Eigenschaft fest.
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
     * Ruft den Wert der produktversion-Eigenschaft ab.
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
     * Legt den Wert der produktversion-Eigenschaft fest.
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
     * Ruft den Wert der standard-Eigenschaft ab.
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
     * Legt den Wert der standard-Eigenschaft fest.
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
     * Ruft den Wert der test-Eigenschaft ab.
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
     * Legt den Wert der test-Eigenschaft fest.
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
     * Ruft den Wert der version-Eigenschaft ab.
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
     * Legt den Wert der version-Eigenschaft fest.
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
