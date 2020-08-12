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
 * Dieser Typ beinhaltet die Parameter eines Gebührenbescheids der Bauaufsichtsbehörde. Es sind die Daten zu Gegenstand, Herleitung, Betrag und Bezahlung der Gebühren enthalten.
 * 
 * <p>Java-Klasse für Gebuehrenbescheid complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Gebuehrenbescheid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="istVorauszahlungsbescheid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="begruendung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
 *         &lt;element name="kostenberechnung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Kostenberechnung" minOccurs="0"/>
 *         &lt;element name="zahlungsdaten" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Zahlungsdaten" minOccurs="0"/>
 *         &lt;element name="rechtshelfsbelehrung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
 *         &lt;element name="informationVerspaetungszuschlag" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gebuehrenbescheid", propOrder = {
    "istVorauszahlungsbescheid",
    "begruendung",
    "kostenberechnung",
    "zahlungsdaten",
    "rechtshelfsbelehrung",
    "informationVerspaetungszuschlag"
})
public class Gebuehrenbescheid {

    protected boolean istVorauszahlungsbescheid;
    @XmlElement(required = true)
    protected Text begruendung;
    protected Kostenberechnung kostenberechnung;
    protected Zahlungsdaten zahlungsdaten;
    @XmlElement(required = true)
    protected Text rechtshelfsbelehrung;
    protected Text informationVerspaetungszuschlag;

    /**
     * Ruft den Wert der istVorauszahlungsbescheid-Eigenschaft ab.
     * 
     */
    public boolean isIstVorauszahlungsbescheid() {
        return istVorauszahlungsbescheid;
    }

    /**
     * Legt den Wert der istVorauszahlungsbescheid-Eigenschaft fest.
     * 
     */
    public void setIstVorauszahlungsbescheid(boolean value) {
        this.istVorauszahlungsbescheid = value;
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
     * Ruft den Wert der kostenberechnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Kostenberechnung }
     *     
     */
    public Kostenberechnung getKostenberechnung() {
        return kostenberechnung;
    }

    /**
     * Legt den Wert der kostenberechnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Kostenberechnung }
     *     
     */
    public void setKostenberechnung(Kostenberechnung value) {
        this.kostenberechnung = value;
    }

    /**
     * Ruft den Wert der zahlungsdaten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Zahlungsdaten }
     *     
     */
    public Zahlungsdaten getZahlungsdaten() {
        return zahlungsdaten;
    }

    /**
     * Legt den Wert der zahlungsdaten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Zahlungsdaten }
     *     
     */
    public void setZahlungsdaten(Zahlungsdaten value) {
        this.zahlungsdaten = value;
    }

    /**
     * Ruft den Wert der rechtshelfsbelehrung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getRechtshelfsbelehrung() {
        return rechtshelfsbelehrung;
    }

    /**
     * Legt den Wert der rechtshelfsbelehrung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setRechtshelfsbelehrung(Text value) {
        this.rechtshelfsbelehrung = value;
    }

    /**
     * Ruft den Wert der informationVerspaetungszuschlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getInformationVerspaetungszuschlag() {
        return informationVerspaetungszuschlag;
    }

    /**
     * Legt den Wert der informationVerspaetungszuschlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setInformationVerspaetungszuschlag(Text value) {
        this.informationVerspaetungszuschlag = value;
    }

}
