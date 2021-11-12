package com.tr.task03.appliance.service.validation;

import com.tr.task03.appliance.main.Main;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.input.sax.XMLReaders;

import java.io.IOException;

public class Validator {
    private static final String FILE_NAME = Main.class.getClassLoader().getResource("appliances.xml").toString();

    public static boolean criteriaValidator() throws IOException, JDOMException {
        SAXBuilder builder = new SAXBuilder(XMLReaders.XSDVALIDATING);
        Document document = builder.build(FILE_NAME);
        //System.out.println("Root: " + document.getRootElement().getName());
        return true;
    }


}
