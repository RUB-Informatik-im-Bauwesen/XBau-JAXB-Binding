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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Dieser Typ gestattet Eintragungen, um auf einen Antrag, einen Vorgang und ggf. auf eine Nachricht, die im Rahmen dieses Vorgangs gesendet worden ist, Bezug zu nehmen.
 * 
 * <p>Java-Klasse für Bezug complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Bezug">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenzAntragsteller" type="{http://www.osci.de/xinneres/basisnachricht/4}UUID"/>
 *         &lt;element name="vorgang" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *         &lt;element name="bezugNachricht" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Identifikation.Nachricht" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bezug", propOrder = {
    "referenzAntragsteller",
    "vorgang",
    "bezugNachricht"
})
public class Bezug {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String referenzAntragsteller;
    protected String vorgang;
    protected IdentifikationNachricht bezugNachricht;

    /**
     * Ruft den Wert der referenzAntragsteller-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenzAntragsteller() {
        return referenzAntragsteller;
    }

    /**
     * Legt den Wert der referenzAntragsteller-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenzAntragsteller(String value) {
        this.referenzAntragsteller = value;
    }

    /**
     * Ruft den Wert der vorgang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorgang() {
        return vorgang;
    }

    /**
     * Legt den Wert der vorgang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorgang(String value) {
        this.vorgang = value;
    }

    /**
     * Ruft den Wert der bezugNachricht-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentifikationNachricht }
     *     
     */
    public IdentifikationNachricht getBezugNachricht() {
        return bezugNachricht;
    }

    /**
     * Legt den Wert der bezugNachricht-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifikationNachricht }
     *     
     */
    public void setBezugNachricht(IdentifikationNachricht value) {
        this.bezugNachricht = value;
    }

}
