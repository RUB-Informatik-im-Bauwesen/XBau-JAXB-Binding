//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ fasst die städtebaulichen Kennzahlen des Vorhabens zusammen.
 * 
 * <p>Java-Klasse für StaedtebaulicheKennzahlen complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StaedtebaulicheKennzahlen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geschossflaechenzahl" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="grundflaechenzahl" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="baumassenzahl" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaedtebaulicheKennzahlen", propOrder = {
    "geschossflaechenzahl",
    "grundflaechenzahl",
    "baumassenzahl"
})
public class StaedtebaulicheKennzahlen {

    protected Short geschossflaechenzahl;
    protected Short grundflaechenzahl;
    protected Short baumassenzahl;

    /**
     * Ruft den Wert der geschossflaechenzahl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGeschossflaechenzahl() {
        return geschossflaechenzahl;
    }

    /**
     * Legt den Wert der geschossflaechenzahl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGeschossflaechenzahl(Short value) {
        this.geschossflaechenzahl = value;
    }

    /**
     * Ruft den Wert der grundflaechenzahl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGrundflaechenzahl() {
        return grundflaechenzahl;
    }

    /**
     * Legt den Wert der grundflaechenzahl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGrundflaechenzahl(Short value) {
        this.grundflaechenzahl = value;
    }

    /**
     * Ruft den Wert der baumassenzahl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBaumassenzahl() {
        return baumassenzahl;
    }

    /**
     * Legt den Wert der baumassenzahl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBaumassenzahl(Short value) {
        this.baumassenzahl = value;
    }

}
