package controller;

import dao.DAOFactory;
import dao.ItemDAO;
import dao.impl.CustomerDAOImpl;
import dao.impl.ItemDAOImpl;
import model.Customer;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Item;

public class ItemController {

//    ItemDAO itemDAO = new ItemDAOImpl();
    ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);

    public boolean addItem(Item item) throws SQLException, ClassNotFoundException {

        return itemDAO.add(item);
    }

    public Item searchItem(String id) throws ClassNotFoundException, SQLException {
        return itemDAO.search(id);
    }

    public boolean updateItem(Item item) throws ClassNotFoundException, SQLException {
        return itemDAO.update(item);
    }

    public boolean deleteItem(String id) throws ClassNotFoundException, SQLException {
        return itemDAO.delete(id);
    }

    public ArrayList<Item> viewItem() throws ClassNotFoundException, SQLException {
        return itemDAO.view();
    }
}
