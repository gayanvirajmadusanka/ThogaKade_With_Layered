/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Acer
 */
public class ItemEntity {
    private String itemCode;
    private String itemDescription;
    private double itemUnitPrice;
    private int itemQtyOnHand;

    public ItemEntity() {
    }

    public ItemEntity(String itemCode, String itemDescription, double itemUnitPrice, int itemQtyOnHand) {
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.itemUnitPrice = itemUnitPrice;
        this.itemQtyOnHand = itemQtyOnHand;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemUnitPrice() {
        return itemUnitPrice;
    }

    public void setItemUnitPrice(double itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }

    public int getItemQtyOnHand() {
        return itemQtyOnHand;
    }

    public void setItemQtyOnHand(int itemQtyOnHand) {
        this.itemQtyOnHand = itemQtyOnHand;
    }
    
    
}
