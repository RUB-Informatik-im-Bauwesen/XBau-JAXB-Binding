//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Durch den Typ Akteur wird eine Differenzierung zwischen  natürlichen Einzelpersonen, Personengruppen und juristischen Personen definiert.
 * Im Namen einer Firma handelt eine natürliche Person als Vertreter. Bei mehreren Personen (z.B. Eigentümergemeinschaften) wird jede Person (juristisch oder nätürlich) als Akteur definiert. Eine Person dieser Gruppe kann als Vertreter definiert werden.
 * 
 * <p>Java-Klasse für Akteur complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Akteur">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="natuerlichePerson" type="{http://www.xleitstelle.de/xbau/schema/2/1/}AmBauBeteiligtePerson" minOccurs="0"/>
 *         &lt;element name="organisation" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Organisation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Akteur", propOrder = {
    "natuerlichePerson",
    "organisation"
})
public class Akteur {

    protected AmBauBeteiligtePerson natuerlichePerson;
    protected Organisation organisation;

    /**
     * Ruft den Wert der natuerlichePerson-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AmBauBeteiligtePerson }
     *     
     */
    public AmBauBeteiligtePerson getNatuerlichePerson() {
        return natuerlichePerson;
    }

    /**
     * Legt den Wert der natuerlichePerson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AmBauBeteiligtePerson }
     *     
     */
    public void setNatuerlichePerson(AmBauBeteiligtePerson value) {
        this.natuerlichePerson = value;
    }

    /**
     * Ruft den Wert der organisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getOrganisation() {
        return organisation;
    }

    /**
     * Legt den Wert der organisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     */
    public void setOrganisation(Organisation value) {
        this.organisation = value;
    }

}
