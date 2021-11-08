package com.tr.task03.appliance.dao.impl;

import com.tr.task03.appliance.bean.Appliance;
import com.tr.task03.appliance.bean.criteria.Criteria;

import java.util.*;
import java.util.stream.Collectors;

public class Searcher {

    private ApplianceRepository repository;
    private List<String> searchData;


    public Searcher(){
        this.repository = ApplianceRepository.getInstance();
        searchData = initSearchData();
    }

    public List<String> find(Criteria criteria){

        Set<String> keys = criteria.getKeySet();
        List<String> params = new ArrayList<>();
        List<String> found = new ArrayList<>();


        for (String key : keys) {
            params.add(key + "=" + criteria.get(key));  //"parameter=value"

        }

        for (int i = 0; i < searchData.size(); i++){
            String current = searchData.get(i);
            for(int j = 0; j < params.size(); j++){
                if(current.contains(params.get(j))){
                    found.add(current);

                }
                break;
            }
        }


        for (String param : params) {
            System.out.println(param);
        }            //just show parameters



        return found;
    }

    public List<String> initSearchData(){
        List<Appliance> appliances = repository.getInstance().getData();// list from repository
        List<String> searchData = appliances.stream()
                .map(Appliance::toString)
                .collect(Collectors.toList());
        return searchData;

    }


}
