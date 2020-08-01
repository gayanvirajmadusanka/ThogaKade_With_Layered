package controller;

import dao.CustomerDAOImpl;
import model.Customer;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerController {

    CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();

    public boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException {

        return customerDAOImpl.add(customer);
    }

    public Customer searchCustomer(String id) throws ClassNotFoundException, SQLException {
        return customerDAOImpl.search(id);
    }

    public boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        return customerDAOImpl.update(customer);
    }

    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException {
        return customerDAOImpl.delete(id);
    }

    public ArrayList<Customer> viewCustomer() throws ClassNotFoundException, SQLException {
        return customerDAOImpl.view();
    }
}
