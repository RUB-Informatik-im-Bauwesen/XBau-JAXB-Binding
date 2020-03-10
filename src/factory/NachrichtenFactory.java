package factory;

import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import de.osci.xinneres.behoerde._4.BehoerdeErreichbar;
import de.xleitstelle.xbau.schema._2._1.CodeXBauNachrichten;
import de.xleitstelle.xbau.schema._2._1.IdentifikationNachricht;
import de.xleitstelle.xbau.schema._2._1.NachrichtenkopfG2Privat;

public class NachrichtenFactory {
	
	private NachrichtenFactory() {
		// TODO Auto-generated constructor stub
	}
	
	private static NachrichtenFactory instance;
	public static NachrichtenFactory getInstance() {
		if (instance==null)
			instance = new NachrichtenFactory();
		return instance;
	}
	
	
	public NachrichtenkopfG2Privat newNachrichtenkopfG2Privat(String code, String codeName){
		
		
		NachrichtenkopfG2Privat nachrichtenkopf = new NachrichtenkopfG2Privat();
		nachrichtenkopf.setIdentifikationNachricht(new IdentifikationNachricht());
		nachrichtenkopf.getIdentifikationNachricht().setNachrichtenUUID(UUID.randomUUID().toString());
		CodeXBauNachrichten codeXBauNachrichten = new CodeXBauNachrichten();
		codeXBauNachrichten.setCode(code);
		codeXBauNachrichten.setName(codeName);
		nachrichtenkopf.getIdentifikationNachricht().setNachrichtentyp(codeXBauNachrichten);
	
		XMLGregorianCalendar now = null;
		try {
			GregorianCalendar gregorianCalendar = new GregorianCalendar();
	        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
			now = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (now != null) {
        	nachrichtenkopf.getIdentifikationNachricht().setErstellungszeitpunkt(now);
        }
        
        //TODO set Autor und Behörde
        
        return nachrichtenkopf;
	}

}
