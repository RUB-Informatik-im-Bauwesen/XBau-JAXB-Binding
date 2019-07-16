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
 * Dieser Typ beinhaltet die Parameter, die eine Nebenbestimmung definieren.
 * 
 * <p>Java-Klasse für Nebenbestimmung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Nebenbestimmung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="art" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.NebenbestimmungArt"/>
 *         &lt;element name="rechtsbereich" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Rechtsbereich"/>
 *         &lt;element name="nebenbestimmung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}TextFormatiert"/>
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
    protected TextFormatiert nebenbestimmung;

    /**
     * Ruft den Wert der art-Eigenschaft ab.
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
     * Legt den Wert der art-Eigenschaft fest.
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
     * Ruft den Wert der rechtsbereich-Eigenschaft ab.
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
     * Legt den Wert der rechtsbereich-Eigenschaft fest.
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
     * Ruft den Wert der nebenbestimmung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextFormatiert }
     *     
     */
    public TextFormatiert getNebenbestimmung() {
        return nebenbestimmung;
    }

    /**
     * Legt den Wert der nebenbestimmung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextFormatiert }
     *     
     */
    public void setNebenbestimmung(TextFormatiert value) {
        this.nebenbestimmung = value;
    }

}
