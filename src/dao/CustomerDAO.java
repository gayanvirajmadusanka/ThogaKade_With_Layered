/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Customer;

/**
 *
 * @author Acer
 */
public interface CustomerDAO extends CrudDAO<Customer, String>{
    String getCustomerLastID();

}
