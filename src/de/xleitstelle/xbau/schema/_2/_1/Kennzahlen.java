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
 * Dieser Typ deckt weitere Kennzahlen des Vorhabens (neben den städtebaulichen Kennzahlen) ab.
 * 
 * <p>Java-Klasse für Kennzahlen complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Kennzahlen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="erforderlicheStellplaetze" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="geplanteStellplaetze" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kennzahlen", propOrder = {
    "erforderlicheStellplaetze",
    "geplanteStellplaetze"
})
public class Kennzahlen {

    protected Short erforderlicheStellplaetze;
    protected Short geplanteStellplaetze;

    /**
     * Ruft den Wert der erforderlicheStellplaetze-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getErforderlicheStellplaetze() {
        return erforderlicheStellplaetze;
    }

    /**
     * Legt den Wert der erforderlicheStellplaetze-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setErforderlicheStellplaetze(Short value) {
        this.erforderlicheStellplaetze = value;
    }

    /**
     * Ruft den Wert der geplanteStellplaetze-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGeplanteStellplaetze() {
        return geplanteStellplaetze;
    }

    /**
     * Legt den Wert der geplanteStellplaetze-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGeplanteStellplaetze(Short value) {
        this.geplanteStellplaetze = value;
    }

}
