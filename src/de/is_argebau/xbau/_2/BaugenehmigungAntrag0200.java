//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package de.is_argebau.xbau._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.is-argebau.de/xbau/2}Nachricht.privat2G">
 *       &lt;sequence>
 *         &lt;element name="bauvorhaben" type="{http://www.is-argebau.de/xbau/2}Bauvorhaben"/>
 *         &lt;element name="beantragteAbweichung" type="{http://www.is-argebau.de/xbau/2}AbweichungBeantragt" minOccurs="0"/>
 *         &lt;element name="angefragteErleichterung" type="{http://www.is-argebau.de/xbau/2}ErleichterungAngefragt" minOccurs="0"/>
 *         &lt;element name="baulastErklaerung" type="{http://www.is-argebau.de/xbau/2}BaulastErklaerung" minOccurs="0"/>
 *         &lt;element name="anlagen" type="{http://www.is-argebau.de/xbau/2}Anlagen"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bauvorhaben",
    "beantragteAbweichung",
    "angefragteErleichterung",
    "baulastErklaerung",
    "anlagen"
})
@XmlRootElement(name = "baugenehmigung.antrag.0200")
public class BaugenehmigungAntrag0200
    extends NachrichtPrivat2G
{

    @XmlElement(required = true)
    protected Bauvorhaben bauvorhaben;
    protected AbweichungBeantragt beantragteAbweichung;
    protected ErleichterungAngefragt angefragteErleichterung;
    protected BaulastErklaerung baulastErklaerung;
    @XmlElement(required = true)
    protected Anlagen anlagen;

    /**
     * Gets the value of the bauvorhaben property.
     * 
     * @return
     *     possible object is
     *     {@link Bauvorhaben }
     *     
     */
    public Bauvorhaben getBauvorhaben() {
        return bauvorhaben;
    }

    /**
     * Sets the value of the bauvorhaben property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bauvorhaben }
     *     
     */
    public void setBauvorhaben(Bauvorhaben value) {
        this.bauvorhaben = value;
    }

    /**
     * Gets the value of the beantragteAbweichung property.
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
     * Sets the value of the beantragteAbweichung property.
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
     * Gets the value of the angefragteErleichterung property.
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
     * Sets the value of the angefragteErleichterung property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErleichterungAngefragt }
     *     
     */
    public void setAngefragteErleichterung(ErleichterungAngefragt value) {
        this.angefragteErleichterung = value;
    }

    /**
     * Gets the value of the baulastErklaerung property.
     * 
     * @return
     *     possible object is
     *     {@link BaulastErklaerung }
     *     
     */
    public BaulastErklaerung getBaulastErklaerung() {
        return baulastErklaerung;
    }

    /**
     * Sets the value of the baulastErklaerung property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaulastErklaerung }
     *     
     */
    public void setBaulastErklaerung(BaulastErklaerung value) {
        this.baulastErklaerung = value;
    }

    /**
     * Gets the value of the anlagen property.
     * 
     * @return
     *     possible object is
     *     {@link Anlagen }
     *     
     */
    public Anlagen getAnlagen() {
        return anlagen;
    }

    /**
     * Sets the value of the anlagen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anlagen }
     *     
     */
    public void setAnlagen(Anlagen value) {
        this.anlagen = value;
    }

}