//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ fasst Angaben zu den Nutzungseinheiten des Vorhabens zusammen.
 * 
 * <p>Java-Klasse für Nutzungseinheiten complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Nutzungseinheiten">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wohneinheitenGesamt" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="wohneinheitenEigentumswohnungen" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="wohneinheitenMietwohnungen" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="wohneinheitenSozialwohnungen" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="wohnungenGewerblich" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="wohnungenFreiberuflich" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="nutzungseinheitenGewerbe" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nutzungseinheiten", propOrder = {
    "wohneinheitenGesamt",
    "wohneinheitenEigentumswohnungen",
    "wohneinheitenMietwohnungen",
    "wohneinheitenSozialwohnungen",
    "wohnungenGewerblich",
    "wohnungenFreiberuflich",
    "nutzungseinheitenGewerbe"
})
public class Nutzungseinheiten {

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wohneinheitenGesamt;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wohneinheitenEigentumswohnungen;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wohneinheitenMietwohnungen;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wohneinheitenSozialwohnungen;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wohnungenGewerblich;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger wohnungenFreiberuflich;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nutzungseinheitenGewerbe;

    /**
     * Ruft den Wert der wohneinheitenGesamt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWohneinheitenGesamt() {
        return wohneinheitenGesamt;
    }

    /**
     * Legt den Wert der wohneinheitenGesamt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWohneinheitenGesamt(BigInteger value) {
        this.wohneinheitenGesamt = value;
    }

    /**
     * Ruft den Wert der wohneinheitenEigentumswohnungen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWohneinheitenEigentumswohnungen() {
        return wohneinheitenEigentumswohnungen;
    }

    /**
     * Legt den Wert der wohneinheitenEigentumswohnungen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWohneinheitenEigentumswohnungen(BigInteger value) {
        this.wohneinheitenEigentumswohnungen = value;
    }

    /**
     * Ruft den Wert der wohneinheitenMietwohnungen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWohneinheitenMietwohnungen() {
        return wohneinheitenMietwohnungen;
    }

    /**
     * Legt den Wert der wohneinheitenMietwohnungen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWohneinheitenMietwohnungen(BigInteger value) {
        this.wohneinheitenMietwohnungen = value;
    }

    /**
     * Ruft den Wert der wohneinheitenSozialwohnungen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWohneinheitenSozialwohnungen() {
        return wohneinheitenSozialwohnungen;
    }

    /**
     * Legt den Wert der wohneinheitenSozialwohnungen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWohneinheitenSozialwohnungen(BigInteger value) {
        this.wohneinheitenSozialwohnungen = value;
    }

    /**
     * Ruft den Wert der wohnungenGewerblich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWohnungenGewerblich() {
        return wohnungenGewerblich;
    }

    /**
     * Legt den Wert der wohnungenGewerblich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWohnungenGewerblich(BigInteger value) {
        this.wohnungenGewerblich = value;
    }

    /**
     * Ruft den Wert der wohnungenFreiberuflich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWohnungenFreiberuflich() {
        return wohnungenFreiberuflich;
    }

    /**
     * Legt den Wert der wohnungenFreiberuflich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWohnungenFreiberuflich(BigInteger value) {
        this.wohnungenFreiberuflich = value;
    }

    /**
     * Ruft den Wert der nutzungseinheitenGewerbe-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNutzungseinheitenGewerbe() {
        return nutzungseinheitenGewerbe;
    }

    /**
     * Legt den Wert der nutzungseinheitenGewerbe-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNutzungseinheitenGewerbe(BigInteger value) {
        this.nutzungseinheitenGewerbe = value;
    }

}
