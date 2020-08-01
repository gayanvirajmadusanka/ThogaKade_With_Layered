/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;
import model.Item;

/**
 *
 * @author Acer
 */
public class ItemDAOImpl implements ItemDAO{

    @Override
    public boolean add(Item item) throws SQLException, ClassNotFoundException {
        return CrudUtill.executeUpdate("insert into Item values(?,?,?,?)", item.getItemCode(),item.getItemDescription(),item.getItemUnitPrice(),item.getItemQtyOnHand());
    }

    @Override
    public Item search(String id) throws ClassNotFoundException, SQLException {
        ResultSet resultSet = CrudUtill.executeQuery("SELECT * FROM customer WHERE id=?", id);
        if (resultSet.next()) {
            return new Item(resultSet.getString(1), resultSet.getString(2), resultSet.getDouble(3), resultSet.getInt(4));
        }
        return null;
    }

    @Override
    public boolean update(Item t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Item> view() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
