//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.22 um 08:23:44 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *   			Dieser Typ beinhaltet die Parameter einer Abweichung von
 *   			öffentlich-rechtlichen Bestimmungen, die der
 *   			Bauaufsichtsbehörde zur Zulassung vorgelegt wird.
 *   		
 * 
 * <p>Java-Klasse für AbweichungBeantragt complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbweichungBeantragt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="art" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.AbweichungArt"/>
 *         &lt;element name="vorschrift" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
 *         &lt;element name="beschreibung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
 *         &lt;element name="begruendung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
 *       &lt;/sequence>
 *       &lt;attribute name="referenz" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbweichungBeantragt", propOrder = {
    "art",
    "vorschrift",
    "beschreibung",
    "begruendung"
})
public class AbweichungBeantragt {

    @XmlElement(required = true)
    protected CodeAbweichungArt art;
    @XmlElement(required = true)
    protected Text vorschrift;
    @XmlElement(required = true)
    protected Text beschreibung;
    @XmlElement(required = true)
    protected Text begruendung;
    @XmlAttribute(name = "referenz")
    protected String referenz;

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
     *     {@link Text }
     *     
     */
    public Text getVorschrift() {
        return vorschrift;
    }

    /**
     * Legt den Wert der vorschrift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setVorschrift(Text value) {
        this.vorschrift = value;
    }

    /**
     * Ruft den Wert der beschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getBeschreibung() {
        return beschreibung;
    }

    /**
     * Legt den Wert der beschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setBeschreibung(Text value) {
        this.beschreibung = value;
    }

    /**
     * Ruft den Wert der begruendung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getBegruendung() {
        return begruendung;
    }

    /**
     * Legt den Wert der begruendung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setBegruendung(Text value) {
        this.begruendung = value;
    }

    /**
     * Ruft den Wert der referenz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenz() {
        return referenz;
    }

    /**
     * Legt den Wert der referenz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenz(String value) {
        this.referenz = value;
    }

}
