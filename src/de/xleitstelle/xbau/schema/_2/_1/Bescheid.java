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
 * Dieser Typ beinhaltet die Parameter eines Bescheides, den die Bauaufsichtsbehörde nach Prüfung eines Antrags erlässt.
 * 
 * <p>Java-Klasse für Bescheid complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Bescheid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tenor">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="istGenehmigung" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="kommentareFachrecht" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="kommentarFachrecht" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="abweichung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}AbweichungBearbeitet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nebenbestimmung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Nebenbestimmung" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="begruendung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}TextFormatiert" minOccurs="0"/>
 *         &lt;element name="rechtshelfsbelehrung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
 *         &lt;element name="hinweise" type="{http://www.xleitstelle.de/xbau/schema/2/1/}TextFormatiert" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bescheid", propOrder = {
    "tenor",
    "abweichung",
    "nebenbestimmung",
    "begruendung",
    "rechtshelfsbelehrung",
    "hinweise"
})
public class Bescheid {

    @XmlElement(required = true)
    protected Bescheid.Tenor tenor;
    protected List<AbweichungBearbeitet> abweichung;
    protected List<Nebenbestimmung> nebenbestimmung;
    protected TextFormatiert begruendung;
    @XmlElement(required = true)
    protected Text rechtshelfsbelehrung;
    protected TextFormatiert hinweise;

    /**
     * Ruft den Wert der tenor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Bescheid.Tenor }
     *     
     */
    public Bescheid.Tenor getTenor() {
        return tenor;
    }

    /**
     * Legt den Wert der tenor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Bescheid.Tenor }
     *     
     */
    public void setTenor(Bescheid.Tenor value) {
        this.tenor = value;
    }

    /**
     * Gets the value of the abweichung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abweichung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbweichung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbweichungBearbeitet }
     * 
     * 
     */
    public List<AbweichungBearbeitet> getAbweichung() {
        if (abweichung == null) {
            abweichung = new ArrayList<AbweichungBearbeitet>();
        }
        return this.abweichung;
    }

    /**
     * Gets the value of the nebenbestimmung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nebenbestimmung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNebenbestimmung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nebenbestimmung }
     * 
     * 
     */
    public List<Nebenbestimmung> getNebenbestimmung() {
        if (nebenbestimmung == null) {
            nebenbestimmung = new ArrayList<Nebenbestimmung>();
        }
        return this.nebenbestimmung;
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
     * Ruft den Wert der hinweise-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextFormatiert }
     *     
     */
    public TextFormatiert getHinweise() {
        return hinweise;
    }

    /**
     * Legt den Wert der hinweise-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextFormatiert }
     *     
     */
    public void setHinweise(TextFormatiert value) {
        this.hinweise = value;
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
     *         &lt;element name="istGenehmigung" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="kommentareFachrecht" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="kommentarFachrecht" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text" maxOccurs="unbounded"/>
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
    @XmlType(name = "", propOrder = {
        "istGenehmigung",
        "kommentareFachrecht"
    })
    public static class Tenor {

        protected boolean istGenehmigung;
        protected Bescheid.Tenor.KommentareFachrecht kommentareFachrecht;

        /**
         * Ruft den Wert der istGenehmigung-Eigenschaft ab.
         * 
         */
        public boolean isIstGenehmigung() {
            return istGenehmigung;
        }

        /**
         * Legt den Wert der istGenehmigung-Eigenschaft fest.
         * 
         */
        public void setIstGenehmigung(boolean value) {
            this.istGenehmigung = value;
        }

        /**
         * Ruft den Wert der kommentareFachrecht-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Bescheid.Tenor.KommentareFachrecht }
         *     
         */
        public Bescheid.Tenor.KommentareFachrecht getKommentareFachrecht() {
            return kommentareFachrecht;
        }

        /**
         * Legt den Wert der kommentareFachrecht-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Bescheid.Tenor.KommentareFachrecht }
         *     
         */
        public void setKommentareFachrecht(Bescheid.Tenor.KommentareFachrecht value) {
            this.kommentareFachrecht = value;
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
         *         &lt;element name="kommentarFachrecht" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text" maxOccurs="unbounded"/>
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
            "kommentarFachrecht"
        })
        public static class KommentareFachrecht {

            @XmlElement(required = true)
            protected List<Text> kommentarFachrecht;

            /**
             * Gets the value of the kommentarFachrecht property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the kommentarFachrecht property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKommentarFachrecht().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Text }
             * 
             * 
             */
            public List<Text> getKommentarFachrecht() {
                if (kommentarFachrecht == null) {
                    kommentarFachrecht = new ArrayList<Text>();
                }
                return this.kommentarFachrecht;
            }

        }

    }

}
