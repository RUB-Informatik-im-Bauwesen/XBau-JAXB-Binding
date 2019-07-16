//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.07.16 um 10:40:06 AM CEST 
//


package de.osci.xinneres.basisnachricht._4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dieser Typ enthält die für die Identifikation einer Nachricht erforderlichen Informationen, wobei der Nachrichtentyp hier als Typ-4 Code-Datentyp modelliert ist. 
 * Dieser Typ sollte daher an den Stellen genutzt werden, in denen identifizierende Angaben zu Nachrichten aus mehr als einem xinneres-fachmodul übermittelt werden müssen.
 * 
 * <p>Java-Klasse für Identifikation.Nachricht.Typ4 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Identifikation.Nachricht.Typ4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.osci.de/xinneres/basisnachricht/4}Identifikation.Nachricht">
 *       &lt;sequence>
 *         &lt;element name="nachrichtenUUID" type="{http://www.osci.de/xinneres/basisnachricht/4}UUID"/>
 *         &lt;element name="nachrichtentyp" type="{http://www.osci.de/xinneres/basisnachricht/4}Code.Nachrichtentyp.Typ4"/>
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
@XmlType(name = "Identifikation.Nachricht.Typ4")
public class IdentifikationNachrichtTyp4
    extends IdentifikationNachricht
{


}
