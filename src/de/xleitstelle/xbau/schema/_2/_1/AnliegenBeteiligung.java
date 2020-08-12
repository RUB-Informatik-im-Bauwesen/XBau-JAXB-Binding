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
 * Dieser Typ beinhaltet die Parameter eines Beteiligungsanliegens der Bauaufsichtsbehörde gegenüber einem Träger öffentlicher Belange.
 * 
 * <p>Java-Klasse für AnliegenBeteiligung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AnliegenBeteiligung">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rolle" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.BeteiligungRolle"/>
 *         &lt;element name="rechtsbereich" type="{http://www.xleitstelle.de/xbau/schema/2/1/}Code.Rechtsbereich"/>
 *         &lt;element name="grundDerBeteiligung" type="{http://www.xleitstelle.de/xbau/schema/2/1/}TextFormatiert"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnliegenBeteiligung", propOrder = {
    "rolle",
    "rechtsbereich",
    "grundDerBeteiligung"
})
public class AnliegenBeteiligung {

    @XmlElement(required = true)
    protected CodeBeteiligungRolle rolle;
    @XmlElement(required = true)
    protected CodeRechtsbereich rechtsbereich;
    @XmlElement(required = true)
    protected TextFormatiert grundDerBeteiligung;

    /**
     * Ruft den Wert der rolle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeBeteiligungRolle }
     *     
     */
    public CodeBeteiligungRolle getRolle() {
        return rolle;
    }

    /**
     * Legt den Wert der rolle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeBeteiligungRolle }
     *     
     */
    public void setRolle(CodeBeteiligungRolle value) {
        this.rolle = value;
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
     * Ruft den Wert der grundDerBeteiligung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextFormatiert }
     *     
     */
    public TextFormatiert getGrundDerBeteiligung() {
        return grundDerBeteiligung;
    }

    /**
     * Legt den Wert der grundDerBeteiligung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextFormatiert }
     *     
     */
    public void setGrundDerBeteiligung(TextFormatiert value) {
        this.grundDerBeteiligung = value;
    }

}
