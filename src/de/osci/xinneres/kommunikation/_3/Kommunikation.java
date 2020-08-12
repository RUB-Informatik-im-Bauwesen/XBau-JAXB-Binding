//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.osci.xinneres.kommunikation._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Angaben zur Erreichbarkeit einer Behörde oder einer Person (Telefon, Fax, E-Mail, etc.).
 * 
 * <p>Java-Klasse für Kommunikation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Kommunikation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kanal" type="{http://www.osci.de/xinneres/kommunikation/3}Code.Erreichbarkeit"/>
 *         &lt;element name="kennung" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin"/>
 *         &lt;element name="zusatz" type="{http://xoev.de/latinchars/1_1/datatypes}String.Latin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kommunikation", propOrder = {
    "kanal",
    "kennung",
    "zusatz"
})
public class Kommunikation {

    @XmlElement(required = true)
    protected CodeErreichbarkeit kanal;
    @XmlElement(required = true)
    protected String kennung;
    protected String zusatz;

    /**
     * Ruft den Wert der kanal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeErreichbarkeit }
     *     
     */
    public CodeErreichbarkeit getKanal() {
        return kanal;
    }

    /**
     * Legt den Wert der kanal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeErreichbarkeit }
     *     
     */
    public void setKanal(CodeErreichbarkeit value) {
        this.kanal = value;
    }

    /**
     * Ruft den Wert der kennung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKennung() {
        return kennung;
    }

    /**
     * Legt den Wert der kennung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKennung(String value) {
        this.kennung = value;
    }

    /**
     * Ruft den Wert der zusatz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZusatz() {
        return zusatz;
    }

    /**
     * Legt den Wert der zusatz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatz(String value) {
        this.zusatz = value;
    }

}
