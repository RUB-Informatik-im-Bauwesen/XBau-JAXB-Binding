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
 * Falls die Abweichung eines Bauvorhabens von öffentlich-rechtlichen Bestimmungen bearbeitet (und damit zugelassen bzw. nicht zugelassen) wurde, dient dieser Typ im entsprechenden Kontext zur Übermittlung der relevanten Parameter.
 * 
 * <p>Java-Klasse für AbweichungBearbeitet complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbweichungBearbeitet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="istZugelassen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="art" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.AbweichungArt"/>
 *         &lt;element name="vorschrift" type="{http://www.xleitstelle.de/xbau/schema/2/1/}TextFormatiert"/>
 *         &lt;element name="begruendung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}TextFormatiert" minOccurs="0"/>
 *         &lt;element name="nebenbestimmung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}TextFormatiert" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbweichungBearbeitet", propOrder = {
    "istZugelassen",
    "art",
    "vorschrift",
    "begruendung",
    "nebenbestimmung"
})
public class AbweichungBearbeitet {

    protected boolean istZugelassen;
    @XmlElement(required = true)
    protected CodeAbweichungArt art;
    @XmlElement(required = true)
    protected TextFormatiert vorschrift;
    protected TextFormatiert begruendung;
    protected TextFormatiert nebenbestimmung;

    /**
     * Ruft den Wert der istZugelassen-Eigenschaft ab.
     * 
     */
    public boolean isIstZugelassen() {
        return istZugelassen;
    }

    /**
     * Legt den Wert der istZugelassen-Eigenschaft fest.
     * 
     */
    public void setIstZugelassen(boolean value) {
        this.istZugelassen = value;
    }

    /**
     * Ruft den Wert der art-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeAbweichungArt }
     *     
     */
    public CodeAbweichungArt getArt() {
        return art;
    }

    /**
     * Legt den Wert der art-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeAbweichungArt }
     *     
     */
    public void setArt(CodeAbweichungArt value) {
        this.art = value;
    }

    /**
     * Ruft den Wert der vorschrift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextFormatiert }
     *     
     */
    public TextFormatiert getVorschrift() {
        return vorschrift;
    }

    /**
     * Legt den Wert der vorschrift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextFormatiert }
     *     
     */
    public void setVorschrift(TextFormatiert value) {
        this.vorschrift = value;
    }

    /**
     * Ruft den Wert der begruendung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextFormatiert }
     *     
     */
    public TextFormatiert getBegruendung() {
        return begruendung;
    }

    /**
     * Legt den Wert der begruendung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextFormatiert }
     *     
     */
    public void setBegruendung(TextFormatiert value) {
        this.begruendung = value;
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
