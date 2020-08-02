package controller;

import bo.BOFactory;
import bo.custom.ItemBO;
import dto.ItemDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemController {

    ItemBO itemBO = (ItemBO) BOFactory.getInstance().getBo(BOFactory.BOTypes.ITEM);

    public boolean addItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException, Exception {
        return itemBO.addItem(itemDTO);
    }

    public ItemDTO searchItem(String id) throws ClassNotFoundException, SQLException, Exception {
        return itemBO.searchItem(id);
    }

    public boolean updateItem(ItemDTO itemDTO) throws ClassNotFoundException, SQLException, Exception {
        return itemBO.updateItem(itemDTO);
    }

    public boolean deleteItem(String id) throws ClassNotFoundException, SQLException, Exception {
        return itemBO.deleteItem(id);
    }

    public ArrayList<ItemDTO> viewItem() throws ClassNotFoundException, SQLException, Exception {
        return itemBO.getAllItem();
    }
}
