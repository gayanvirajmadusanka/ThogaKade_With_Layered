/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.CrudUtill;
import dao.CustomerDAO;
import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;

/**
 *
 * @author Acer
 */
public class CustomerDAOImpl implements CustomerDAO{

    @Override
    public boolean add(Customer customer) throws SQLException, ClassNotFoundException {

        return CrudUtill.executeUpdate("insert into Customer values(?,?,?,?)", customer.getId(), customer.getName(), customer.getAddress(), customer.getSalary());
    }

    @Override
    public Customer search(String id) throws ClassNotFoundException, SQLException {

        ResultSet resultSet = CrudUtill.executeQuery("SELECT * FROM customer WHERE id=?", id);
        if (resultSet.next()) {
            return new Customer(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getDouble(4));
        }

        return null;
    }

    @Override
    public boolean update(Customer customer) throws ClassNotFoundException, SQLException {

        return CrudUtill.executeUpdate("UPDATE customer SET name=?,address=?,salary=? WHERE id=?", customer.getName(), customer.getAddress(), customer.getSalary(), customer.getId());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {

        return CrudUtill.executeUpdate("DELETE FROM customer WHERE id=?", id);
    }

    @Override
    public ArrayList<Customer> view() throws ClassNotFoundException, SQLException {
        ResultSet resultSet = CrudUtill.executeQuery("SELECT * FROM customer");

        ArrayList<Customer> customerList = new ArrayList<>();
        while (resultSet.next()) {
            customerList.add(new Customer(resultSet.getString("id"), resultSet.getString("name"), resultSet.getString("address"), resultSet.getDouble("salary")));
        }
        return customerList;
    }

    @Override
    public String getCustomerLastID() {
         return "C001";
    }

}
