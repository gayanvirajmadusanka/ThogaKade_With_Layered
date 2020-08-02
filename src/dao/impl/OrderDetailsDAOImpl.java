/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.CrudUtill;
import dao.OrderDetailsDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.OrderDetails;

/**
 *
 * @author Acer
 */
public class OrderDetailsDAOImpl implements OrderDetailsDAO {

    @Override
    public boolean add(OrderDetails t) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrderDetails search(String id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(OrderDetails t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<OrderDetails> view() throws ClassNotFoundException, SQLException {
        ResultSet resultSet = CrudUtill.executeQuery("SELECT * FROM orderdetail");
        ArrayList<OrderDetails> arrayList = new ArrayList<>();
        while (resultSet.next()) {
            arrayList.add(new OrderDetails(resultSet.getString("orderId"), resultSet.getString("itemCode"), resultSet.getInt("qty"), resultSet.getDouble("unitPrice")));
        }
        return arrayList;
    }

}
