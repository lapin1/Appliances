package com.tr.task03.appliance;

import com.tr.task03.appliance.bean.Laptop;
import com.tr.task03.appliance.bean.Oven;
import com.tr.task03.appliance.dao.impl.XMLApplianceDAO;
import com.tr.task03.appliance.bean.criteria.Criteria;


public class Main {
    public static void main(String[] args) {

        XMLApplianceDAO finder = new XMLApplianceDAO();


       Criteria criteria = new Criteria(Oven.class.getSimpleName());
       criteria.add("capacity", 2300);
       criteria.add("weight", 10);


       //finder.find(criteria);

       System.out.println(finder.find(criteria));    // printFoundInfo - просто посмотреть

       ////////////////////////////////////////////////////////////////

       Criteria criteria2 = new Criteria();
       criteria2.add("price","1000");

       finder.find(criteria2);

        ////////////////////////////////////////////////////////////////

       Criteria criteria3 = new Criteria(Laptop.class.getSimpleName());   //show laptops

       finder.find(criteria3);

        ////////////////////////////////////////////////////////////////




    }
}
