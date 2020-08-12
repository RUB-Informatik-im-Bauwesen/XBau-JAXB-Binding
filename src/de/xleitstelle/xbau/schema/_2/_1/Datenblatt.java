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
 * Dieser Typ dient zur Zusammenstellung von technischen Daten und Kennzahlen zum Bauvorhaben. Seine Daten werden für die Prüfung des  Bauvorhabens durch die Bauaufsichtsbehörde erhoben, aber auch im Hinblick auf eine Datenlieferung an die amtliche Statistik. Die Elemente des Typs sind optional, um ihn in den Ländern je nach rechtlicher Situation und Prioritätensetzung durch Behörden flexibel einsetzbar zu machen.
 * 
 * Die Angaben im Datenblatt sind auf den jeweils neuen Zustand (Zustand nach Durchführung des Bauvorhabens) zu beziehen und decken so alle Arten von Bauvorhaben (nicht nur die Errichtung, sondern auch Erweiterung und Nutzungsänderung) ab. Veränderungen (also bspw. das Delta zwischen Zustand alt und neu bei einer Erweiterung) sind nicht im vorliegenen Typ abgebildet, sondern sind aus der Historisierung der Daten erkennbar.
 * 
 * <p>Java-Klasse für Datenblatt complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Datenblatt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bauordnungsrechtlicheKlassifikation" type="{http://www.xleitstelle.de/xbau/schema/2/1/}BauordnungsrechtlicheKlassifikation" minOccurs="0"/>
 *         &lt;element name="baulicheNutzungMass" type="{http://www.xleitstelle.de/xbau/schema/2/1/}BaulicheNutzungMass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bauweise" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Bauweise" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Datenblatt", propOrder = {
    "bauordnungsrechtlicheKlassifikation",
    "baulicheNutzungMass",
    "bauweise"
})
public class Datenblatt {

    protected BauordnungsrechtlicheKlassifikation bauordnungsrechtlicheKlassifikation;
    protected List<BaulicheNutzungMass> baulicheNutzungMass;
    protected CodeBauweise bauweise;

    /**
     * Ruft den Wert der bauordnungsrechtlicheKlassifikation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BauordnungsrechtlicheKlassifikation }
     *     
     */
    public BauordnungsrechtlicheKlassifikation getBauordnungsrechtlicheKlassifikation() {
        return bauordnungsrechtlicheKlassifikation;
    }

    /**
     * Legt den Wert der bauordnungsrechtlicheKlassifikation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BauordnungsrechtlicheKlassifikation }
     *     
     */
    public void setBauordnungsrechtlicheKlassifikation(BauordnungsrechtlicheKlassifikation value) {
        this.bauordnungsrechtlicheKlassifikation = value;
    }

    /**
     * Gets the value of the baulicheNutzungMass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baulicheNutzungMass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaulicheNutzungMass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaulicheNutzungMass }
     * 
     * 
     */
    public List<BaulicheNutzungMass> getBaulicheNutzungMass() {
        if (baulicheNutzungMass == null) {
            baulicheNutzungMass = new ArrayList<BaulicheNutzungMass>();
        }
        return this.baulicheNutzungMass;
    }

    /**
     * Ruft den Wert der bauweise-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeBauweise }
     *     
     */
    public CodeBauweise getBauweise() {
        return bauweise;
    }

    /**
     * Legt den Wert der bauweise-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeBauweise }
     *     
     */
    public void setBauweise(CodeBauweise value) {
        this.bauweise = value;
    }

}
