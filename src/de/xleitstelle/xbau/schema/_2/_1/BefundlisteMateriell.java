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
 * <p>Java-Klasse für BefundlisteMateriell complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BefundlisteMateriell">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="befund" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rechtsbereich" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Rechtsbereich"/>
 *                   &lt;element name="bezeichnungRegelverstoss" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *                   &lt;element name="begruendung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
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
@XmlType(name = "BefundlisteMateriell", propOrder = {
    "befund"
})
public class BefundlisteMateriell {

    @XmlElement(required = true)
    protected List<BefundlisteMateriell.Befund> befund;

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
     * {@link BefundlisteMateriell.Befund }
     * 
     * 
     */
    public List<BefundlisteMateriell.Befund> getBefund() {
        if (befund == null) {
            befund = new ArrayList<BefundlisteMateriell.Befund>();
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
     *         &lt;element name="rechtsbereich" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Rechtsbereich"/>
     *         &lt;element name="bezeichnungRegelverstoss" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
     *         &lt;element name="begruendung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
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
        "rechtsbereich",
        "bezeichnungRegelverstoss",
        "begruendung"
    })
    public static class Befund {

        @XmlElement(required = true)
        protected CodeRechtsbereich rechtsbereich;
        @XmlElement(required = true)
        protected String bezeichnungRegelverstoss;
        @XmlElement(required = true)
        protected String begruendung;

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

        /**
         * Ruft den Wert der bezeichnungRegelverstoss-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBezeichnungRegelverstoss() {
            return bezeichnungRegelverstoss;
        }

        /**
         * Legt den Wert der bezeichnungRegelverstoss-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBezeichnungRegelverstoss(String value) {
            this.bezeichnungRegelverstoss = value;
        }

        /**
         * Ruft den Wert der begruendung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBegruendung() {
            return begruendung;
        }

        /**
         * Legt den Wert der begruendung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBegruendung(String value) {
            this.begruendung = value;
        }

    }

}
