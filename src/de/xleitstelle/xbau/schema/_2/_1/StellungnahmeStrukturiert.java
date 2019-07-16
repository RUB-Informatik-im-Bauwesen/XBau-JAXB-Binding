//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.xleitstelle.xbau.schema._2._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ beinhaltet die Parameter einer strukturierten Stellungname, den die beteiligte Behörde für die Zustellung ihrer Stellungnahme verwenden kann.
 * 
 * <p>Java-Klasse für StellungnahmeStrukturiert complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StellungnahmeStrukturiert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tenor">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="istZustimmung" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rechtsbereich" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Rechtsbereich"/>
 *         &lt;element name="abweichung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}AbweichungBearbeitet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nebenbestimmung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Nebenbestimmung" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="begruendung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}TextFormatiert" minOccurs="0"/>
 *         &lt;element name="anlagen" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Anlagen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StellungnahmeStrukturiert", propOrder = {
    "tenor",
    "rechtsbereich",
    "abweichung",
    "nebenbestimmung",
    "begruendung",
    "anlagen"
})
public class StellungnahmeStrukturiert {

    @XmlElement(required = true)
    protected StellungnahmeStrukturiert.Tenor tenor;
    @XmlElement(required = true)
    protected CodeRechtsbereich rechtsbereich;
    protected List<AbweichungBearbeitet> abweichung;
    protected List<Nebenbestimmung> nebenbestimmung;
    protected TextFormatiert begruendung;
    @XmlElement(required = true)
    protected Anlagen anlagen;

    /**
     * Ruft den Wert der tenor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StellungnahmeStrukturiert.Tenor }
     *     
     */
    public StellungnahmeStrukturiert.Tenor getTenor() {
        return tenor;
    }

    /**
     * Legt den Wert der tenor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StellungnahmeStrukturiert.Tenor }
     *     
     */
    public void setTenor(StellungnahmeStrukturiert.Tenor value) {
        this.tenor = value;
    }

    /**
     * Ruft den Wert der rechtsbereich-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeRechtsbereich }
     *     
     */
    public CodeRechtsbereich getRechtsbereich() {
        return rechtsbereich;
    }

    /**
     * Legt den Wert der rechtsbereich-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeRechtsbereich }
     *     
     */
    public void setRechtsbereich(CodeRechtsbereich value) {
        this.rechtsbereich = value;
    }

    /**
     * Gets the value of the abweichung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abweichung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbweichung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbweichungBearbeitet }
     * 
     * 
     */
    public List<AbweichungBearbeitet> getAbweichung() {
        if (abweichung == null) {
            abweichung = new ArrayList<AbweichungBearbeitet>();
        }
        return this.abweichung;
    }

    /**
     * Gets the value of the nebenbestimmung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nebenbestimmung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNebenbestimmung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nebenbestimmung }
     * 
     * 
     */
    public List<Nebenbestimmung> getNebenbestimmung() {
        if (nebenbestimmung == null) {
            nebenbestimmung = new ArrayList<Nebenbestimmung>();
        }
        return this.nebenbestimmung;
    }

    /**
     * Ruft den Wert der begruendung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextFormatiert }
     *     
     */
    public TextFormatiert getBegruendung() {
        return begruendung;
    }

    /**
     * Legt den Wert der begruendung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextFormatiert }
     *     
     */
    public void setBegruendung(TextFormatiert value) {
        this.begruendung = value;
    }

    /**
     * Ruft den Wert der anlagen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Anlagen }
     *     
     */
    public Anlagen getAnlagen() {
        return anlagen;
    }

    /**
     * Legt den Wert der anlagen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Anlagen }
     *     
     */
    public void setAnlagen(Anlagen value) {
        this.anlagen = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="istZustimmung" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "istZustimmung"
    })
    public static class Tenor {

        protected boolean istZustimmung;

        /**
         * Ruft den Wert der istZustimmung-Eigenschaft ab.
         * 
         */
        public boolean isIstZustimmung() {
            return istZustimmung;
        }

        /**
         * Legt den Wert der istZustimmung-Eigenschaft fest.
         * 
         */
        public void setIstZustimmung(boolean value) {
            this.istZustimmung = value;
        }

    }

}
