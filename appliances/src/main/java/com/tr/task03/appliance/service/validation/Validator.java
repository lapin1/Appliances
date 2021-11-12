package com.tr.task03.appliance.service.validation;

import com.tr.task03.appliance.bean.criteria.Criteria;
import com.tr.task03.appliance.main.Main;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.input.sax.XMLReaders;

import java.io.IOException;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria){
        return criteria.validator();
    }


}
