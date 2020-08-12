//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.osci.xinneres.basisnachricht._4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Dieser Typ enthält Angaben, die ein Ereignis eindeutig identifizieren und es dem Leser einer Nachricht ermöglichen, die Reihenfolge von Ereignissen beim Autor nachzuvollziehen.
 * Sofern dieses Element in einer Nachricht mit mehreren Datensätzen verwendet wird (Sammelnachricht), dient es der Identifikation des Einzelfalls. Es  muss dann entsprechend für jeden Einzelfall in der Sammelnachricht übermittelt werden.
 * 
 * <p>Java-Klasse für Identifikation.Ereignis complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Identifikation.Ereignis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ereignis.zeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ereignis.zeichen" type="{http://www.osci.de/xinneres/basisnachricht/4}Identifikation.Ereignis.Zeichen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifikation.Ereignis", propOrder = {
    "ereignisZeitpunkt",
    "ereignisZeichen"
})
public class IdentifikationEreignis {

    @XmlElement(name = "ereignis.zeitpunkt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ereignisZeitpunkt;
    @XmlElement(name = "ereignis.zeichen", required = true)
    protected String ereignisZeichen;

    /**
     * Ruft den Wert der ereignisZeitpunkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEreignisZeitpunkt() {
        return ereignisZeitpunkt;
    }

    /**
     * Legt den Wert der ereignisZeitpunkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEreignisZeitpunkt(XMLGregorianCalendar value) {
        this.ereignisZeitpunkt = value;
    }

    /**
     * Ruft den Wert der ereignisZeichen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEreignisZeichen() {
        return ereignisZeichen;
    }

    /**
     * Legt den Wert der ereignisZeichen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEreignisZeichen(String value) {
        this.ereignisZeichen = value;
    }

}
