package controller;

import dao.CustomerDAOImpl;
import dao.ItemDAOImpl;
import model.Customer;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Item;

public class ItemController {

    ItemDAOImpl itemDAOImpl = new ItemDAOImpl();
    
    public boolean addItem(Item item) throws SQLException, ClassNotFoundException {

        return itemDAOImpl.add(item);
    }
}
