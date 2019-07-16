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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import de.xoev.schemata.code._1_0.Code;


/**
 * Dieser Typ enthält die für die Identifikation einer Nachricht erforderlichen Informationen. Er kann verwendet werden, um
 * 
 *   Identifizierungsmerkmale zu setzen, auf die sich Leser oder Empfänger beziehen kann (Verwendung im Nachrichtenkopf)   oder
 *   sich auf Identifizierungsmerkmale einer übermittelten Nachricht zu beziehen (Verwendung im Nachrichteninhalt von Reaktions- oder RtS-Nachrichten).
 * 
 * Darüber hinaus enthält der Typ den Erstellungszeitpunkt.
 * 
 * <p>Java-Klasse für Identifikation.Nachricht complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Identifikation.Nachricht">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nachrichtenUUID" type="{http://www.osci.de/xinneres/basisnachricht/4}UUID"/>
 *         &lt;element name="nachrichtentyp" type="{http://xoev.de/schemata/code/1_0}Code"/>
 *         &lt;element name="erstellungszeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifikation.Nachricht", propOrder = {
    "nachrichtenUUID",
    "nachrichtentyp",
    "erstellungszeitpunkt"
})
@XmlSeeAlso({
    de.xleitstelle.xbau.schema._2._1.IdentifikationNachricht.class,
    IdentifikationNachrichtTyp4 .class
})
public class IdentifikationNachricht {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nachrichtenUUID;
    @XmlElement(required = true)
    protected Code nachrichtentyp;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar erstellungszeitpunkt;

    /**
     * Ruft den Wert der nachrichtenUUID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNachrichtenUUID() {
        return nachrichtenUUID;
    }

    /**
     * Legt den Wert der nachrichtenUUID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNachrichtenUUID(String value) {
        this.nachrichtenUUID = value;
    }

    /**
     * Ruft den Wert der nachrichtentyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getNachrichtentyp() {
        return nachrichtentyp;
    }

    /**
     * Legt den Wert der nachrichtentyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setNachrichtentyp(Code value) {
        this.nachrichtentyp = value;
    }

    /**
     * Ruft den Wert der erstellungszeitpunkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErstellungszeitpunkt() {
        return erstellungszeitpunkt;
    }

    /**
     * Legt den Wert der erstellungszeitpunkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErstellungszeitpunkt(XMLGregorianCalendar value) {
        this.erstellungszeitpunkt = value;
    }

}
