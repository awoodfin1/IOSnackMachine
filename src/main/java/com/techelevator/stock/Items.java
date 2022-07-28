package com.techelevator.stock;

import java.math.BigDecimal;

public class Items {

    private String itemName;
    private String selection;
    private int drinkStock;
    private int gumStock;
    private int munchyStock;
    private int candyStock;



    public Items(String itemName, String selection) {
        this.itemName = itemName;
        this.selection = selection;
    }


}
