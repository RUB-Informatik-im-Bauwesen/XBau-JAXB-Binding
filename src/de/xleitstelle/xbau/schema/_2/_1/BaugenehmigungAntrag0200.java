//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.22 um 08:18:47 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xleitstelle.de/xbau/schema/2/1/}Nachricht.privat2G">
 *       &lt;sequence>
 *         &lt;element name="referenzAntragsteller" type="{http://www.xleitstelle.de/xbau/schema/2/1/}ReferenzAntragsteller"/>
 *         &lt;element name="bauvorhaben" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Bauvorhaben"/>
 *         &lt;element name="beantragteAbweichung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}AbweichungBeantragt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="angefragteErleichterung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}ErleichterungAngefragt" minOccurs="0"/>
 *         &lt;element name="baulastErklaerung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}BaulastErklaerung" minOccurs="0"/>
 *         &lt;element name="anlagen" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Anlagen"/>
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
    "referenzAntragsteller",
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
    protected ReferenzAntragsteller referenzAntragsteller;
    @XmlElement(required = true)
    protected Bauvorhaben bauvorhaben;
    protected List<AbweichungBeantragt> beantragteAbweichung;
    protected ErleichterungAngefragt angefragteErleichterung;
    protected BaulastErklaerung baulastErklaerung;
    @XmlElement(required = true)
    protected Anlagen anlagen;

    /**
     * Ruft den Wert der referenzAntragsteller-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenzAntragsteller }
     *     
     */
    public ReferenzAntragsteller getReferenzAntragsteller() {
        return referenzAntragsteller;
    }

    /**
     * Legt den Wert der referenzAntragsteller-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenzAntragsteller }
     *     
     */
    public void setReferenzAntragsteller(ReferenzAntragsteller value) {
        this.referenzAntragsteller = value;
    }

    /**
     * Ruft den Wert der bauvorhaben-Eigenschaft ab.
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
     * Legt den Wert der bauvorhaben-Eigenschaft fest.
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beantragteAbweichung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeantragteAbweichung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbweichungBeantragt }
     * 
     * 
     */
    public List<AbweichungBeantragt> getBeantragteAbweichung() {
        if (beantragteAbweichung == null) {
            beantragteAbweichung = new ArrayList<AbweichungBeantragt>();
        }
        return this.beantragteAbweichung;
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

    /**
     * Ruft den Wert der baulastErklaerung-Eigenschaft ab.
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
     * Legt den Wert der baulastErklaerung-Eigenschaft fest.
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
     * Ruft den Wert der anlagen-Eigenschaft ab.
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
     * Legt den Wert der anlagen-Eigenschaft fest.
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
