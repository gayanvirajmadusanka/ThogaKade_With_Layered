/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.CrudUtill;
import dao.CustomerDAO;
import entity.CustomerEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean add(CustomerEntity ce) throws SQLException, ClassNotFoundException {

        return CrudUtill.executeUpdate("insert into Customer values(?,?,?,?)", ce.getId(), ce.getName(), ce.getAddress(), ce.getSalary());
    }

    @Override
    public CustomerEntity search(String id) throws ClassNotFoundException, SQLException {

        ResultSet resultSet = CrudUtill.executeQuery("SELECT * FROM customer WHERE id=?", id);
        if (resultSet.next()) {
            return new CustomerEntity(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4));
        }

        return null;
    }

    @Override
    public boolean update(CustomerEntity ce) throws ClassNotFoundException, SQLException {

        return CrudUtill.executeUpdate("UPDATE customer SET name=?,address=?,salary=? WHERE id=?", ce.getName(), ce.getAddress(), ce.getSalary(), ce.getId());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {

        return CrudUtill.executeUpdate("DELETE FROM customer WHERE id=?", id);
    }

    @Override
    public ArrayList<CustomerEntity> view() throws ClassNotFoundException, SQLException {
        ResultSet resultSet = CrudUtill.executeQuery("SELECT * FROM customer");

        ArrayList<CustomerEntity> customerList = new ArrayList<>();
        while (resultSet.next()) {
            customerList.add(new CustomerEntity(resultSet.getString("id"), resultSet.getString("name"), resultSet.getString("address"), resultSet.getDouble("salary")));
        }
        return customerList;
    }

    @Override
    public String getCustomerLastID() {
        return "C001";
    }

}
