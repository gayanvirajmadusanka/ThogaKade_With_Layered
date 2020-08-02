/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.impl.CustomerDAOImpl;
import dao.impl.ItemDAOImpl;
import dao.impl.QueryDAOImpl;

/**
 *
 * @author Acer
 */
public class DAOFactory {

    public static DAOFactory dAOFactory;

    public DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (dAOFactory == null) {
            return new DAOFactory();
        }
        return dAOFactory;
    }

    public enum DAOTypes {
        CUSTOMER, ITEM, QUERYDAO
    }

    public SuperDAO getDAO(DAOTypes dAOTypes) {
        switch (dAOTypes) {
            case CUSTOMER:
                return new CustomerDAOImpl();
            case ITEM:
                return new ItemDAOImpl();
            case QUERYDAO:
                return new QueryDAOImpl();
            default:
                return null;
        }
    }

}
