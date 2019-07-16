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
 * Typ für die an einem (sich in Planung befindlichen) Bauprojekt beteiligten Parteien (Personen und Organisationen).
 * 
 * <p>Java-Klasse für BeteiligteBauprojektInPlanung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BeteiligteBauprojektInPlanung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bauherr" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Akteur" maxOccurs="unbounded"/>
 *         &lt;element name="bevollmaechtigter" type="{http://www.xleitstelle.de/xbau/schema/2/1/}AmBauBeteiligtePerson" minOccurs="0"/>
 *         &lt;element name="grundstueckseigentuemer" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Akteur" minOccurs="0"/>
 *         &lt;element name="entwurfsverfasser" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Entwurfsverfasser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeteiligteBauprojektInPlanung", propOrder = {
    "bauherr",
    "bevollmaechtigter",
    "grundstueckseigentuemer",
    "entwurfsverfasser"
})
public class BeteiligteBauprojektInPlanung {

    @XmlElement(required = true)
    protected List<Akteur> bauherr;
    protected AmBauBeteiligtePerson bevollmaechtigter;
    protected Akteur grundstueckseigentuemer;
    protected Entwurfsverfasser entwurfsverfasser;

    /**
     * Gets the value of the bauherr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bauherr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBauherr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Akteur }
     * 
     * 
     */
    public List<Akteur> getBauherr() {
        if (bauherr == null) {
            bauherr = new ArrayList<Akteur>();
        }
        return this.bauherr;
    }

    /**
     * Ruft den Wert der bevollmaechtigter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AmBauBeteiligtePerson }
     *     
     */
    public AmBauBeteiligtePerson getBevollmaechtigter() {
        return bevollmaechtigter;
    }

    /**
     * Legt den Wert der bevollmaechtigter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AmBauBeteiligtePerson }
     *     
     */
    public void setBevollmaechtigter(AmBauBeteiligtePerson value) {
        this.bevollmaechtigter = value;
    }

    /**
     * Ruft den Wert der grundstueckseigentuemer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Akteur }
     *     
     */
    public Akteur getGrundstueckseigentuemer() {
        return grundstueckseigentuemer;
    }

    /**
     * Legt den Wert der grundstueckseigentuemer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Akteur }
     *     
     */
    public void setGrundstueckseigentuemer(Akteur value) {
        this.grundstueckseigentuemer = value;
    }

    /**
     * Ruft den Wert der entwurfsverfasser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Entwurfsverfasser }
     *     
     */
    public Entwurfsverfasser getEntwurfsverfasser() {
        return entwurfsverfasser;
    }

    /**
     * Legt den Wert der entwurfsverfasser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Entwurfsverfasser }
     *     
     */
    public void setEntwurfsverfasser(Entwurfsverfasser value) {
        this.entwurfsverfasser = value;
    }

}
