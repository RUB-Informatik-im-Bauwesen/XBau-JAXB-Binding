//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package de.osci.xinneres.postanschrift._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Datentyp beinhaltet die Angaben für die Adressierung im Inland. Es können entweder Angaben zu einer Gebäudeanschrift oder zu einer Postfachanschrift übermittelt werden.
 * 
 * <p>Java class for PostalischeInlandsanschrift complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalischeInlandsanschrift">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="gebaeude" type="{http://www.osci.de/xinneres/postanschrift/2}PostalischeInlandsanschrift.Gebaeudeanschrift"/>
 *         &lt;element name="postfach" type="{http://www.osci.de/xinneres/postanschrift/2}PostalischeInlandsanschrift.Postfachanschrift"/>
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
     * Gets the value of the gebaeude property.
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
     * Sets the value of the gebaeude property.
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
     * Gets the value of the postfach property.
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
     * Sets the value of the postfach property.
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