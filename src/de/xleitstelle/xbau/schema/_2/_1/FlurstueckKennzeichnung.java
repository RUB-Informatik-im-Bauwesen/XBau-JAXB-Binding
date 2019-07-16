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
 * Typ zur eindeutigen Identifikation eines Flurstücks.
 * Ein Flurstück ist ein amtlich vermessener Teil der Erdoberfläche. Das Liegenschaftskataster ordnet jedem Flurstück des jeweiligen Nummerierungsbezirks (Flur oder Gemarkung) eine Flurstücksnummer zu.
 * 
 * <p>Java-Klasse für FlurstueckKennzeichnung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlurstueckKennzeichnung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bundesland" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Bundesland"/>
 *         &lt;element name="flurstueck" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Geokodierung"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlurstueckKennzeichnung", propOrder = {
    "bundesland",
    "flurstueck"
})
public class FlurstueckKennzeichnung {

    @XmlElement(required = true)
    protected CodeBundesland bundesland;
    @XmlElement(required = true)
    protected Geokodierung flurstueck;

    /**
     * Ruft den Wert der bundesland-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeBundesland }
     *     
     */
    public CodeBundesland getBundesland() {
        return bundesland;
    }

    /**
     * Legt den Wert der bundesland-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeBundesland }
     *     
     */
    public void setBundesland(CodeBundesland value) {
        this.bundesland = value;
    }

    /**
     * Ruft den Wert der flurstueck-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Geokodierung }
     *     
     */
    public Geokodierung getFlurstueck() {
        return flurstueck;
    }

    /**
     * Legt den Wert der flurstueck-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Geokodierung }
     *     
     */
    public void setFlurstueck(Geokodierung value) {
        this.flurstueck = value;
    }

}
