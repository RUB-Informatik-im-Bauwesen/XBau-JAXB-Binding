package de.rub.bi.inf.xbau.io;

import java.util.Map;
import java.util.TreeMap;

public class CodeListXSD extends CodeList{
	
	private Map<Integer, String> werte = new TreeMap<Integer, String>();
    private Map<Integer, String> documentation = new TreeMap<Integer, String>();
    
    public Map<Integer, String> getWerte() {
		return werte;
	}
    
    public Map<Integer, String> getDocumentation() {
		return documentation;
	}
}
