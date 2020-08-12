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
import net.opengis.gml._3.PolygonType;


/**
 * In eine Instanz diesen Typs werden die Geodaten eines Vorhabens oder einer sonstigen Entität eintragen.
 * 
 * <p>Java-Klasse für GeoreferenzierteLage complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeoreferenzierteLage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flaeche" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="polygon" type="{http://www.opengis.net/gml/3.2}PolygonType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="erlaeuterung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoreferenzierteLage", propOrder = {
    "flaeche",
    "erlaeuterung"
})
public class GeoreferenzierteLage {

    @XmlElement(required = true)
    protected List<GeoreferenzierteLage.Flaeche> flaeche;
    protected String erlaeuterung;

    /**
     * Gets the value of the flaeche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flaeche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlaeche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoreferenzierteLage.Flaeche }
     * 
     * 
     */
    public List<GeoreferenzierteLage.Flaeche> getFlaeche() {
        if (flaeche == null) {
            flaeche = new ArrayList<GeoreferenzierteLage.Flaeche>();
        }
        return this.flaeche;
    }

    /**
     * Ruft den Wert der erlaeuterung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErlaeuterung() {
        return erlaeuterung;
    }

    /**
     * Legt den Wert der erlaeuterung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErlaeuterung(String value) {
        this.erlaeuterung = value;
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
     *         &lt;element name="polygon" type="{http://www.opengis.net/gml/3.2}PolygonType"/>
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
        "polygon"
    })
    public static class Flaeche {

        @XmlElement(required = true)
        protected PolygonType polygon;

        /**
         * Ruft den Wert der polygon-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link PolygonType }
         *     
         */
        public PolygonType getPolygon() {
            return polygon;
        }

        /**
         * Legt den Wert der polygon-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link PolygonType }
         *     
         */
        public void setPolygon(PolygonType value) {
            this.polygon = value;
        }

    }

}
