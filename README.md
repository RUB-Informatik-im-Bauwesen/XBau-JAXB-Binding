# XBau-JAXB-Binding #

Java Api für den XÖV-Standard XBau zum Datenaustausch der Bauaufsichtsbehörden mit ihren Kommunikationspartnern (Bauherren, Architektenbüros, Behörden zahlreicher Rechtsbereiche).



## Inhalt ##

 1. Äquivalente Java Klassenabbildung durch JAXB Bindings[^1]
 2. Routinen für Im- und Export in package de.rub.bi.inf.xbau

 
 
[^1]: Update durch: `xjc -d src schemata/xbau-nachrichten-baugenehmigung.xsd -encoding utf8 -b bindings.xsd`