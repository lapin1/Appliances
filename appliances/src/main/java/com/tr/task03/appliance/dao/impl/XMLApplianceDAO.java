package com.tr.task03.appliance.dao.impl;

import com.tr.task03.appliance.bean.criteria.Criteria;
import com.tr.task03.appliance.dao.ApplianceDAO;


import java.util.List;


public class XMLApplianceDAO implements ApplianceDAO {

    private Searcher searcher;

    {
        searcher = new Searcher();
    }

    public List<String> find(Criteria criteria) {

        return searcher.find(criteria);
    }

}







