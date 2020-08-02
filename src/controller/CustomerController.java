package controller;

import dao.CustomerDAO;
import dao.DAOFactory;
import dao.impl.CustomerDAOImpl;
import model.Customer;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerController {

//    CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    public boolean addCustomer(Customer customer) throws SQLException, ClassNotFoundException {

        return customerDAO.add(customer);
    }

    public Customer searchCustomer(String id) throws ClassNotFoundException, SQLException {
        return customerDAO.search(id);
    }

    public boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
        return customerDAO.update(customer);
    }

    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException {
        return customerDAO.delete(id);
    }

    public ArrayList<Customer> viewCustomer() throws ClassNotFoundException, SQLException {
        return customerDAO.view();
    }
}
