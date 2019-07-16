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
import javax.xml.bind.annotation.XmlType;


/**
 * Typ für die an der Umsetzung eines Bauprojekts beteiligten Parteien (Personen und Organisationen).
 * 
 * <p>Java-Klasse für BeteiligteBauprojektUmsetzung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BeteiligteBauprojektUmsetzung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bauherr" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Akteur" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bauleiter" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Akteur" minOccurs="0"/>
 *         &lt;element name="fachbauleiter" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Akteur" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bauunternehmer" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Organisation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeteiligteBauprojektUmsetzung", propOrder = {
    "bauherr",
    "bauleiter",
    "fachbauleiter",
    "bauunternehmer"
})
public class BeteiligteBauprojektUmsetzung {

    protected List<Akteur> bauherr;
    protected Akteur bauleiter;
    protected List<Akteur> fachbauleiter;
    protected Organisation bauunternehmer;

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
     * Ruft den Wert der bauleiter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Akteur }
     *     
     */
    public Akteur getBauleiter() {
        return bauleiter;
    }

    /**
     * Legt den Wert der bauleiter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Akteur }
     *     
     */
    public void setBauleiter(Akteur value) {
        this.bauleiter = value;
    }

    /**
     * Gets the value of the fachbauleiter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fachbauleiter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFachbauleiter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Akteur }
     * 
     * 
     */
    public List<Akteur> getFachbauleiter() {
        if (fachbauleiter == null) {
            fachbauleiter = new ArrayList<Akteur>();
        }
        return this.fachbauleiter;
    }

    /**
     * Ruft den Wert der bauunternehmer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getBauunternehmer() {
        return bauunternehmer;
    }

    /**
     * Legt den Wert der bauunternehmer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     */
    public void setBauunternehmer(Organisation value) {
        this.bauunternehmer = value;
    }

}
