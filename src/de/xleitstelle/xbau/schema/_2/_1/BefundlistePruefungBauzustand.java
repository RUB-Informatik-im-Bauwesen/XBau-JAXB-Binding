//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Eine Instanz diesen Typs steht für eine Befundliste der materiellen Prüfung eines Antrags. Jeder Befund beinhaltet die Parameter, die einen  belastenden Verwaltungsakt im Kontext eines Baugenehmigungsvorgangs definieren.
 * 
 * <p>Java-Klasse für BefundlistePruefungBauzustand complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BefundlistePruefungBauzustand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="befund" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="beschreibung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *                   &lt;element name="verweise" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text" minOccurs="0"/>
 *                   &lt;element name="rechtsbereich" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Rechtsbereich" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BefundlistePruefungBauzustand", propOrder = {
    "befund"
})
public class BefundlistePruefungBauzustand {

    @XmlElement(required = true)
    protected List<BefundlistePruefungBauzustand.Befund> befund;

    /**
     * Gets the value of the befund property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the befund property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBefund().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BefundlistePruefungBauzustand.Befund }
     * 
     * 
     */
    public List<BefundlistePruefungBauzustand.Befund> getBefund() {
        if (befund == null) {
            befund = new ArrayList<BefundlistePruefungBauzustand.Befund>();
        }
        return this.befund;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="beschreibung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
     *         &lt;element name="verweise" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text" minOccurs="0"/>
     *         &lt;element name="rechtsbereich" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Rechtsbereich" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "beschreibung",
        "verweise",
        "rechtsbereich"
    })
    public static class Befund {

        @XmlElement(required = true)
        protected String beschreibung;
        protected Text verweise;
        protected CodeRechtsbereich rechtsbereich;

        /**
         * Ruft den Wert der beschreibung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeschreibung() {
            return beschreibung;
        }

        /**
         * Legt den Wert der beschreibung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeschreibung(String value) {
            this.beschreibung = value;
        }

        /**
         * Ruft den Wert der verweise-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Text }
         *     
         */
        public Text getVerweise() {
            return verweise;
        }

        /**
         * Legt den Wert der verweise-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Text }
         *     
         */
        public void setVerweise(Text value) {
            this.verweise = value;
        }

        /**
         * Ruft den Wert der rechtsbereich-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CodeRechtsbereich }
         *     
         */
        public CodeRechtsbereich getRechtsbereich() {
            return rechtsbereich;
        }

        /**
         * Legt den Wert der rechtsbereich-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeRechtsbereich }
         *     
         */
        public void setRechtsbereich(CodeRechtsbereich value) {
            this.rechtsbereich = value;
        }

    }

}
