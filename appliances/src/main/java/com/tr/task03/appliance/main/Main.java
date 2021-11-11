package com.tr.task03.appliance.main;

import com.tr.task03.appliance.bean.Laptop;
import com.tr.task03.appliance.bean.Oven;
import com.tr.task03.appliance.bean.criteria.Criteria;
import com.tr.task03.appliance.service.ApplianceService;
import com.tr.task03.appliance.service.ServiceFactory;


public class Main {
    public static void main(String[] args) {

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();


       Criteria criteria = new Criteria(Oven.class.getSimpleName());
       criteria.add("capacity", 2300);
       criteria.add("weight", 10);


       //service.find(criteria);

       System.out.println(service.find(criteria));    // printFoundInfo - просто посмотреть

       ////////////////////////////////////////////////////////////////

       Criteria criteria2 = new Criteria();
       criteria2.add("price","1000");

       service.find(criteria2);

        ////////////////////////////////////////////////////////////////

       Criteria criteria3 = new Criteria(Laptop.class.getSimpleName());   //show laptops

       service.find(criteria3);

        ////////////////////////////////////////////////////////////////




    }
}
