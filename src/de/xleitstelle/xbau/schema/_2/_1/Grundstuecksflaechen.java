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
 * Dieser Typ fasst Angaben zu den Grundstücksflächen des Vorhabens zusammen.
 * 
 * <p>Java-Klasse für Grundstuecksflaechen complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Grundstuecksflaechen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bebauteGrundstuecksflaeche" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="nichtBebauteGrundstuecksflaeche" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="versiegelteFlaeche" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="spielUndFreizeitflaeche" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="flaecheDerNebenanlagen" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="flaecheDerGemeinschaftsanlagen" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="stellplaetzeUndDerenZufahrten" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grundstuecksflaechen", propOrder = {
    "bebauteGrundstuecksflaeche",
    "nichtBebauteGrundstuecksflaeche",
    "versiegelteFlaeche",
    "spielUndFreizeitflaeche",
    "flaecheDerNebenanlagen",
    "flaecheDerGemeinschaftsanlagen",
    "stellplaetzeUndDerenZufahrten"
})
public class Grundstuecksflaechen {

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger bebauteGrundstuecksflaeche;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nichtBebauteGrundstuecksflaeche;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger versiegelteFlaeche;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger spielUndFreizeitflaeche;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger flaecheDerNebenanlagen;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger flaecheDerGemeinschaftsanlagen;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger stellplaetzeUndDerenZufahrten;

    /**
     * Ruft den Wert der bebauteGrundstuecksflaeche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBebauteGrundstuecksflaeche() {
        return bebauteGrundstuecksflaeche;
    }

    /**
     * Legt den Wert der bebauteGrundstuecksflaeche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBebauteGrundstuecksflaeche(BigInteger value) {
        this.bebauteGrundstuecksflaeche = value;
    }

    /**
     * Ruft den Wert der nichtBebauteGrundstuecksflaeche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNichtBebauteGrundstuecksflaeche() {
        return nichtBebauteGrundstuecksflaeche;
    }

    /**
     * Legt den Wert der nichtBebauteGrundstuecksflaeche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNichtBebauteGrundstuecksflaeche(BigInteger value) {
        this.nichtBebauteGrundstuecksflaeche = value;
    }

    /**
     * Ruft den Wert der versiegelteFlaeche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersiegelteFlaeche() {
        return versiegelteFlaeche;
    }

    /**
     * Legt den Wert der versiegelteFlaeche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersiegelteFlaeche(BigInteger value) {
        this.versiegelteFlaeche = value;
    }

    /**
     * Ruft den Wert der spielUndFreizeitflaeche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpielUndFreizeitflaeche() {
        return spielUndFreizeitflaeche;
    }

    /**
     * Legt den Wert der spielUndFreizeitflaeche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpielUndFreizeitflaeche(BigInteger value) {
        this.spielUndFreizeitflaeche = value;
    }

    /**
     * Ruft den Wert der flaecheDerNebenanlagen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlaecheDerNebenanlagen() {
        return flaecheDerNebenanlagen;
    }

    /**
     * Legt den Wert der flaecheDerNebenanlagen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlaecheDerNebenanlagen(BigInteger value) {
        this.flaecheDerNebenanlagen = value;
    }

    /**
     * Ruft den Wert der flaecheDerGemeinschaftsanlagen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlaecheDerGemeinschaftsanlagen() {
        return flaecheDerGemeinschaftsanlagen;
    }

    /**
     * Legt den Wert der flaecheDerGemeinschaftsanlagen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlaecheDerGemeinschaftsanlagen(BigInteger value) {
        this.flaecheDerGemeinschaftsanlagen = value;
    }

    /**
     * Ruft den Wert der stellplaetzeUndDerenZufahrten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStellplaetzeUndDerenZufahrten() {
        return stellplaetzeUndDerenZufahrten;
    }

    /**
     * Legt den Wert der stellplaetzeUndDerenZufahrten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStellplaetzeUndDerenZufahrten(BigInteger value) {
        this.stellplaetzeUndDerenZufahrten = value;
    }

}
