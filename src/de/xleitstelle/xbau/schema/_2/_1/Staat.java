//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Als Staat bezeichnet man eine politische Ordnung, die ein gemeinsames als Staatsgebiet abgegrenztes Territorium, ein dazugehöriges Staatsvolk und eine Machtausübung über dieses umfasst.
 * 
 * <p>Java-Klasse für Staat complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Staat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staat" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Staat"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Staat", propOrder = {
    "staat"
})
public class Staat {

    @XmlElement(required = true)
    protected CodeStaat staat;

    /**
     * Ruft den Wert der staat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeStaat }
     *     
     */
    public CodeStaat getStaat() {
        return staat;
    }

    /**
     * Legt den Wert der staat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeStaat }
     *     
     */
    public void setStaat(CodeStaat value) {
        this.staat = value;
    }

}
