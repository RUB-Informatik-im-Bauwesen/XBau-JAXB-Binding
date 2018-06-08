# XPlanung-JAXB-Binding #

Build Java Classes of XSD files via JAXB.
This Project defines the bindings needed to build the classes for XBau-XSD-files.
Then execute (un)marshalling as wished.


## TL;DR: ##

Auto-Generate Java Source Files:

	1.1 Generate files:
	
	    1.1.1 move to eclipse project folder (in CLI)
	
	    1.1.2 xjc -d src schemata/xbau-nachrichten-baugenehmigung.xsd -encoding utf8 -b bindings.xsd
