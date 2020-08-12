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
 * Dieser Typ nimmt die Parameter einer Stellungnahme auf, mit der sich ein Antragsteller zu einem  belastenden Verwaltungsakt äußert.
 * 
 * <p>Java-Klasse für StellungnahmeBelastenderVerwaltungsakt complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StellungnahmeBelastenderVerwaltungsakt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bezeichnungRegelverstoss" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *         &lt;element name="stellungnahme" type="{http://www.xleitstelle.de/xbau/schema/2/1/}TextFormatiert"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StellungnahmeBelastenderVerwaltungsakt", propOrder = {
    "bezeichnungRegelverstoss",
    "stellungnahme"
})
public class StellungnahmeBelastenderVerwaltungsakt {

    @XmlElement(required = true)
    protected String bezeichnungRegelverstoss;
    @XmlElement(required = true)
    protected TextFormatiert stellungnahme;

    /**
     * Ruft den Wert der bezeichnungRegelverstoss-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBezeichnungRegelverstoss() {
        return bezeichnungRegelverstoss;
    }

    /**
     * Legt den Wert der bezeichnungRegelverstoss-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBezeichnungRegelverstoss(String value) {
        this.bezeichnungRegelverstoss = value;
    }

    /**
     * Ruft den Wert der stellungnahme-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextFormatiert }
     *     
     */
    public TextFormatiert getStellungnahme() {
        return stellungnahme;
    }

    /**
     * Legt den Wert der stellungnahme-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextFormatiert }
     *     
     */
    public void setStellungnahme(TextFormatiert value) {
        this.stellungnahme = value;
    }

}
