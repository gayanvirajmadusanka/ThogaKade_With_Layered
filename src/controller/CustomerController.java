package controller;

import bo.BOFactory;
import bo.custom.CustomerBO;
import dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerController {

    CustomerBO customerBO = (CustomerBO) BOFactory.getInstance().getBo(BOFactory.BOTypes.CUSTOMER);

    public boolean addCustomer(CustomerDTO cdto) throws SQLException, ClassNotFoundException, Exception {
        return customerBO.addCustomer(cdto);
    }

    public CustomerDTO searchCustomer(String id) throws ClassNotFoundException, SQLException, Exception {
        return customerBO.searchCustomer(id);
    }

    public boolean updateCustomer(CustomerDTO cdto) throws ClassNotFoundException, SQLException, Exception {
        return customerBO.updateCustomer(cdto);
    }

    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException, Exception {
        return customerBO.deleteCustomer(id);
    }

    public ArrayList<CustomerDTO> viewCustomer() throws ClassNotFoundException, SQLException, Exception {
        return customerBO.getAllCustomer();
    }
}
