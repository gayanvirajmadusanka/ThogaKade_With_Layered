/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom;

import bo.SuperBO;
import dto.ItemDTO;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public interface ItemBO extends SuperBO {

    public boolean addItem(ItemDTO itemDTO) throws Exception;

    public boolean deleteItem(String id) throws Exception;

    public boolean updateItem(ItemDTO itemDTO) throws Exception;

    public ArrayList<ItemDTO> getAllItem() throws Exception;

    public ItemDTO searchItem(String id) throws Exception;
}
