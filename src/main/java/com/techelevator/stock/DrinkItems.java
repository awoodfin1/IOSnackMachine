package com.techelevator.stock;

public class DrinkItems extends Items implements Message{


    public DrinkItems(String itemName, String selection, double itemPrice, String itemType) {
        super(itemName, selection, itemPrice, itemType);
    }

    @Override
    public String getMessage() {
        return "Drinky, Drinky, Slurp Slurp!";
    }
}
