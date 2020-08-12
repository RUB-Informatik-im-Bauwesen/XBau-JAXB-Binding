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
import de.osci.xinneres.behoerde._4.BehoerdeErreichbar;


/**
 * Nachrichtenkopf für Nachrichten von Behörden an Private.
 * 
 * <p>Java-Klasse für Nachrichtenkopf.G2privat complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Nachrichtenkopf.G2privat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifikation.nachricht" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Identifikation.Nachricht" form="unqualified"/>
 *         &lt;element name="leser" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Akteur" form="unqualified"/>
 *         &lt;element name="autor" type="{http://www.osci.de/xinneres/behoerde/4}Behoerde.Erreichbar" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nachrichtenkopf.G2privat", propOrder = {
    "identifikationNachricht",
    "leser",
    "autor"
})
public class NachrichtenkopfG2Privat {

    @XmlElement(name = "identifikation.nachricht", namespace = "", required = true)
    protected IdentifikationNachricht identifikationNachricht;
    @XmlElement(namespace = "", required = true)
    protected Akteur leser;
    @XmlElement(namespace = "", required = true)
    protected BehoerdeErreichbar autor;

    /**
     * Ruft den Wert der identifikationNachricht-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentifikationNachricht }
     *     
     */
    public IdentifikationNachricht getIdentifikationNachricht() {
        return identifikationNachricht;
    }

    /**
     * Legt den Wert der identifikationNachricht-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifikationNachricht }
     *     
     */
    public void setIdentifikationNachricht(IdentifikationNachricht value) {
        this.identifikationNachricht = value;
    }

    /**
     * Ruft den Wert der leser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Akteur }
     *     
     */
    public Akteur getLeser() {
        return leser;
    }

    /**
     * Legt den Wert der leser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Akteur }
     *     
     */
    public void setLeser(Akteur value) {
        this.leser = value;
    }

    /**
     * Ruft den Wert der autor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BehoerdeErreichbar }
     *     
     */
    public BehoerdeErreichbar getAutor() {
        return autor;
    }

    /**
     * Legt den Wert der autor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BehoerdeErreichbar }
     *     
     */
    public void setAutor(BehoerdeErreichbar value) {
        this.autor = value;
    }

}
