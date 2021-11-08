package com.tr.task03.appliance.dao.impl;

import com.tr.task03.appliance.bean.Appliance;
import com.tr.task03.appliance.bean.criteria.Criteria;
import com.tr.task03.appliance.dao.ApplianceSourceDAO;


import java.util.List;


public class XMLApplianceDAO implements ApplianceSourceDAO {

    private Searcher searcher;

    {
        searcher = new Searcher();
    }

    public List<String> find(Criteria criteria) {

        return searcher.find(criteria);
    }

}







