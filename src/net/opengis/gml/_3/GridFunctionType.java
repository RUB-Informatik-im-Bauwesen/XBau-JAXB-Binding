//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package net.opengis.gml._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GridFunctionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GridFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceRule" type="{http://www.opengis.net/gml/3.2}SequenceRuleType" minOccurs="0"/>
 *         &lt;element name="startPoint" type="{http://www.opengis.net/gml/3.2}integerList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridFunctionType", propOrder = {
    "sequenceRule",
    "startPoint"
})
public class GridFunctionType {

    protected SequenceRuleType sequenceRule;
    @XmlList
    protected List<BigInteger> startPoint;

    /**
     * Ruft den Wert der sequenceRule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRuleType }
     *     
     */
    public SequenceRuleType getSequenceRule() {
        return sequenceRule;
    }

    /**
     * Legt den Wert der sequenceRule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRuleType }
     *     
     */
    public void setSequenceRule(SequenceRuleType value) {
        this.sequenceRule = value;
    }

    /**
     * Gets the value of the startPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getStartPoint() {
        if (startPoint == null) {
            startPoint = new ArrayList<BigInteger>();
        }
        return this.startPoint;
    }

}
