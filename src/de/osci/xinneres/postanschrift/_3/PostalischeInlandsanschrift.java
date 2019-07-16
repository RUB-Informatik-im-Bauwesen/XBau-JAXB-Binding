//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.osci.xinneres.postanschrift._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Datentyp beinhaltet die Angaben für die Adressierung im Inland. Es können entweder Angaben zu einer Gebäudeanschrift oder zu einer Postfachanschrift übermittelt werden.
 * 
 * <p>Java-Klasse für PostalischeInlandsanschrift complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PostalischeInlandsanschrift">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="gebaeude" type="{http://www.osci.de/xinneres/postanschrift/3}PostalischeInlandsanschrift.Gebaeudeanschrift"/>
 *         &lt;element name="postfach" type="{http://www.osci.de/xinneres/postanschrift/3}PostalischeInlandsanschrift.Postfachanschrift"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalischeInlandsanschrift", propOrder = {
    "gebaeude",
    "postfach"
})
public class PostalischeInlandsanschrift {

    protected PostalischeInlandsanschriftGebaeudeanschrift gebaeude;
    protected PostalischeInlandsanschriftPostfachanschrift postfach;

    /**
     * Ruft den Wert der gebaeude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostalischeInlandsanschriftGebaeudeanschrift }
     *     
     */
    public PostalischeInlandsanschriftGebaeudeanschrift getGebaeude() {
        return gebaeude;
    }

    /**
     * Legt den Wert der gebaeude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalischeInlandsanschriftGebaeudeanschrift }
     *     
     */
    public void setGebaeude(PostalischeInlandsanschriftGebaeudeanschrift value) {
        this.gebaeude = value;
    }

    /**
     * Ruft den Wert der postfach-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostalischeInlandsanschriftPostfachanschrift }
     *     
     */
    public PostalischeInlandsanschriftPostfachanschrift getPostfach() {
        return postfach;
    }

    /**
     * Legt den Wert der postfach-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalischeInlandsanschriftPostfachanschrift }
     *     
     */
    public void setPostfach(PostalischeInlandsanschriftPostfachanschrift value) {
        this.postfach = value;
    }

}
