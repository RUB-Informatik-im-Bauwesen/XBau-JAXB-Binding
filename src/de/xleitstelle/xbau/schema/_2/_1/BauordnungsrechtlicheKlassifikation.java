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
 * Eine Instanz dieses Typs stellt in Bezug auf den Gegenstand des Bauvorhabens (Vorhabens) die wichtigsten bauordnungsrechtlichen Parameter zusammen.
 * 
 * <p>Java-Klasse für BauordnungsrechtlicheKlassifikation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BauordnungsrechtlicheKlassifikation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gebaeudeklasse" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.MboGebaeudeklasse" minOccurs="0"/>
 *         &lt;element name="sonderbau" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Sonderbauten" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="garage" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Garagentyp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BauordnungsrechtlicheKlassifikation", propOrder = {
    "gebaeudeklasse",
    "sonderbau",
    "garage"
})
public class BauordnungsrechtlicheKlassifikation {

    protected CodeMboGebaeudeklasse gebaeudeklasse;
    protected List<CodeSonderbauten> sonderbau;
    protected CodeGaragentyp garage;

    /**
     * Ruft den Wert der gebaeudeklasse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeMboGebaeudeklasse }
     *     
     */
    public CodeMboGebaeudeklasse getGebaeudeklasse() {
        return gebaeudeklasse;
    }

    /**
     * Legt den Wert der gebaeudeklasse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeMboGebaeudeklasse }
     *     
     */
    public void setGebaeudeklasse(CodeMboGebaeudeklasse value) {
        this.gebaeudeklasse = value;
    }

    /**
     * Gets the value of the sonderbau property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sonderbau property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSonderbau().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeSonderbauten }
     * 
     * 
     */
    public List<CodeSonderbauten> getSonderbau() {
        if (sonderbau == null) {
            sonderbau = new ArrayList<CodeSonderbauten>();
        }
        return this.sonderbau;
    }

    /**
     * Ruft den Wert der garage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeGaragentyp }
     *     
     */
    public CodeGaragentyp getGarage() {
        return garage;
    }

    /**
     * Legt den Wert der garage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGaragentyp }
     *     
     */
    public void setGarage(CodeGaragentyp value) {
        this.garage = value;
    }

}
