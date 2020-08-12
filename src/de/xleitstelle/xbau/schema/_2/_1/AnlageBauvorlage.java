//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Dieser Typ nimmt die Metadaten zu einer Bauvorlage bzw. sonstigen Anlage auf, die gemäß der Architektur der Übertragung von Primärdokumenten im Zusammenhang mit einer XBau-Fachnachricht zu übertragen ist.
 * 
 * <p>Java-Klasse für AnlageBauvorlage complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AnlageBauvorlage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bezeichnung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *         &lt;element name="versionsnummer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="bauvorlageart">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="vorlageBauvorhaben" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.VorlagenBauantragBauvorhaben"/>
 *                   &lt;element name="vorlageBauantragBearbeitung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.VorlagenBauantragBearbeitung"/>
 *                   &lt;element name="vorlageBauzustand" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.VorlagenBauzustand"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mimeType" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.XBau-MimeType"/>
 *         &lt;element name="primaerdokument" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="referenzPrimaerdokument" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="dateinameAnhang" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnlageBauvorlage", propOrder = {
    "bezeichnung",
    "versionsnummer",
    "datum",
    "bauvorlageart",
    "mimeType",
    "primaerdokument",
    "referenzPrimaerdokument",
    "dateinameAnhang"
})
public class AnlageBauvorlage {

    @XmlElement(required = true)
    protected String bezeichnung;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger versionsnummer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(required = true)
    protected AnlageBauvorlage.Bauvorlageart bauvorlageart;
    @XmlElement(required = true)
    protected CodeXBauMimeType mimeType;
    protected byte[] primaerdokument;
    @XmlSchemaType(name = "anyURI")
    protected String referenzPrimaerdokument;
    protected String dateinameAnhang;

    /**
     * Ruft den Wert der bezeichnung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Legt den Wert der bezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnung(String value) {
        this.bezeichnung = value;
    }

    /**
     * Ruft den Wert der versionsnummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersionsnummer() {
        return versionsnummer;
    }

    /**
     * Legt den Wert der versionsnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersionsnummer(BigInteger value) {
        this.versionsnummer = value;
    }

    /**
     * Ruft den Wert der datum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Legt den Wert der datum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Ruft den Wert der bauvorlageart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnlageBauvorlage.Bauvorlageart }
     *     
     */
    public AnlageBauvorlage.Bauvorlageart getBauvorlageart() {
        return bauvorlageart;
    }

    /**
     * Legt den Wert der bauvorlageart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlageBauvorlage.Bauvorlageart }
     *     
     */
    public void setBauvorlageart(AnlageBauvorlage.Bauvorlageart value) {
        this.bauvorlageart = value;
    }

    /**
     * Ruft den Wert der mimeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeXBauMimeType }
     *     
     */
    public CodeXBauMimeType getMimeType() {
        return mimeType;
    }

    /**
     * Legt den Wert der mimeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeXBauMimeType }
     *     
     */
    public void setMimeType(CodeXBauMimeType value) {
        this.mimeType = value;
    }

    /**
     * Ruft den Wert der primaerdokument-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPrimaerdokument() {
        return primaerdokument;
    }

    /**
     * Legt den Wert der primaerdokument-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPrimaerdokument(byte[] value) {
        this.primaerdokument = value;
    }

    /**
     * Ruft den Wert der referenzPrimaerdokument-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenzPrimaerdokument() {
        return referenzPrimaerdokument;
    }

    /**
     * Legt den Wert der referenzPrimaerdokument-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenzPrimaerdokument(String value) {
        this.referenzPrimaerdokument = value;
    }

    /**
     * Ruft den Wert der dateinameAnhang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateinameAnhang() {
        return dateinameAnhang;
    }

    /**
     * Legt den Wert der dateinameAnhang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateinameAnhang(String value) {
        this.dateinameAnhang = value;
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
     *         &lt;element name="vorlageBauvorhaben" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.VorlagenBauantragBauvorhaben"/>
     *         &lt;element name="vorlageBauantragBearbeitung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.VorlagenBauantragBearbeitung"/>
     *         &lt;element name="vorlageBauzustand" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.VorlagenBauzustand"/>
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
        "vorlageBauvorhaben",
        "vorlageBauantragBearbeitung",
        "vorlageBauzustand"
    })
    public static class Bauvorlageart {

        protected CodeVorlagenBauantragBauvorhaben vorlageBauvorhaben;
        protected CodeVorlagenBauantragBearbeitung vorlageBauantragBearbeitung;
        protected CodeVorlagenBauzustand vorlageBauzustand;

        /**
         * Ruft den Wert der vorlageBauvorhaben-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CodeVorlagenBauantragBauvorhaben }
         *     
         */
        public CodeVorlagenBauantragBauvorhaben getVorlageBauvorhaben() {
            return vorlageBauvorhaben;
        }

        /**
         * Legt den Wert der vorlageBauvorhaben-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeVorlagenBauantragBauvorhaben }
         *     
         */
        public void setVorlageBauvorhaben(CodeVorlagenBauantragBauvorhaben value) {
            this.vorlageBauvorhaben = value;
        }

        /**
         * Ruft den Wert der vorlageBauantragBearbeitung-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CodeVorlagenBauantragBearbeitung }
         *     
         */
        public CodeVorlagenBauantragBearbeitung getVorlageBauantragBearbeitung() {
            return vorlageBauantragBearbeitung;
        }

        /**
         * Legt den Wert der vorlageBauantragBearbeitung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeVorlagenBauantragBearbeitung }
         *     
         */
        public void setVorlageBauantragBearbeitung(CodeVorlagenBauantragBearbeitung value) {
            this.vorlageBauantragBearbeitung = value;
        }

        /**
         * Ruft den Wert der vorlageBauzustand-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CodeVorlagenBauzustand }
         *     
         */
        public CodeVorlagenBauzustand getVorlageBauzustand() {
            return vorlageBauzustand;
        }

        /**
         * Legt den Wert der vorlageBauzustand-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeVorlagenBauzustand }
         *     
         */
        public void setVorlageBauzustand(CodeVorlagenBauzustand value) {
            this.vorlageBauzustand = value;
        }

    }

}
