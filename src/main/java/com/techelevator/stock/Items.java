package com.techelevator.stock;

import com.techelevator.ui.Display;

import java.math.BigDecimal;

public class Items<list> {

    private String itemName;
    private String selection;
    private int itemsStock = 6;
    private double itemPrice;
    private String itemType;


    public Items(String itemName, String selection, double itemPrice, String itemType) {
        this.itemName = itemName;
        this.selection = selection;
        this.itemPrice = itemPrice;
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public int getItemsStock() {
        return itemsStock;
    }

    public void setItemsStock(int itemsStock) {
        this.itemsStock = itemsStock;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}
