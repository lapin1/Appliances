package com.tr.task03.appliance.service;

import com.tr.task03.appliance.service.impl.ApplianceServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {}

    public ApplianceService getApplianceService() {

        return applianceService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

}
