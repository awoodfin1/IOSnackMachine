package com.techelevator.stock;

public class GumItems extends Items implements Message{

    public GumItems(String itemName, String selection,  double itemPrice, String itemType) {
        super(itemName, selection, itemPrice, itemType);
    }

    @Override
    public String getMessage(){
        return "Chewy, Chewy, Lots O Bubbles!";
    }
}
