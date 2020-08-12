//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.osci.xinneres.behoerde._4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import de.osci.xinneres.kommunikation._3.Kommunikation;
import de.osci.xinneres.postanschrift._3.PostalischeInlandsanschrift;


/**
 * Dieser Typ enthält Angaben über den Namen und die Erreichbarkeit einer Behörde. Eine Behörde  im Sinne des Verwaltungsverfahrensgesetzes ist jede Stelle, die Aufgaben der öffentlichen Verwaltung wahrnimmt.
 * 
 * <p>Java-Klasse für Behoerde complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Behoerde">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="behoerdenkennung" type="{http://www.osci.de/xinneres/behoerde/4}Behoerdenkennung"/>
 *         &lt;element name="erreichbarkeit" type="{http://www.osci.de/xinneres/kommunikation/3}Kommunikation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="anschrift" type="{http://www.osci.de/xinneres/postanschrift/3}PostalischeInlandsanschrift" minOccurs="0"/>
 *         &lt;element name="behoerdenname" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Behoerde", propOrder = {
    "behoerdenkennung",
    "erreichbarkeit",
    "anschrift",
    "behoerdenname"
})
@XmlSeeAlso({
    BehoerdeErreichbar.class
})
public class Behoerde {

    @XmlElement(required = true)
    protected Behoerdenkennung behoerdenkennung;
    protected List<Kommunikation> erreichbarkeit;
    protected PostalischeInlandsanschrift anschrift;
    @XmlElement(required = true)
    protected String behoerdenname;

    /**
     * Ruft den Wert der behoerdenkennung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Behoerdenkennung }
     *     
     */
    public Behoerdenkennung getBehoerdenkennung() {
        return behoerdenkennung;
    }

    /**
     * Legt den Wert der behoerdenkennung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Behoerdenkennung }
     *     
     */
    public void setBehoerdenkennung(Behoerdenkennung value) {
        this.behoerdenkennung = value;
    }

    /**
     * Gets the value of the erreichbarkeit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erreichbarkeit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErreichbarkeit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kommunikation }
     * 
     * 
     */
    public List<Kommunikation> getErreichbarkeit() {
        if (erreichbarkeit == null) {
            erreichbarkeit = new ArrayList<Kommunikation>();
        }
        return this.erreichbarkeit;
    }

    /**
     * Ruft den Wert der anschrift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostalischeInlandsanschrift }
     *     
     */
    public PostalischeInlandsanschrift getAnschrift() {
        return anschrift;
    }

    /**
     * Legt den Wert der anschrift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalischeInlandsanschrift }
     *     
     */
    public void setAnschrift(PostalischeInlandsanschrift value) {
        this.anschrift = value;
    }

    /**
     * Ruft den Wert der behoerdenname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehoerdenname() {
        return behoerdenname;
    }

    /**
     * Legt den Wert der behoerdenname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehoerdenname(String value) {
        this.behoerdenname = value;
    }

}
