package com.techelevator.stock;

public class MunchyItems extends Items implements Message{


    public MunchyItems(String itemName, String selection,  double itemPrice, String itemType) {
        super(itemName, selection,  itemPrice, itemType);
    }

    @Override
    public String getMessage(){
        return "Munchy, Munchy, so Good!";
    }
}
