package com.tr.task03.appliance.dao;

import com.tr.task03.appliance.bean.criteria.Criteria;

import java.util.List;

public interface ApplianceSourceDAO {
    List<String> find(Criteria criteria);

}
