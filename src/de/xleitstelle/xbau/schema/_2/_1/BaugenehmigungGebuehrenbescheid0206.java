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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xleitstelle.de/xbau/schema/2/1/}Nachricht.G2privat">
 *       &lt;sequence>
 *         &lt;element name="bezug" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Bezug"/>
 *         &lt;element name="gebuehrenbescheid" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Gebuehrenbescheid"/>
 *         &lt;element name="frist" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bezug",
    "gebuehrenbescheid",
    "frist"
})
@XmlRootElement(name = "baugenehmigung.gebuehrenbescheid.0206")
public class BaugenehmigungGebuehrenbescheid0206
    extends NachrichtG2Privat
{

    @XmlElement(required = true)
    protected Bezug bezug;
    @XmlElement(required = true)
    protected Gebuehrenbescheid gebuehrenbescheid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frist;

    /**
     * Ruft den Wert der bezug-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Bezug }
     *     
     */
    public Bezug getBezug() {
        return bezug;
    }

    /**
     * Legt den Wert der bezug-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Bezug }
     *     
     */
    public void setBezug(Bezug value) {
        this.bezug = value;
    }

    /**
     * Ruft den Wert der gebuehrenbescheid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Gebuehrenbescheid }
     *     
     */
    public Gebuehrenbescheid getGebuehrenbescheid() {
        return gebuehrenbescheid;
    }

    /**
     * Legt den Wert der gebuehrenbescheid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Gebuehrenbescheid }
     *     
     */
    public void setGebuehrenbescheid(Gebuehrenbescheid value) {
        this.gebuehrenbescheid = value;
    }

    /**
     * Ruft den Wert der frist-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrist() {
        return frist;
    }

    /**
     * Legt den Wert der frist-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrist(XMLGregorianCalendar value) {
        this.frist = value;
    }

}
