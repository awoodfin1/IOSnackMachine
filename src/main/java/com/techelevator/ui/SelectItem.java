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

        if(!restockingItems.getInventory().containsKey(selection)){
            System.out.println("Not a valid slot");

        } else{
            Items item = restockingItems.getInventory().get(selection);
            double price = item.getItemPrice();
            // do we need line 32?
            System.out.println("this doesnt work");
            if(item.getItemsStock() == 0){
                System.out.println("Out of stock");
            } else if (true){
            }
        }
    }
}
