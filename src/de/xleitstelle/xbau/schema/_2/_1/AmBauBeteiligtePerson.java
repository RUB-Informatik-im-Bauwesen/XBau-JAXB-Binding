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
 * Dieser Typ fasst die Merkmale zusammen, die typischerweise zu am Bau beteiligten natürlichen Personen genannt werden bzw. zu nennen sind.
 * 
 * <p>Java-Klasse für AmBauBeteiligtePerson complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AmBauBeteiligtePerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.xleitstelle.de/xbau/schema/2/1/}NameNatuerlichePerson"/>
 *         &lt;element name="anschrift" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Anschrift"/>
 *         &lt;element name="kommunikation" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Kommunikation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmBauBeteiligtePerson", propOrder = {
    "name",
    "anschrift",
    "kommunikation"
})
public class AmBauBeteiligtePerson {

    @XmlElement(required = true)
    protected NameNatuerlichePerson name;
    @XmlElement(required = true)
    protected Anschrift anschrift;
    protected List<Kommunikation> kommunikation;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameNatuerlichePerson }
     *     
     */
    public NameNatuerlichePerson getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameNatuerlichePerson }
     *     
     */
    public void setName(NameNatuerlichePerson value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der anschrift-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Anschrift }
     *     
     */
    public Anschrift getAnschrift() {
        return anschrift;
    }

    /**
     * Legt den Wert der anschrift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Anschrift }
     *     
     */
    public void setAnschrift(Anschrift value) {
        this.anschrift = value;
    }

    /**
     * Gets the value of the kommunikation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kommunikation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKommunikation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kommunikation }
     * 
     * 
     */
    public List<Kommunikation> getKommunikation() {
        if (kommunikation == null) {
            kommunikation = new ArrayList<Kommunikation>();
        }
        return this.kommunikation;
    }

}
