package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;

public class XBauExporter {
	
	public XBauExporter() {
		// TODO Auto-generated constructor stub
	}
	
	public void saveToFile(String path, Object xmlRoot) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance("de.xleitstelle.xbau.schema._2._1");

			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper",
					new CustomNamespacePrefixMapper());

			OutputStream outputStream = new FileOutputStream(path);
			marshaller.marshal(xmlRoot, outputStream);

		} catch (JAXBException | FileNotFoundException e2) {
			e2.printStackTrace();
		}
	}

}
