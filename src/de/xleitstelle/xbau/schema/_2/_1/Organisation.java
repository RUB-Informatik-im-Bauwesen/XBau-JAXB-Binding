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
 * Eine Organisation ist eine  Vereinigung mehrerer natürlicher oder juristischer Personen bzw. eine rechtsfähige Personengesellschaft zu einem gemeinsamen Zweck, z.B.  im wirtschaftlichen, gemeinnützigen, religiösen, öffentlichen oder politischen Bereich.
 * 
 * <p>Java-Klasse für Organisation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Organisation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.xleitstelle.de/xbau/schema/2/1/}NameOrganisation"/>
 *         &lt;element name="anschrift" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Anschrift" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="kommunikation" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Kommunikation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vertreter" type="{http://www.xleitstelle.de/xbau/schema/2/1/}NameNatuerlichePerson" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation", propOrder = {
    "name",
    "anschrift",
    "kommunikation",
    "vertreter"
})
public class Organisation {

    @XmlElement(required = true)
    protected NameOrganisation name;
    protected List<Anschrift> anschrift;
    protected List<Kommunikation> kommunikation;
    protected NameNatuerlichePerson vertreter;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameOrganisation }
     *     
     */
    public NameOrganisation getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameOrganisation }
     *     
     */
    public void setName(NameOrganisation value) {
        this.name = value;
    }

    /**
     * Gets the value of the anschrift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anschrift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnschrift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Anschrift }
     * 
     * 
     */
    public List<Anschrift> getAnschrift() {
        if (anschrift == null) {
            anschrift = new ArrayList<Anschrift>();
        }
        return this.anschrift;
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

    /**
     * Ruft den Wert der vertreter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameNatuerlichePerson }
     *     
     */
    public NameNatuerlichePerson getVertreter() {
        return vertreter;
    }

    /**
     * Legt den Wert der vertreter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameNatuerlichePerson }
     *     
     */
    public void setVertreter(NameNatuerlichePerson value) {
        this.vertreter = value;
    }

}
