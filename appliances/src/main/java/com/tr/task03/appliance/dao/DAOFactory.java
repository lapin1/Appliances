package com.tr.task03.appliance.dao;

import com.tr.task03.appliance.dao.impl.XMLApplianceDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final ApplianceDAO applianceDAO = new XMLApplianceDAO();

    private DAOFactory() {}

    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}
