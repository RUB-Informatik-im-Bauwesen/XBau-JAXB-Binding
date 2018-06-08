//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.08 at 11:08:34 AM CEST 
//


package de.xoev.schemata.code._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import de.is_argebau.xbau._2.CodeAbweichungArt;
import de.is_argebau.xbau._2.CodeAmtlicherGemeindeschluessel;
import de.is_argebau.xbau._2.CodeAnlassPruefungTechnischeAnlage;
import de.is_argebau.xbau._2.CodeBaulicheAnlagenGebaeude;
import de.is_argebau.xbau._2.CodeBaulicheAnlagenSonstige;
import de.is_argebau.xbau._2.CodeBaumassnahmeArt;
import de.is_argebau.xbau._2.CodeBautechnischerNachweisArt;
import de.is_argebau.xbau._2.CodeBauvorlageberechtigungSachverhalt;
import de.is_argebau.xbau._2.CodeBauweise;
import de.is_argebau.xbau._2.CodeBauwerksklasse;
import de.is_argebau.xbau._2.CodeBauwerteGebaeudeartenPPVO;
import de.is_argebau.xbau._2.CodeBauwerteZuschlaegePPVO;
import de.is_argebau.xbau._2.CodeBenachrichtigungAnlass;
import de.is_argebau.xbau._2.CodeBeteiligungRolle;
import de.is_argebau.xbau._2.CodeBundesland;
import de.is_argebau.xbau._2.CodeErleichterungGegenstand;
import de.is_argebau.xbau._2.CodeFormelleBefundeArt;
import de.is_argebau.xbau._2.CodeGaragentyp;
import de.is_argebau.xbau._2.CodeGebaeudeklasse;
import de.is_argebau.xbau._2.CodeGenehmigungsfreistellung;
import de.is_argebau.xbau._2.CodeNebenbestimmungArt;
import de.is_argebau.xbau._2.CodeRechtsbereich;
import de.is_argebau.xbau._2.CodeSonderbauten;
import de.is_argebau.xbau._2.CodeStaat;
import de.is_argebau.xbau._2.CodeTechnischeAnlage;
import de.is_argebau.xbau._2.CodeVorbescheidBetreff;
import de.is_argebau.xbau._2.CodeVorlagenBauantragBauvorhaben;
import de.is_argebau.xbau._2.CodeVorlagenBauantragBearbeitung;
import de.is_argebau.xbau._2.CodeVorlagenBauzustand;
import de.is_argebau.xbau._2.CodeXBauMimeType;
import de.is_argebau.xbau._2.CodeXBauNachrichten;
import de.osci.xinneres.basisnachricht._3.CodeNachrichtentypTyp4;
import de.osci.xinneres.behoerde._3.CodeBehoerdenkennung;
import de.osci.xinneres.behoerde._3.CodeDVDVBehoerdenschluessel;
import de.osci.xinneres.behoerde._3.CodePraefix;
import de.osci.xinneres.codes.gemeindeverzeichnis._1.CodeGemeindeVZAmtlicherGemeindeschluessel;


/**
 * Der XÖV-Datentyp Code ermöglicht die Übermittlung von Werten, so genannter Codes, aus vordefinierten Codelisten. Eine Codeliste ist eine Liste von Codes und der Beschreibung ihrer jeweiligen Bedeutung.clRef 
 * 
 * Eine entscheidende Eigenschaft des Datentyps ist die Möglichkeit auf differenzierte Weise Bezug zu Codelisten zu nehmen (Code-Typ 1 bis 4).clTypenRef In jedem Fall erlauben die übermittelten Daten eine eindeutige Identifizierung der zugrundeliegenden Codeliste.
 * 
 * <p>Java class for Code complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Code">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}token" form="unqualified"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *       &lt;attribute name="listURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="listVersionID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code", propOrder = {
    "code",
    "name"
})
@XmlSeeAlso({
    CodeSonderbauten.class,
    CodeRechtsbereich.class,
    CodeBeteiligungRolle.class,
    CodeGebaeudeklasse.class,
    CodeBaumassnahmeArt.class,
    CodeVorlagenBauantragBearbeitung.class,
    CodeVorlagenBauantragBauvorhaben.class,
    CodeBaulicheAnlagenGebaeude.class,
    CodeErleichterungGegenstand.class,
    CodeVorlagenBauzustand.class,
    CodeBenachrichtigungAnlass.class,
    CodeVorbescheidBetreff.class,
    CodeBauwerteGebaeudeartenPPVO.class,
    CodeBundesland.class,
    CodeFormelleBefundeArt.class,
    CodeBautechnischerNachweisArt.class,
    CodeAnlassPruefungTechnischeAnlage.class,
    CodeTechnischeAnlage.class,
    CodeAmtlicherGemeindeschluessel.class,
    CodeNebenbestimmungArt.class,
    CodeXBauNachrichten.class,
    CodeBauvorlageberechtigungSachverhalt.class,
    CodeBaulicheAnlagenSonstige.class,
    CodeGenehmigungsfreistellung.class,
    CodeAbweichungArt.class,
    CodeBauwerksklasse.class,
    de.is_argebau.xbau._2.CodeErreichbarkeit.class,
    CodeBauweise.class,
    CodeStaat.class,
    CodeGaragentyp.class,
    CodeXBauMimeType.class,
    CodeBauwerteZuschlaegePPVO.class,
    CodeNachrichtentypTyp4 .class,
    CodeDVDVBehoerdenschluessel.class,
    CodePraefix.class,
    CodeBehoerdenkennung.class,
    de.osci.xinneres.kommunikation._2.CodeErreichbarkeit.class,
    CodeGemeindeVZAmtlicherGemeindeschluessel.class
})
public class Code {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String code;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlAttribute(name = "listURI")
    @XmlSchemaType(name = "anyURI")
    protected String listURI;
    @XmlAttribute(name = "listVersionID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String listVersionID;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the listURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListURI() {
        return listURI;
    }

    /**
     * Sets the value of the listURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListURI(String value) {
        this.listURI = value;
    }

    /**
     * Gets the value of the listVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListVersionID() {
        return listVersionID;
    }

    /**
     * Sets the value of the listVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListVersionID(String value) {
        this.listVersionID = value;
    }

}