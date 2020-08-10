//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.18 um 07:55:25 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="bebauteGrundstuecksflaeche" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="nichtBebauteGrundstuecksflaeche" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="versiegelteFlaeche" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="spielUndFreizeitflaeche" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="flaecheDerNebenanlagen" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="flaecheDerGemeinschaftsanlagen" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="stellplaetzeUndDerenZufahrten" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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

    protected Float bebauteGrundstuecksflaeche;
    protected Float nichtBebauteGrundstuecksflaeche;
    protected Float versiegelteFlaeche;
    protected Float spielUndFreizeitflaeche;
    protected Float flaecheDerNebenanlagen;
    protected Float flaecheDerGemeinschaftsanlagen;
    protected Float stellplaetzeUndDerenZufahrten;

    /**
     * Ruft den Wert der bebauteGrundstuecksflaeche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBebauteGrundstuecksflaeche() {
        return bebauteGrundstuecksflaeche;
    }

    /**
     * Legt den Wert der bebauteGrundstuecksflaeche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBebauteGrundstuecksflaeche(Float value) {
        this.bebauteGrundstuecksflaeche = value;
    }

    /**
     * Ruft den Wert der nichtBebauteGrundstuecksflaeche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNichtBebauteGrundstuecksflaeche() {
        return nichtBebauteGrundstuecksflaeche;
    }

    /**
     * Legt den Wert der nichtBebauteGrundstuecksflaeche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNichtBebauteGrundstuecksflaeche(Float value) {
        this.nichtBebauteGrundstuecksflaeche = value;
    }

    /**
     * Ruft den Wert der versiegelteFlaeche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVersiegelteFlaeche() {
        return versiegelteFlaeche;
    }

    /**
     * Legt den Wert der versiegelteFlaeche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVersiegelteFlaeche(Float value) {
        this.versiegelteFlaeche = value;
    }

    /**
     * Ruft den Wert der spielUndFreizeitflaeche-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpielUndFreizeitflaeche() {
        return spielUndFreizeitflaeche;
    }

    /**
     * Legt den Wert der spielUndFreizeitflaeche-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpielUndFreizeitflaeche(Float value) {
        this.spielUndFreizeitflaeche = value;
    }

    /**
     * Ruft den Wert der flaecheDerNebenanlagen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFlaecheDerNebenanlagen() {
        return flaecheDerNebenanlagen;
    }

    /**
     * Legt den Wert der flaecheDerNebenanlagen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFlaecheDerNebenanlagen(Float value) {
        this.flaecheDerNebenanlagen = value;
    }

    /**
     * Ruft den Wert der flaecheDerGemeinschaftsanlagen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFlaecheDerGemeinschaftsanlagen() {
        return flaecheDerGemeinschaftsanlagen;
    }

    /**
     * Legt den Wert der flaecheDerGemeinschaftsanlagen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFlaecheDerGemeinschaftsanlagen(Float value) {
        this.flaecheDerGemeinschaftsanlagen = value;
    }

    /**
     * Ruft den Wert der stellplaetzeUndDerenZufahrten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStellplaetzeUndDerenZufahrten() {
        return stellplaetzeUndDerenZufahrten;
    }

    /**
     * Legt den Wert der stellplaetzeUndDerenZufahrten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStellplaetzeUndDerenZufahrten(Float value) {
        this.stellplaetzeUndDerenZufahrten = value;
    }

}
