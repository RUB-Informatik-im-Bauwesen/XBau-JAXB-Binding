//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.18 um 07:55:25 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ beinhaltet die Parameter für das Maß der baulichen Nutzung.
 * 
 * <p>Java-Klasse für BaulicheNutzungMass complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BaulicheNutzungMass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hoeheDerBaulichenAnlage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="anzahlVollgeschosse" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="grundflaechenDerBaulichenAnlage" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="geschossflaeche" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="baumasse" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="verkaufsflaeche" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="grundstuecksflaechen" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Grundstuecksflaechen" minOccurs="0"/>
 *         &lt;element name="staedtebaulicheKennzahlen" type="{http://www.xleitstelle.de/xbau/schema/2/1/}StaedtebaulicheKennzahlen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kennzahlen" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Kennzahlen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nutzungseinheiten" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Nutzungseinheiten" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaulicheNutzungMass", propOrder = {
    "hoeheDerBaulichenAnlage",
    "anzahlVollgeschosse",
    "grundflaechenDerBaulichenAnlage",
    "geschossflaeche",
    "baumasse",
    "verkaufsflaeche",
    "grundstuecksflaechen",
    "staedtebaulicheKennzahlen",
    "kennzahlen",
    "nutzungseinheiten"
})
public class BaulicheNutzungMass {

    protected Float hoeheDerBaulichenAnlage;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger anzahlVollgeschosse;
    protected Float grundflaechenDerBaulichenAnlage;
    protected Float geschossflaeche;
    protected Float baumasse;
    protected Float verkaufsflaeche;
    protected Grundstuecksflaechen grundstuecksflaechen;
    protected List<StaedtebaulicheKennzahlen> staedtebaulicheKennzahlen;
    protected List<Kennzahlen> kennzahlen;
    protected Nutzungseinheiten nutzungseinheiten;

    /**
     * Ruft den Wert der hoeheDerBaulichenAnlage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHoeheDerBaulichenAnlage() {
        return hoeheDerBaulichenAnlage;
    }

    /**
     * Legt den Wert der hoeheDerBaulichenAnlage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHoeheDerBaulichenAnlage(Float value) {
        this.hoeheDerBaulichenAnlage = value;
    }

    /**
     * Ruft den Wert der anzahlVollgeschosse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnzahlVollgeschosse() {
        return anzahlVollgeschosse;
    }

    /**
     * Legt den Wert der anzahlVollgeschosse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnzahlVollgeschosse(BigInteger value) {
        this.anzahlVollgeschosse = value;
    }

    /**
     * Ruft den Wert der grundflaechenDerBaulichenAnlage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGrundflaechenDerBaulichenAnlage() {
        return grundflaechenDerBaulichenAnlage;
    }

    /**
     * Legt den Wert der grundflaechenDerBaulichenAnlage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGrundflaechenDerBaulichenAnlage(Float value) {
        this.grundflaechenDerBaulichenAnlage = value;
    }

    /**
     * Ruft den Wert der geschossflaeche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGeschossflaeche() {
        return geschossflaeche;
    }

    /**
     * Legt den Wert der geschossflaeche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGeschossflaeche(Float value) {
        this.geschossflaeche = value;
    }

    /**
     * Ruft den Wert der baumasse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBaumasse() {
        return baumasse;
    }

    /**
     * Legt den Wert der baumasse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBaumasse(Float value) {
        this.baumasse = value;
    }

    /**
     * Ruft den Wert der verkaufsflaeche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVerkaufsflaeche() {
        return verkaufsflaeche;
    }

    /**
     * Legt den Wert der verkaufsflaeche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVerkaufsflaeche(Float value) {
        this.verkaufsflaeche = value;
    }

    /**
     * Ruft den Wert der grundstuecksflaechen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Grundstuecksflaechen }
     *     
     */
    public Grundstuecksflaechen getGrundstuecksflaechen() {
        return grundstuecksflaechen;
    }

    /**
     * Legt den Wert der grundstuecksflaechen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Grundstuecksflaechen }
     *     
     */
    public void setGrundstuecksflaechen(Grundstuecksflaechen value) {
        this.grundstuecksflaechen = value;
    }

    /**
     * Gets the value of the staedtebaulicheKennzahlen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staedtebaulicheKennzahlen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaedtebaulicheKennzahlen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaedtebaulicheKennzahlen }
     * 
     * 
     */
    public List<StaedtebaulicheKennzahlen> getStaedtebaulicheKennzahlen() {
        if (staedtebaulicheKennzahlen == null) {
            staedtebaulicheKennzahlen = new ArrayList<StaedtebaulicheKennzahlen>();
        }
        return this.staedtebaulicheKennzahlen;
    }

    /**
     * Gets the value of the kennzahlen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kennzahlen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKennzahlen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kennzahlen }
     * 
     * 
     */
    public List<Kennzahlen> getKennzahlen() {
        if (kennzahlen == null) {
            kennzahlen = new ArrayList<Kennzahlen>();
        }
        return this.kennzahlen;
    }

    /**
     * Ruft den Wert der nutzungseinheiten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Nutzungseinheiten }
     *     
     */
    public Nutzungseinheiten getNutzungseinheiten() {
        return nutzungseinheiten;
    }

    /**
     * Legt den Wert der nutzungseinheiten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Nutzungseinheiten }
     *     
     */
    public void setNutzungseinheiten(Nutzungseinheiten value) {
        this.nutzungseinheiten = value;
    }

}
