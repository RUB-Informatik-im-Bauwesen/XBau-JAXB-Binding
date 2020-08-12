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
 *         &lt;element name="bezug" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Bezug"/>
 *         &lt;element name="stellungnahme" type="{http://www.xleitstelle.de/xbau/schema/2/1/}StellungnahmeBelastenderVerwaltungsakt" maxOccurs="unbounded"/>
 *         &lt;element name="bauvorhabenAenderungsdaten" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Bauvorhaben" minOccurs="0"/>
 *         &lt;element name="anlagen" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Anlagen" minOccurs="0"/>
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
    "bezug",
    "stellungnahme",
    "bauvorhabenAenderungsdaten",
    "anlagen"
})
@XmlRootElement(name = "baugenehmigung.stellungnahme.0204")
public class BaugenehmigungStellungnahme0204
    extends NachrichtPrivat2G
{

    @XmlElement(required = true)
    protected Bezug bezug;
    @XmlElement(required = true)
    protected List<StellungnahmeBelastenderVerwaltungsakt> stellungnahme;
    protected Bauvorhaben bauvorhabenAenderungsdaten;
    protected Anlagen anlagen;

    /**
     * Ruft den Wert der bezug-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Bezug }
     *     
     */
    public Bezug getBezug() {
        return bezug;
    }

    /**
     * Legt den Wert der bezug-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Bezug }
     *     
     */
    public void setBezug(Bezug value) {
        this.bezug = value;
    }

    /**
     * Gets the value of the stellungnahme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stellungnahme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStellungnahme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StellungnahmeBelastenderVerwaltungsakt }
     * 
     * 
     */
    public List<StellungnahmeBelastenderVerwaltungsakt> getStellungnahme() {
        if (stellungnahme == null) {
            stellungnahme = new ArrayList<StellungnahmeBelastenderVerwaltungsakt>();
        }
        return this.stellungnahme;
    }

    /**
     * Ruft den Wert der bauvorhabenAenderungsdaten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Bauvorhaben }
     *     
     */
    public Bauvorhaben getBauvorhabenAenderungsdaten() {
        return bauvorhabenAenderungsdaten;
    }

    /**
     * Legt den Wert der bauvorhabenAenderungsdaten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Bauvorhaben }
     *     
     */
    public void setBauvorhabenAenderungsdaten(Bauvorhaben value) {
        this.bauvorhabenAenderungsdaten = value;
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
