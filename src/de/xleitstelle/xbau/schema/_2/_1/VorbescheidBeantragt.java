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
 * Dieser Typ beinhaltet die Parameter einer Frage, die im Rahmen eines Vorbescheidantrags thematisiert wird. Insoweit diese Frage einen Abweichungsantrag bzw. eine beantragte Erleichterung betrifft, sind in einer Instanz des Typs Daten enthalten, die den entsprechenden Kontext verdeutlichen.
 * 
 * <p>Java-Klasse für VorbescheidBeantragt complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VorbescheidBeantragt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="artDerFrage" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.VorbescheidBetreff"/>
 *         &lt;element name="vorbescheidfrage" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Text"/>
 *         &lt;element name="beantragteAbweichung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}AbweichungBeantragt" minOccurs="0"/>
 *         &lt;element name="angefragteErleichterung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}ErleichterungAngefragt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VorbescheidBeantragt", propOrder = {
    "artDerFrage",
    "vorbescheidfrage",
    "beantragteAbweichung",
    "angefragteErleichterung"
})
public class VorbescheidBeantragt {

    @XmlElement(required = true)
    protected CodeVorbescheidBetreff artDerFrage;
    @XmlElement(required = true)
    protected Text vorbescheidfrage;
    protected AbweichungBeantragt beantragteAbweichung;
    protected ErleichterungAngefragt angefragteErleichterung;

    /**
     * Ruft den Wert der artDerFrage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeVorbescheidBetreff }
     *     
     */
    public CodeVorbescheidBetreff getArtDerFrage() {
        return artDerFrage;
    }

    /**
     * Legt den Wert der artDerFrage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeVorbescheidBetreff }
     *     
     */
    public void setArtDerFrage(CodeVorbescheidBetreff value) {
        this.artDerFrage = value;
    }

    /**
     * Ruft den Wert der vorbescheidfrage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getVorbescheidfrage() {
        return vorbescheidfrage;
    }

    /**
     * Legt den Wert der vorbescheidfrage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setVorbescheidfrage(Text value) {
        this.vorbescheidfrage = value;
    }

    /**
     * Ruft den Wert der beantragteAbweichung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AbweichungBeantragt }
     *     
     */
    public AbweichungBeantragt getBeantragteAbweichung() {
        return beantragteAbweichung;
    }

    /**
     * Legt den Wert der beantragteAbweichung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AbweichungBeantragt }
     *     
     */
    public void setBeantragteAbweichung(AbweichungBeantragt value) {
        this.beantragteAbweichung = value;
    }

    /**
     * Ruft den Wert der angefragteErleichterung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ErleichterungAngefragt }
     *     
     */
    public ErleichterungAngefragt getAngefragteErleichterung() {
        return angefragteErleichterung;
    }

    /**
     * Legt den Wert der angefragteErleichterung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ErleichterungAngefragt }
     *     
     */
    public void setAngefragteErleichterung(ErleichterungAngefragt value) {
        this.angefragteErleichterung = value;
    }

}
