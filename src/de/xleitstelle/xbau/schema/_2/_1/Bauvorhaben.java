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
 * Typ für die Daten eines Bauvorhabens, enthält Informationen zum Wer, Was und Wo des Bauvorhabens bzw. Vorhabens. Der Begriff 'Bauvorhaben' wird hier sehr weit gefasst, so dass auch Nutzungsänderungen ohne Baumaßnahmen abgedeckt sind. Der Typ wird in allen Nachrichten eingesetzt, in denen Eigenschaften eines Bauvorhabens (bzw. Vorhabens) anzugeben sind bzw. geprüft werden sollen. Er wird auch da eingesetzt, wo über ein Bauvorhaben (Vorhaben) oder über Maßnahmen im Zusammenhang eines Bauvorhabens (Vorhabens) zu informieren ist.
 * 
 * <p>Java-Klasse für Bauvorhaben complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Bauvorhaben">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bezeichnungDesBauvorhabens" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *         &lt;element name="beteiligte" type="{http://www.xleitstelle.de/xbau/schema/2/1/}BeteiligteBauprojektInPlanung"/>
 *         &lt;element name="gegenstand">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="artDerMassnahme" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.BaumassnahmeArt"/>
 *                   &lt;element name="artDerBaulichenAnlage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="artDesGebaeudes" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.BaulicheAnlagenGebaeude"/>
 *                             &lt;element name="artDerSonstigenAnlage" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.BaulicheAnlagenSonstige"/>
 *                             &lt;element name="artNichtAufgefuehrt" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="bauvorhabenDatenblatt" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Datenblatt" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="verortung">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="baugrundstueck" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Baugrundstueck" maxOccurs="unbounded"/>
 *                   &lt;element name="lageBauvorhaben" type="{http://www.xleitstelle.de/xbau/schema/2/1/}GeoreferenzierteLage" minOccurs="0"/>
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
@XmlType(name = "Bauvorhaben", propOrder = {
    "bezeichnungDesBauvorhabens",
    "beteiligte",
    "gegenstand",
    "verortung"
})
public class Bauvorhaben {

    @XmlElement(required = true)
    protected String bezeichnungDesBauvorhabens;
    @XmlElement(required = true)
    protected BeteiligteBauprojektInPlanung beteiligte;
    @XmlElement(required = true)
    protected Bauvorhaben.Gegenstand gegenstand;
    @XmlElement(required = true)
    protected Bauvorhaben.Verortung verortung;

    /**
     * Ruft den Wert der bezeichnungDesBauvorhabens-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnungDesBauvorhabens() {
        return bezeichnungDesBauvorhabens;
    }

    /**
     * Legt den Wert der bezeichnungDesBauvorhabens-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnungDesBauvorhabens(String value) {
        this.bezeichnungDesBauvorhabens = value;
    }

    /**
     * Ruft den Wert der beteiligte-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BeteiligteBauprojektInPlanung }
     *     
     */
    public BeteiligteBauprojektInPlanung getBeteiligte() {
        return beteiligte;
    }

    /**
     * Legt den Wert der beteiligte-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BeteiligteBauprojektInPlanung }
     *     
     */
    public void setBeteiligte(BeteiligteBauprojektInPlanung value) {
        this.beteiligte = value;
    }

    /**
     * Ruft den Wert der gegenstand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Bauvorhaben.Gegenstand }
     *     
     */
    public Bauvorhaben.Gegenstand getGegenstand() {
        return gegenstand;
    }

    /**
     * Legt den Wert der gegenstand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Bauvorhaben.Gegenstand }
     *     
     */
    public void setGegenstand(Bauvorhaben.Gegenstand value) {
        this.gegenstand = value;
    }

    /**
     * Ruft den Wert der verortung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Bauvorhaben.Verortung }
     *     
     */
    public Bauvorhaben.Verortung getVerortung() {
        return verortung;
    }

    /**
     * Legt den Wert der verortung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Bauvorhaben.Verortung }
     *     
     */
    public void setVerortung(Bauvorhaben.Verortung value) {
        this.verortung = value;
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
     *         &lt;element name="artDerMassnahme" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.BaumassnahmeArt"/>
     *         &lt;element name="artDerBaulichenAnlage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="artDesGebaeudes" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.BaulicheAnlagenGebaeude"/>
     *                   &lt;element name="artDerSonstigenAnlage" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.BaulicheAnlagenSonstige"/>
     *                   &lt;element name="artNichtAufgefuehrt" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="bauvorhabenDatenblatt" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Datenblatt" minOccurs="0"/>
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
        "artDerMassnahme",
        "artDerBaulichenAnlage",
        "bauvorhabenDatenblatt"
    })
    public static class Gegenstand {

        @XmlElement(required = true)
        protected CodeBaumassnahmeArt artDerMassnahme;
        @XmlElement(required = true)
        protected Bauvorhaben.Gegenstand.ArtDerBaulichenAnlage artDerBaulichenAnlage;
        protected Datenblatt bauvorhabenDatenblatt;

        /**
         * Ruft den Wert der artDerMassnahme-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CodeBaumassnahmeArt }
         *     
         */
        public CodeBaumassnahmeArt getArtDerMassnahme() {
            return artDerMassnahme;
        }

        /**
         * Legt den Wert der artDerMassnahme-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeBaumassnahmeArt }
         *     
         */
        public void setArtDerMassnahme(CodeBaumassnahmeArt value) {
            this.artDerMassnahme = value;
        }

        /**
         * Ruft den Wert der artDerBaulichenAnlage-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Bauvorhaben.Gegenstand.ArtDerBaulichenAnlage }
         *     
         */
        public Bauvorhaben.Gegenstand.ArtDerBaulichenAnlage getArtDerBaulichenAnlage() {
            return artDerBaulichenAnlage;
        }

        /**
         * Legt den Wert der artDerBaulichenAnlage-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Bauvorhaben.Gegenstand.ArtDerBaulichenAnlage }
         *     
         */
        public void setArtDerBaulichenAnlage(Bauvorhaben.Gegenstand.ArtDerBaulichenAnlage value) {
            this.artDerBaulichenAnlage = value;
        }

        /**
         * Ruft den Wert der bauvorhabenDatenblatt-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Datenblatt }
         *     
         */
        public Datenblatt getBauvorhabenDatenblatt() {
            return bauvorhabenDatenblatt;
        }

        /**
         * Legt den Wert der bauvorhabenDatenblatt-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Datenblatt }
         *     
         */
        public void setBauvorhabenDatenblatt(Datenblatt value) {
            this.bauvorhabenDatenblatt = value;
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
         *         &lt;element name="artDesGebaeudes" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.BaulicheAnlagenGebaeude"/>
         *         &lt;element name="artDerSonstigenAnlage" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.BaulicheAnlagenSonstige"/>
         *         &lt;element name="artNichtAufgefuehrt" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
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
            "artDesGebaeudes",
            "artDerSonstigenAnlage",
            "artNichtAufgefuehrt"
        })
        public static class ArtDerBaulichenAnlage {

            protected CodeBaulicheAnlagenGebaeude artDesGebaeudes;
            protected CodeBaulicheAnlagenSonstige artDerSonstigenAnlage;
            protected String artNichtAufgefuehrt;

            /**
             * Ruft den Wert der artDesGebaeudes-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link CodeBaulicheAnlagenGebaeude }
             *     
             */
            public CodeBaulicheAnlagenGebaeude getArtDesGebaeudes() {
                return artDesGebaeudes;
            }

            /**
             * Legt den Wert der artDesGebaeudes-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeBaulicheAnlagenGebaeude }
             *     
             */
            public void setArtDesGebaeudes(CodeBaulicheAnlagenGebaeude value) {
                this.artDesGebaeudes = value;
            }

            /**
             * Ruft den Wert der artDerSonstigenAnlage-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link CodeBaulicheAnlagenSonstige }
             *     
             */
            public CodeBaulicheAnlagenSonstige getArtDerSonstigenAnlage() {
                return artDerSonstigenAnlage;
            }

            /**
             * Legt den Wert der artDerSonstigenAnlage-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link CodeBaulicheAnlagenSonstige }
             *     
             */
            public void setArtDerSonstigenAnlage(CodeBaulicheAnlagenSonstige value) {
                this.artDerSonstigenAnlage = value;
            }

            /**
             * Ruft den Wert der artNichtAufgefuehrt-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArtNichtAufgefuehrt() {
                return artNichtAufgefuehrt;
            }

            /**
             * Legt den Wert der artNichtAufgefuehrt-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArtNichtAufgefuehrt(String value) {
                this.artNichtAufgefuehrt = value;
            }

        }

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
     *         &lt;element name="baugrundstueck" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Baugrundstueck" maxOccurs="unbounded"/>
     *         &lt;element name="lageBauvorhaben" type="{http://www.xleitstelle.de/xbau/schema/2/1/}GeoreferenzierteLage" minOccurs="0"/>
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
        "baugrundstueck",
        "lageBauvorhaben"
    })
    public static class Verortung {

        @XmlElement(required = true)
        protected List<Baugrundstueck> baugrundstueck;
        protected GeoreferenzierteLage lageBauvorhaben;

        /**
         * Gets the value of the baugrundstueck property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baugrundstueck property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaugrundstueck().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Baugrundstueck }
         * 
         * 
         */
        public List<Baugrundstueck> getBaugrundstueck() {
            if (baugrundstueck == null) {
                baugrundstueck = new ArrayList<Baugrundstueck>();
            }
            return this.baugrundstueck;
        }

        /**
         * Ruft den Wert der lageBauvorhaben-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link GeoreferenzierteLage }
         *     
         */
        public GeoreferenzierteLage getLageBauvorhaben() {
            return lageBauvorhaben;
        }

        /**
         * Legt den Wert der lageBauvorhaben-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link GeoreferenzierteLage }
         *     
         */
        public void setLageBauvorhaben(GeoreferenzierteLage value) {
            this.lageBauvorhaben = value;
        }

    }

}
