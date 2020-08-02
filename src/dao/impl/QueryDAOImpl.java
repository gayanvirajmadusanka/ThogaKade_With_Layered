/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.CrudUtill;
import dao.QueryDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class QueryDAOImpl implements QueryDAO {

    @Override
    public void getOrder(String oid) throws ClassNotFoundException, SQLException {
        ResultSet resultSet = CrudUtill.executeQuery("select Orders.oid,"
                + "Orders.date,"
                + "Orders.customerID,"
                + "OrderDetails.oid,"
                + "OrderDetails.itemCode,"
                + "OrderDetails.qty,"
                + "OrderDetails.unitPrice"
                + " from Orders inner join OrderDetails"
                + " on Orders.oid=OrderDetails.oid "
                + "where Orders.oid=?';", oid);
    }

}
