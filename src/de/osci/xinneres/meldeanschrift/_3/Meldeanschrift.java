//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.osci.xinneres.meldeanschrift._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.osci.xinneres.codes.gemeindeverzeichnis._2.CodeGemeindeVZAmtlicherGemeindeschluessel;
import de.osci.xinneres.postanschrift._3.PostalischeInlandsanschriftBasis;


/**
 * Dieser Datentyp repräsentiert die gemeinsamen fachlichen Vorgaben der drei Standardisierungsbereiche Meldewesen, Ausländerwesen und Personenstandswesen für eine inländische Meldeanschrift auf der Grundlage des DSMeld.
 * Hinweis zu Hausnummernbereichen: Der DSMeld kennt keine Hausnummernbereiche. In diesen Fällen ist nur das erste Element des Hausnummernbereichs im Feld hausnummer einzutragen. Das zweite Element des Hausnummernbereichs kann in diesem Datentyp nicht übermittelt werden.
 * 
 * <p>Java-Klasse für Meldeanschrift complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Meldeanschrift">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gemeindeschluessel" type="{http://www.osci.de/xinneres/codes/gemeindeverzeichnis/2}Code.GemeindeVZ.AmtlicherGemeindeschluessel" minOccurs="0"/>
 *         &lt;element name="hausnummer" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Hausnummer" minOccurs="0"/>
 *         &lt;element name="hausnummerBuchstabeZusatzziffer" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.HausnummerBuchstabeZusatzziffer" minOccurs="0"/>
 *         &lt;element name="postleitzahl" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Postleitzahl" minOccurs="0"/>
 *         &lt;element name="stockwerkswohnungsnummer" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Stockwerkswohnungsnummer" minOccurs="0"/>
 *         &lt;element name="strasse" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Strasse" minOccurs="0"/>
 *         &lt;element name="teilnummerDerHausnummer" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.TeilnummerDerHausnummer" minOccurs="0"/>
 *         &lt;element name="wohnort" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Wohnort" minOccurs="0"/>
 *         &lt;element name="wohnortFruehererGemeindename" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.WohnortFruehererGemeindename" minOccurs="0"/>
 *         &lt;element name="wohnungsinhaber" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Wohnungsinhaber" minOccurs="0"/>
 *         &lt;element name="zusatzangaben" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Zusatzangaben" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Meldeanschrift", propOrder = {
    "gemeindeschluessel",
    "hausnummer",
    "hausnummerBuchstabeZusatzziffer",
    "postleitzahl",
    "stockwerkswohnungsnummer",
    "strasse",
    "teilnummerDerHausnummer",
    "wohnort",
    "wohnortFruehererGemeindename",
    "wohnungsinhaber",
    "zusatzangaben"
})
@XmlSeeAlso({
    PostalischeInlandsanschriftBasis.class
})
public class Meldeanschrift {

    protected CodeGemeindeVZAmtlicherGemeindeschluessel gemeindeschluessel;
    protected String hausnummer;
    protected String hausnummerBuchstabeZusatzziffer;
    protected String postleitzahl;
    protected String stockwerkswohnungsnummer;
    protected String strasse;
    protected String teilnummerDerHausnummer;
    protected String wohnort;
    protected String wohnortFruehererGemeindename;
    protected String wohnungsinhaber;
    protected String zusatzangaben;

    /**
     * Ruft den Wert der gemeindeschluessel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeGemeindeVZAmtlicherGemeindeschluessel }
     *     
     */
    public CodeGemeindeVZAmtlicherGemeindeschluessel getGemeindeschluessel() {
        return gemeindeschluessel;
    }

    /**
     * Legt den Wert der gemeindeschluessel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGemeindeVZAmtlicherGemeindeschluessel }
     *     
     */
    public void setGemeindeschluessel(CodeGemeindeVZAmtlicherGemeindeschluessel value) {
        this.gemeindeschluessel = value;
    }

    /**
     * Ruft den Wert der hausnummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHausnummer() {
        return hausnummer;
    }

    /**
     * Legt den Wert der hausnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausnummer(String value) {
        this.hausnummer = value;
    }

    /**
     * Ruft den Wert der hausnummerBuchstabeZusatzziffer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHausnummerBuchstabeZusatzziffer() {
        return hausnummerBuchstabeZusatzziffer;
    }

    /**
     * Legt den Wert der hausnummerBuchstabeZusatzziffer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausnummerBuchstabeZusatzziffer(String value) {
        this.hausnummerBuchstabeZusatzziffer = value;
    }

    /**
     * Ruft den Wert der postleitzahl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
     * Legt den Wert der postleitzahl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostleitzahl(String value) {
        this.postleitzahl = value;
    }

    /**
     * Ruft den Wert der stockwerkswohnungsnummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockwerkswohnungsnummer() {
        return stockwerkswohnungsnummer;
    }

    /**
     * Legt den Wert der stockwerkswohnungsnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockwerkswohnungsnummer(String value) {
        this.stockwerkswohnungsnummer = value;
    }

    /**
     * Ruft den Wert der strasse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * Legt den Wert der strasse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrasse(String value) {
        this.strasse = value;
    }

    /**
     * Ruft den Wert der teilnummerDerHausnummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeilnummerDerHausnummer() {
        return teilnummerDerHausnummer;
    }

    /**
     * Legt den Wert der teilnummerDerHausnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeilnummerDerHausnummer(String value) {
        this.teilnummerDerHausnummer = value;
    }

    /**
     * Ruft den Wert der wohnort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnort() {
        return wohnort;
    }

    /**
     * Legt den Wert der wohnort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnort(String value) {
        this.wohnort = value;
    }

    /**
     * Ruft den Wert der wohnortFruehererGemeindename-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnortFruehererGemeindename() {
        return wohnortFruehererGemeindename;
    }

    /**
     * Legt den Wert der wohnortFruehererGemeindename-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnortFruehererGemeindename(String value) {
        this.wohnortFruehererGemeindename = value;
    }

    /**
     * Ruft den Wert der wohnungsinhaber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnungsinhaber() {
        return wohnungsinhaber;
    }

    /**
     * Legt den Wert der wohnungsinhaber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnungsinhaber(String value) {
        this.wohnungsinhaber = value;
    }

    /**
     * Ruft den Wert der zusatzangaben-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZusatzangaben() {
        return zusatzangaben;
    }

    /**
     * Legt den Wert der zusatzangaben-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatzangaben(String value) {
        this.zusatzangaben = value;
    }

}
