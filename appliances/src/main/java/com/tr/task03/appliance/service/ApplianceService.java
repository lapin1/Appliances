package com.tr.task03.appliance.service;

import com.tr.task03.appliance.bean.criteria.Criteria;

import java.util.List;

public interface ApplianceService {

    List<String> find(Criteria criteria);
}
