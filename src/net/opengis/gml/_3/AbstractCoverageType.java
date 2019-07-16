//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package net.opengis.gml._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbstractCoverageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractCoverageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}domainSet"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}rangeSet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoverageType", propOrder = {
    "domainSet",
    "rangeSet"
})
@XmlSeeAlso({
    DiscreteCoverageType.class
})
public abstract class AbstractCoverageType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected DomainSetType domainSet;
    @XmlElement(required = true)
    protected RangeSetType rangeSet;

    /**
     * Ruft den Wert der domainSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DomainSetType }
     *     
     */
    public DomainSetType getDomainSet() {
        return domainSet;
    }

    /**
     * Legt den Wert der domainSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainSetType }
     *     
     */
    public void setDomainSet(DomainSetType value) {
        this.domainSet = value;
    }

    /**
     * Ruft den Wert der rangeSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RangeSetType }
     *     
     */
    public RangeSetType getRangeSet() {
        return rangeSet;
    }

    /**
     * Legt den Wert der rangeSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeSetType }
     *     
     */
    public void setRangeSet(RangeSetType value) {
        this.rangeSet = value;
    }

}
