/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bo.custom.impl.CustomerBOImpl;
import bo.custom.impl.ItemBOImpl;

/**
 *
 * @author Acer
 */
public class BOFactory {

    private static BOFactory bOFactory;

    public BOFactory() {
    }

    public static BOFactory getInstance() {
        if (bOFactory == null) {
            bOFactory = new BOFactory();
        }
        return bOFactory;
    }

    public enum BOTypes {
        CUSTOMER, ITEM
    }

    public SuperBO getBo(BOTypes types) {
        switch (types) {
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            default:
                return null;
        }
    }

}
