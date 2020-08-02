/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.CustomerDTO;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public interface CustomerBO extends SuperBO{
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception;
    public boolean deleteCustomer(String id) throws Exception;
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception;
    public ArrayList<CustomerDTO> getAllCustomer() throws Exception;
    public CustomerDTO searchCustomer(String id)throws Exception;
}
