//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
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
import de.osci.xinneres.basisnachricht._4.CodeNachrichtentypTyp4;
import de.osci.xinneres.behoerde._4.CodeBehoerdenkennung;
import de.osci.xinneres.behoerde._4.CodeDVDVBehoerdenschluessel;
import de.osci.xinneres.behoerde._4.CodePraefix;
import de.osci.xinneres.codes.gemeindeverzeichnis._2.CodeGemeindeVZAmtlicherGemeindeschluessel;
import de.xleitstelle.xbau.schema._2._1.CodeAbweichungArt;
import de.xleitstelle.xbau.schema._2._1.CodeAmtlicherGemeindeschluessel;
import de.xleitstelle.xbau.schema._2._1.CodeBaulicheAnlagenGebaeude;
import de.xleitstelle.xbau.schema._2._1.CodeBaulicheAnlagenSonstige;
import de.xleitstelle.xbau.schema._2._1.CodeBaumassnahmeArt;
import de.xleitstelle.xbau.schema._2._1.CodeBautechnischerNachweisArt;
import de.xleitstelle.xbau.schema._2._1.CodeBauvorlageberechtigungSachverhalt;
import de.xleitstelle.xbau.schema._2._1.CodeBauweise;
import de.xleitstelle.xbau.schema._2._1.CodeBauwerteGebaeudeartenPPVO;
import de.xleitstelle.xbau.schema._2._1.CodeBauwerteZuschlaegePPVO;
import de.xleitstelle.xbau.schema._2._1.CodeBenachrichtigungAnlass;
import de.xleitstelle.xbau.schema._2._1.CodeBeteiligungRolle;
import de.xleitstelle.xbau.schema._2._1.CodeBundesland;
import de.xleitstelle.xbau.schema._2._1.CodeErleichterungGegenstand;
import de.xleitstelle.xbau.schema._2._1.CodeFormelleBefundeAntragArt;
import de.xleitstelle.xbau.schema._2._1.CodeFormelleBefundeArt;
import de.xleitstelle.xbau.schema._2._1.CodeGaragentyp;
import de.xleitstelle.xbau.schema._2._1.CodeGenehmigungsfreistellung;
import de.xleitstelle.xbau.schema._2._1.CodeMboGebaeudeklasse;
import de.xleitstelle.xbau.schema._2._1.CodeMppvoBauwerksklasse;
import de.xleitstelle.xbau.schema._2._1.CodeMppvoNachpruefungGrund;
import de.xleitstelle.xbau.schema._2._1.CodeMppvoPruefungTechnischeAnlageAnlass;
import de.xleitstelle.xbau.schema._2._1.CodeMppvoTechnischeAnlage;
import de.xleitstelle.xbau.schema._2._1.CodeMppvoTechnischeAnlageWeiterbetrieb;
import de.xleitstelle.xbau.schema._2._1.CodeNebenbestimmungArt;
import de.xleitstelle.xbau.schema._2._1.CodeRechtsbereich;
import de.xleitstelle.xbau.schema._2._1.CodeSonderbauten;
import de.xleitstelle.xbau.schema._2._1.CodeStaat;
import de.xleitstelle.xbau.schema._2._1.CodeStatistikmeldungAnlass;
import de.xleitstelle.xbau.schema._2._1.CodeVorbescheidBetreff;
import de.xleitstelle.xbau.schema._2._1.CodeVorlagenBauantragBauvorhaben;
import de.xleitstelle.xbau.schema._2._1.CodeVorlagenBauantragBearbeitung;
import de.xleitstelle.xbau.schema._2._1.CodeVorlagenBauzustand;
import de.xleitstelle.xbau.schema._2._1.CodeXBauFehlerkennzahl;
import de.xleitstelle.xbau.schema._2._1.CodeXBauMimeType;
import de.xleitstelle.xbau.schema._2._1.CodeXBauNachrichten;


/**
 * Der XÖV-Datentyp Code ermöglicht die Übermittlung von Werten, so genannter Codes, aus vordefinierten Codelisten. Eine Codeliste ist eine Liste von Codes und der Beschreibung ihrer jeweiligen Bedeutung.clRef 
 * 
 * Eine entscheidende Eigenschaft des Datentyps ist die Möglichkeit auf differenzierte Weise Bezug zu Codelisten zu nehmen (Code-Typ 1 bis 4).clTypenRef In jedem Fall erlauben die übermittelten Daten eine eindeutige Identifizierung der zugrundeliegenden Codeliste.
 * 
 * <p>Java-Klasse für Code complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
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
    CodeBaumassnahmeArt.class,
    CodeVorlagenBauantragBearbeitung.class,
    CodeVorlagenBauantragBauvorhaben.class,
    CodeBaulicheAnlagenGebaeude.class,
    CodeErleichterungGegenstand.class,
    CodeVorlagenBauzustand.class,
    CodeMppvoTechnischeAnlage.class,
    CodeBenachrichtigungAnlass.class,
    CodeMppvoNachpruefungGrund.class,
    CodeStatistikmeldungAnlass.class,
    CodeVorbescheidBetreff.class,
    CodeBauwerteGebaeudeartenPPVO.class,
    CodeBundesland.class,
    CodeFormelleBefundeArt.class,
    CodeBautechnischerNachweisArt.class,
    CodeFormelleBefundeAntragArt.class,
    CodeAmtlicherGemeindeschluessel.class,
    CodeXBauFehlerkennzahl.class,
    CodeMppvoPruefungTechnischeAnlageAnlass.class,
    CodeMppvoTechnischeAnlageWeiterbetrieb.class,
    CodeNebenbestimmungArt.class,
    CodeMboGebaeudeklasse.class,
    CodeXBauNachrichten.class,
    CodeBauvorlageberechtigungSachverhalt.class,
    CodeBaulicheAnlagenSonstige.class,
    CodeGenehmigungsfreistellung.class,
    CodeAbweichungArt.class,
    de.xleitstelle.xbau.schema._2._1.CodeErreichbarkeit.class,
    CodeBauweise.class,
    CodeStaat.class,
    CodeGaragentyp.class,
    CodeXBauMimeType.class,
    CodeBauwerteZuschlaegePPVO.class,
    CodeMppvoBauwerksklasse.class,
    CodeNachrichtentypTyp4 .class,
    CodeDVDVBehoerdenschluessel.class,
    CodePraefix.class,
    CodeBehoerdenkennung.class,
    de.osci.xinneres.kommunikation._3.CodeErreichbarkeit.class,
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
     * Ruft den Wert der code-Eigenschaft ab.
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
     * Legt den Wert der code-Eigenschaft fest.
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
     * Ruft den Wert der name-Eigenschaft ab.
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
     * Legt den Wert der name-Eigenschaft fest.
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
     * Ruft den Wert der listURI-Eigenschaft ab.
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
     * Legt den Wert der listURI-Eigenschaft fest.
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
     * Ruft den Wert der listVersionID-Eigenschaft ab.
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
     * Legt den Wert der listVersionID-Eigenschaft fest.
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
