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
 * Dieser Typ beinhaltet die Parameter einer beantragten Erleichterung, die der Bauaufsichtsbehörde zur Genehmigung vorgelegt werden soll.
 * 
 * <p>Java-Klasse für ErleichterungAngefragt complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ErleichterungAngefragt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gegenstand" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.ErleichterungGegenstand"/>
 *         &lt;element name="beschreibung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
 *         &lt;element name="begruendung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErleichterungAngefragt", propOrder = {
    "gegenstand",
    "beschreibung",
    "begruendung"
})
public class ErleichterungAngefragt {

    @XmlElement(required = true)
    protected CodeErleichterungGegenstand gegenstand;
    @XmlElement(required = true)
    protected Text beschreibung;
    protected Text begruendung;

    /**
     * Ruft den Wert der gegenstand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeErleichterungGegenstand }
     *     
     */
    public CodeErleichterungGegenstand getGegenstand() {
        return gegenstand;
    }

    /**
     * Legt den Wert der gegenstand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeErleichterungGegenstand }
     *     
     */
    public void setGegenstand(CodeErleichterungGegenstand value) {
        this.gegenstand = value;
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

}
