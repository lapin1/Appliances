package com.tr.task03.appliance.service.impl;

import com.tr.task03.appliance.bean.criteria.Criteria;
import com.tr.task03.appliance.dao.ApplianceDAO;
import com.tr.task03.appliance.dao.DAOFactory;
import com.tr.task03.appliance.service.ApplianceService;
import com.tr.task03.appliance.service.validation.Validator;
import org.jdom2.JDOMException;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    private final DAOFactory factory = DAOFactory.getInstance();


    @Override
    public List<String> find(Criteria criteria) {
        try {
            Validator.criteriaValidator(criteria);
        }catch (RuntimeException e){
            e.getMessage();
        }

        ApplianceDAO appliance = factory.getApplianceDAO();
        List<String> result = appliance.find(criteria);

        return result;
    }
}
