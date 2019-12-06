package io;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;




public class CustomNamespacePrefixMapper extends NamespacePrefixMapper {

	private Map<String, String> namespaceMap = new HashMap<String, String>();
	
	public CustomNamespacePrefixMapper() {
		namespaceMap.put("http://www.w3.org/2001/XMLSchema", "xs");
		namespaceMap.put("http://www.xleitstelle.de/xbau/schema/2/1/", "xbau");
		namespaceMap.put("http://www.opengis.net/gml/3.2", "gml");
		namespaceMap.put("http://xoev.de/latinchars/1_1/datatypes", "xoev-lc");
		namespaceMap.put("http://xoev.de/schemata/code/1_0", "xoev-code" );
		namespaceMap.put("http://www.osci.de/xinneres/basisnachricht/3", "xink");
		namespaceMap.put("http://www.osci.de/xinneres/behoerde/3", "xibehoerde");
		namespaceMap.put("http://www.w3.org/1999/xlink", "xlink");
		namespaceMap.put("http://www.osci.de/xinneres/postanschrift/2", "xipa");
		
	}
	
	
	
	@Override
	public String getPreferredPrefix(String arg0, String arg1, boolean arg2) {
		return namespaceMap.getOrDefault(arg0, arg1);
	}


}
