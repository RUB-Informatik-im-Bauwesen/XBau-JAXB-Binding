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
 * Dieser Typ beinhaltet die Befunde der formellen Prüfung eines Antrags oder einer Anfrage. Für jeden Befund sind die entsprechenden Parameter gefüllt, die Inhalt und Bezug des Befundes für den Antragsteller bzw. Anfragenden nachvollziehbar machen.
 * 
 * <p>Java-Klasse für BefundlisteAntragFormell complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BefundlisteAntragFormell">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="befund" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="artDesBefundes" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.FormelleBefundeAntragArt"/>
 *                   &lt;element name="refAnlage" type="{http://www.xleitstelle.de/xbau/schema/2/1/}RefAnlage" minOccurs="0"/>
 *                   &lt;element name="betroffeneAnlage" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.VorlagenBauantragBearbeitung" minOccurs="0"/>
 *                   &lt;element name="beschreibung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
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
@XmlType(name = "BefundlisteAntragFormell", propOrder = {
    "befund"
})
public class BefundlisteAntragFormell {

    @XmlElement(required = true)
    protected List<BefundlisteAntragFormell.Befund> befund;

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
     * {@link BefundlisteAntragFormell.Befund }
     * 
     * 
     */
    public List<BefundlisteAntragFormell.Befund> getBefund() {
        if (befund == null) {
            befund = new ArrayList<BefundlisteAntragFormell.Befund>();
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
     *         &lt;element name="artDesBefundes" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.FormelleBefundeAntragArt"/>
     *         &lt;element name="refAnlage" type="{http://www.xleitstelle.de/xbau/schema/2/1/}RefAnlage" minOccurs="0"/>
     *         &lt;element name="betroffeneAnlage" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.VorlagenBauantragBearbeitung" minOccurs="0"/>
     *         &lt;element name="beschreibung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
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
        "artDesBefundes",
        "refAnlage",
        "betroffeneAnlage",
        "beschreibung"
    })
    public static class Befund {

        @XmlElement(required = true)
        protected CodeFormelleBefundeAntragArt artDesBefundes;
        protected RefAnlage refAnlage;
        protected CodeVorlagenBauantragBearbeitung betroffeneAnlage;
        @XmlElement(required = true)
        protected Text beschreibung;

        /**
         * Ruft den Wert der artDesBefundes-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CodeFormelleBefundeAntragArt }
         *     
         */
        public CodeFormelleBefundeAntragArt getArtDesBefundes() {
            return artDesBefundes;
        }

        /**
         * Legt den Wert der artDesBefundes-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeFormelleBefundeAntragArt }
         *     
         */
        public void setArtDesBefundes(CodeFormelleBefundeAntragArt value) {
            this.artDesBefundes = value;
        }

        /**
         * Ruft den Wert der refAnlage-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link RefAnlage }
         *     
         */
        public RefAnlage getRefAnlage() {
            return refAnlage;
        }

        /**
         * Legt den Wert der refAnlage-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link RefAnlage }
         *     
         */
        public void setRefAnlage(RefAnlage value) {
            this.refAnlage = value;
        }

        /**
         * Ruft den Wert der betroffeneAnlage-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CodeVorlagenBauantragBearbeitung }
         *     
         */
        public CodeVorlagenBauantragBearbeitung getBetroffeneAnlage() {
            return betroffeneAnlage;
        }

        /**
         * Legt den Wert der betroffeneAnlage-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeVorlagenBauantragBearbeitung }
         *     
         */
        public void setBetroffeneAnlage(CodeVorlagenBauantragBearbeitung value) {
            this.betroffeneAnlage = value;
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

    }

}
