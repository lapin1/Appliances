package com.tr.task03.appliance.bean.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria {

    private String groupSearchName;  //name of category
    private Map<String, Object> params;    //parameters
    private static final String FIND_IN_CONCRETE_CATEGORY = "category";

    public Criteria() {
        params = new HashMap<String,Object>();
    }

    public Criteria(String groupSearchName) {
        params = new HashMap<String,Object>();
        params.put(FIND_IN_CONCRETE_CATEGORY, groupSearchName);
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void add(String searchCriteria, Object value) {
        params.put(searchCriteria, value);

    }

    public Set<String> getKeySet(){
        return params.keySet();
    }

    public Object get(Object i){
        return params.get(i);
    }

}
