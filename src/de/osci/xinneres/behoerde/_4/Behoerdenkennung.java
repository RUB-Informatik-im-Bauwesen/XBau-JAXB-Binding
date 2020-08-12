//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.osci.xinneres.behoerde._4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Die Behoerdenkennung fasst die Elemente zusammen, unter denen eine Behörde als Anbieter elektronischer Services im DVDV verzeichnet ist. Sie besteht aus einem Präfix und der eigentlichen Kennung. Grundsätzlich gibt es zu jedem Präfix eine entsprechende Schlüsseltabelle für die Kennung.
 * 
 * Zum Beispiel werden Standesämter über das Präfix psw und die Standesamtsnummer adressiert.
 * 
 * <p>Java-Klasse für Behoerdenkennung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Behoerdenkennung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="praefix" type="{http://www.osci.de/xinneres/behoerde/4}Code.Praefix"/>
 *         &lt;element name="kennung" type="{http://www.osci.de/xinneres/behoerde/4}Code.Behoerdenkennung"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Behoerdenkennung", propOrder = {
    "praefix",
    "kennung"
})
public class Behoerdenkennung {

    @XmlElement(required = true)
    protected CodePraefix praefix;
    @XmlElement(required = true)
    protected CodeBehoerdenkennung kennung;

    /**
     * Ruft den Wert der praefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodePraefix }
     *     
     */
    public CodePraefix getPraefix() {
        return praefix;
    }

    /**
     * Legt den Wert der praefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodePraefix }
     *     
     */
    public void setPraefix(CodePraefix value) {
        this.praefix = value;
    }

    /**
     * Ruft den Wert der kennung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeBehoerdenkennung }
     *     
     */
    public CodeBehoerdenkennung getKennung() {
        return kennung;
    }

    /**
     * Legt den Wert der kennung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeBehoerdenkennung }
     *     
     */
    public void setKennung(CodeBehoerdenkennung value) {
        this.kennung = value;
    }

}
