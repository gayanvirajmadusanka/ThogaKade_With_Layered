/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.CustomerBO;
import dao.CustomerDAO;
import dao.DAOFactory;
import dto.CustomerDTO;
import entity.CustomerEntity;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class CustomerBOImpl implements CustomerBO {

    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        return customerDAO.add(new CustomerEntity(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getSalary()));
    }

    @Override
    public boolean deleteCustomer(String id) throws Exception {
        return customerDAO.delete(id);
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        return customerDAO.update(new CustomerEntity(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress(), customerDTO.getSalary()));
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() throws Exception {
        ArrayList<CustomerEntity> arrayListCE = customerDAO.view();
        ArrayList<CustomerDTO> arrayListCD = new ArrayList<>();
        for (CustomerEntity customerEntity : arrayListCE) {
            arrayListCD.add(new CustomerDTO(customerEntity.getId(), customerEntity.getName(), customerEntity.getAddress(), customerEntity.getSalary()));
        }
        return arrayListCD;
    }

    @Override
    public CustomerDTO searchCustomer(String id) throws Exception {
        CustomerEntity customerEntity = customerDAO.search(id);
        return new CustomerDTO(customerEntity.getId(), customerEntity.getName(), customerEntity.getAddress(), customerEntity.getSalary());
    }

}
