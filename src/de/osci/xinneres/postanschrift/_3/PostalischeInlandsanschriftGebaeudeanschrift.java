//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.osci.xinneres.postanschrift._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Datentyp beinhaltet die Angaben für die Adressierung im Inland, soweit es sich um eine Gebäudeanschrift (und nicht um eine Postfachanschrift) handelt.
 * 
 * <p>Java-Klasse für PostalischeInlandsanschrift.Gebaeudeanschrift complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PostalischeInlandsanschrift.Gebaeudeanschrift">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.osci.de/xinneres/postanschrift/3}PostalischeInlandsanschrift.Basis">
 *       &lt;sequence>
 *         &lt;element name="hausnummern.bis" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hausnummer.bis" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Hausnummer" minOccurs="0"/>
 *                   &lt;element name="hausnummerbuchstabezusatzziffer.bis" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.HausnummerBuchstabeZusatzziffer" minOccurs="0"/>
 *                   &lt;element name="teilnummerderhausnummer.bis" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.TeilnummerDerHausnummer" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalischeInlandsanschrift.Gebaeudeanschrift", propOrder = {
    "hausnummernBis"
})
public class PostalischeInlandsanschriftGebaeudeanschrift
    extends PostalischeInlandsanschriftBasis
{

    @XmlElement(name = "hausnummern.bis")
    protected PostalischeInlandsanschriftGebaeudeanschrift.HausnummernBis hausnummernBis;

    /**
     * Ruft den Wert der hausnummernBis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostalischeInlandsanschriftGebaeudeanschrift.HausnummernBis }
     *     
     */
    public PostalischeInlandsanschriftGebaeudeanschrift.HausnummernBis getHausnummernBis() {
        return hausnummernBis;
    }

    /**
     * Legt den Wert der hausnummernBis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalischeInlandsanschriftGebaeudeanschrift.HausnummernBis }
     *     
     */
    public void setHausnummernBis(PostalischeInlandsanschriftGebaeudeanschrift.HausnummernBis value) {
        this.hausnummernBis = value;
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
     *         &lt;element name="hausnummer.bis" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.Hausnummer" minOccurs="0"/>
     *         &lt;element name="hausnummerbuchstabezusatzziffer.bis" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.HausnummerBuchstabeZusatzziffer" minOccurs="0"/>
     *         &lt;element name="teilnummerderhausnummer.bis" type="{http://www.osci.de/xinneres/meldeanschrift/3}Meldeanschrift.TeilnummerDerHausnummer" minOccurs="0"/>
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
        "hausnummerBis",
        "hausnummerbuchstabezusatzzifferBis",
        "teilnummerderhausnummerBis"
    })
    public static class HausnummernBis {

        @XmlElement(name = "hausnummer.bis")
        protected String hausnummerBis;
        @XmlElement(name = "hausnummerbuchstabezusatzziffer.bis")
        protected String hausnummerbuchstabezusatzzifferBis;
        @XmlElement(name = "teilnummerderhausnummer.bis")
        protected String teilnummerderhausnummerBis;

        /**
         * Ruft den Wert der hausnummerBis-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHausnummerBis() {
            return hausnummerBis;
        }

        /**
         * Legt den Wert der hausnummerBis-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHausnummerBis(String value) {
            this.hausnummerBis = value;
        }

        /**
         * Ruft den Wert der hausnummerbuchstabezusatzzifferBis-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHausnummerbuchstabezusatzzifferBis() {
            return hausnummerbuchstabezusatzzifferBis;
        }

        /**
         * Legt den Wert der hausnummerbuchstabezusatzzifferBis-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHausnummerbuchstabezusatzzifferBis(String value) {
            this.hausnummerbuchstabezusatzzifferBis = value;
        }

        /**
         * Ruft den Wert der teilnummerderhausnummerBis-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeilnummerderhausnummerBis() {
            return teilnummerderhausnummerBis;
        }

        /**
         * Legt den Wert der teilnummerderhausnummerBis-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeilnummerderhausnummerBis(String value) {
            this.teilnummerderhausnummerBis = value;
        }

    }

}
