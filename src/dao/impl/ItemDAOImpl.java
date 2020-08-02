/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.CrudUtill;
import dao.ItemDAO;
import entity.ItemEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class ItemDAOImpl implements ItemDAO {

    @Override
    public boolean add(ItemEntity itemEntity) throws SQLException, ClassNotFoundException {
        return CrudUtill.executeUpdate("insert into Item values(?,?,?,?)", itemEntity.getItemCode(), itemEntity.getItemDescription(), itemEntity.getItemUnitPrice(), itemEntity.getItemQtyOnHand());
    }

    @Override
    public ItemEntity search(String id) throws ClassNotFoundException, SQLException {
        ResultSet resultSet = CrudUtill.executeQuery("SELECT * FROM Item WHERE code=?", id);
        if (resultSet.next()) {
            return new ItemEntity(resultSet.getString(1), resultSet.getString(2), resultSet.getDouble(3), resultSet.getInt(4));
        }
        return null;
    }

    @Override
    public boolean update(ItemEntity itemEntity) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("UPDATE item SET description=?,unitPrice=?,qtyOnHand=? WHERE code=?", itemEntity.getItemDescription(), itemEntity.getItemUnitPrice(), itemEntity.getItemQtyOnHand(), itemEntity.getItemCode());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("DELETE FROM item WHERE code=?", id);
    }

    @Override
    public ArrayList<ItemEntity> view() throws ClassNotFoundException, SQLException {
        ResultSet resultSet = CrudUtill.executeQuery("SELECT * FROM Item");
        ArrayList<ItemEntity> arrayList = new ArrayList<>();
        while (resultSet.next()) {
            arrayList.add(new ItemEntity(resultSet.getString("code"), resultSet.getString("description"), resultSet.getDouble("unitPrice"), resultSet.getInt("qtyOnHand")));
        }
        return arrayList;
    }

}
