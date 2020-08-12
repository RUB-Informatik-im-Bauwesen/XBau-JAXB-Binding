package de.rub.bi.inf.xbau.io;

import java.util.Map;
import java.util.TreeMap;

public class CodeListGenericode extends CodeList {
	
	private Map<Integer, String> bezeichnung = new TreeMap<Integer, String>();
    private Map<Integer, String> beispiel = new TreeMap<Integer, String>();
    
    public Map<Integer, String> getBezeichnung() {
		return bezeichnung;
	}
    
    public Map<Integer, String> getBeispiel() {
		return beispiel;
	}
}
