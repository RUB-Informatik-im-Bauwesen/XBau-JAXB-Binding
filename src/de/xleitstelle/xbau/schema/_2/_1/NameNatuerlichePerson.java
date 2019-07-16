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
 * Der Name einer Person ist eine Benennung dieser Person, die dazu dient, diese Person von anderen Personen zu unterscheiden.
 * 
 * <p>Java-Klasse für NameNatuerlichePerson complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NameNatuerlichePerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titel" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="anrede" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *         &lt;element name="familienname" type="{http://www.xleitstelle.de/xbau/schema/2/1/}AllgemeinerName"/>
 *         &lt;element name="vorname" type="{http://www.xleitstelle.de/xbau/schema/2/1/}AllgemeinerName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameNatuerlichePerson", propOrder = {
    "titel",
    "anrede",
    "familienname",
    "vorname"
})
public class NameNatuerlichePerson {

    protected String titel;
    @XmlElement(required = true)
    protected String anrede;
    @XmlElement(required = true)
    protected AllgemeinerName familienname;
    @XmlElement(required = true)
    protected AllgemeinerName vorname;

    /**
     * Ruft den Wert der titel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Legt den Wert der titel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Ruft den Wert der anrede-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnrede() {
        return anrede;
    }

    /**
     * Legt den Wert der anrede-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnrede(String value) {
        this.anrede = value;
    }

    /**
     * Ruft den Wert der familienname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllgemeinerName }
     *     
     */
    public AllgemeinerName getFamilienname() {
        return familienname;
    }

    /**
     * Legt den Wert der familienname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllgemeinerName }
     *     
     */
    public void setFamilienname(AllgemeinerName value) {
        this.familienname = value;
    }

    /**
     * Ruft den Wert der vorname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllgemeinerName }
     *     
     */
    public AllgemeinerName getVorname() {
        return vorname;
    }

    /**
     * Legt den Wert der vorname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllgemeinerName }
     *     
     */
    public void setVorname(AllgemeinerName value) {
        this.vorname = value;
    }

}
