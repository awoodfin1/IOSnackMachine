package com.techelevator.ui;

import com.techelevator.application.RestockingItems;
import com.techelevator.stock.Items;

import java.util.Map;
import java.util.Scanner;

public class SelectItem {

    public SelectItem() {
    }

    Scanner scanner = new Scanner(System.in);



    public void userSelection(RestockingItems restockingItems){
        Display display = new Display();
        display.getDisplay();
        System.out.println();
        System.out.println("Watchu want? ");
        String selection = scanner.nextLine();


        //How do we compare our scanner input to our map value.
        if(restockingItems.getInventory().containsKey(selection)){
            //copy the sout in restocking items here!!
            System.out.println(restockingItems.getNewItem().getItemName() + " | " + restockingItems.getNewItem().getItemPrice() + " | " + restockingItems.getNewItem().getItemsStock());

       } else{
            System.out.println("this doesnt work");
        }
//        for (String i : restockingItems.getInventory().keySet()) {
//
//
//            //How do we compare our scanner input to our map value.
//            // if (restockingItems.getInventory().containsKey(selection)) {
//            if(i.equals(selection)){
//
//                //copy the sout in restocking items here!!
//                System.out.println(restockingItems.getNewItem().getItemName() + " | " + restockingItems.getNewItem().getItemPrice() + " | " + restockingItems.getNewItem().getItemsStock());
//                System.out.println(i);
//            } else {
//                System.out.println("this doesnt work");
//            }
//        }


        //System.out.println(display.getDisplay([3]));
    }


}
