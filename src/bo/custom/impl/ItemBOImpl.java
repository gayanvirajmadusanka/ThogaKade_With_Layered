/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.custom.impl;

import bo.custom.ItemBO;
import dao.DAOFactory;
import dao.ItemDAO;
import dto.ItemDTO;
import entity.CustomerEntity;
import entity.ItemEntity;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class ItemBOImpl implements ItemBO {

    ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);

    @Override
    public boolean addItem(ItemDTO itemDTO) throws Exception {
        return itemDAO.add(new ItemEntity(itemDTO.getItemCode(), itemDTO.getItemDescription(), itemDTO.getItemUnitPrice(), itemDTO.getItemQtyOnHand()));
    }

    @Override
    public boolean deleteItem(String id) throws Exception {
        return itemDAO.delete(id);
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) throws Exception {
        return itemDAO.update(new ItemEntity(itemDTO.getItemCode(), itemDTO.getItemDescription(), itemDTO.getItemUnitPrice(), itemDTO.getItemQtyOnHand()));
    }

    @Override
    public ArrayList<ItemDTO> getAllItem() throws Exception {
        ArrayList<ItemEntity> arrayListIE = itemDAO.view();
        ArrayList<ItemDTO> arrayListID = new ArrayList<>();
        for (ItemEntity itemEntity : arrayListIE) {
            arrayListID.add(new ItemDTO(itemEntity.getItemCode(), itemEntity.getItemDescription(), itemEntity.getItemUnitPrice(), itemEntity.getItemQtyOnHand()));
        }
        return arrayListID;
    }

    @Override
    public ItemDTO searchItem(String id) throws Exception {
        ItemEntity itemEntity = itemDAO.search(id);
        return new ItemDTO(itemEntity.getItemCode(), itemEntity.getItemDescription(), itemEntity.getItemUnitPrice(), itemEntity.getItemQtyOnHand());
    }

}
