package com.techelevator.application;

import com.techelevator.stock.Items;

public class RestockingItems extends Items {

    private final int STOCK_AMOUNT = 6;


    public RestockingItems(String itemName, String selection) {
        super(itemName, selection);
    }
}
