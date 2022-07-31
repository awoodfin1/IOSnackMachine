package com.techelevator.stock;

public class CandyItems extends Items implements Message{


    public CandyItems(String itemName, String selection,  double itemPrice, String itemType) {
        super(itemName, selection,itemPrice, itemType);
   }
    @Override
    public String getMessage() {
        return "Sugar, Sugar, so Sweet!";
    }

}
