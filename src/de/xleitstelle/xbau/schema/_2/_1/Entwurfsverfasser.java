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
 * Dieser Typ dient dazu, die Daten des  Entwurfsverfassers zu übermitteln, der verantwortlich an der Vorbereitung des  Bauprojekts mitwirkt bzw. mitgewirkt hat.
 * 
 * <p>Java-Klasse für Entwurfsverfasser complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Entwurfsverfasser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personendaten" type="{http://www.xleitstelle.de/xbau/schema/2/1/}AmBauBeteiligtePerson" minOccurs="0"/>
 *         &lt;element name="bauvorlageberechtigung" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="sachverhalt" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.BauvorlageberechtigungSachverhalt"/>
 *                   &lt;element name="kammer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nummerEintragungsliste" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
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
@XmlType(name = "Entwurfsverfasser", propOrder = {
    "personendaten",
    "bauvorlageberechtigung"
})
public class Entwurfsverfasser {

    protected AmBauBeteiligtePerson personendaten;
    protected Entwurfsverfasser.Bauvorlageberechtigung bauvorlageberechtigung;

    /**
     * Ruft den Wert der personendaten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AmBauBeteiligtePerson }
     *     
     */
    public AmBauBeteiligtePerson getPersonendaten() {
        return personendaten;
    }

    /**
     * Legt den Wert der personendaten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AmBauBeteiligtePerson }
     *     
     */
    public void setPersonendaten(AmBauBeteiligtePerson value) {
        this.personendaten = value;
    }

    /**
     * Ruft den Wert der bauvorlageberechtigung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Entwurfsverfasser.Bauvorlageberechtigung }
     *     
     */
    public Entwurfsverfasser.Bauvorlageberechtigung getBauvorlageberechtigung() {
        return bauvorlageberechtigung;
    }

    /**
     * Legt den Wert der bauvorlageberechtigung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Entwurfsverfasser.Bauvorlageberechtigung }
     *     
     */
    public void setBauvorlageberechtigung(Entwurfsverfasser.Bauvorlageberechtigung value) {
        this.bauvorlageberechtigung = value;
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
     *       &lt;choice>
     *         &lt;element name="sachverhalt" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.BauvorlageberechtigungSachverhalt"/>
     *         &lt;element name="kammer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nummerEintragungsliste" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sachverhalt",
        "kammer"
    })
    public static class Bauvorlageberechtigung {

        protected CodeBauvorlageberechtigungSachverhalt sachverhalt;
        protected Entwurfsverfasser.Bauvorlageberechtigung.Kammer kammer;

        /**
         * Ruft den Wert der sachverhalt-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CodeBauvorlageberechtigungSachverhalt }
         *     
         */
        public CodeBauvorlageberechtigungSachverhalt getSachverhalt() {
            return sachverhalt;
        }

        /**
         * Legt den Wert der sachverhalt-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeBauvorlageberechtigungSachverhalt }
         *     
         */
        public void setSachverhalt(CodeBauvorlageberechtigungSachverhalt value) {
            this.sachverhalt = value;
        }

        /**
         * Ruft den Wert der kammer-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Entwurfsverfasser.Bauvorlageberechtigung.Kammer }
         *     
         */
        public Entwurfsverfasser.Bauvorlageberechtigung.Kammer getKammer() {
            return kammer;
        }

        /**
         * Legt den Wert der kammer-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Entwurfsverfasser.Bauvorlageberechtigung.Kammer }
         *     
         */
        public void setKammer(Entwurfsverfasser.Bauvorlageberechtigung.Kammer value) {
            this.kammer = value;
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
         *         &lt;element name="nummerEintragungsliste" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
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
            "nummerEintragungsliste"
        })
        public static class Kammer {

            @XmlElement(required = true)
            protected String nummerEintragungsliste;

            /**
             * Ruft den Wert der nummerEintragungsliste-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNummerEintragungsliste() {
                return nummerEintragungsliste;
            }

            /**
             * Legt den Wert der nummerEintragungsliste-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNummerEintragungsliste(String value) {
                this.nummerEintragungsliste = value;
            }

        }

    }

}
