package com.techelevator.application;

import com.techelevator.stock.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestockingItems {

    private Map<String, Items> inventory = new HashMap();

    public Map<String, Items> getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "RestockingItems{" +
                "inventory=" + inventory +
                '}';
    }

    public RestockingItems() {
        this.inventory = inventory;
    }

    public Map<String, Items> getFileMap() {
        File file = new File("vending.csv");
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {

                //Use for display please
                String itemInVendingMachine = scanner.nextLine();
                String[] arr = itemInVendingMachine.split(",");

                Items newItem;
                if(arr[3].equalsIgnoreCase("Gum")){
                    newItem = new GumItems(arr[1],arr[0], Double.parseDouble(arr[2]), arr[3]);
                }else if(arr[3].equalsIgnoreCase("Drink")){
                    newItem = new DrinkItems(arr[1],arr[0], Double.parseDouble(arr[2]), arr[3]);
                }else if(arr[3].equalsIgnoreCase("Candy")) {
                    newItem = new CandyItems(arr[1], arr[0], Double.parseDouble(arr[2]), arr[3]);
                }else {
                    newItem = new MunchyItems(arr[1], arr[0], Double.parseDouble(arr[2]), arr[3]);
                }

                inventory.put(arr[0],newItem);
                //Items name = inventory.get("A2"); It don't do nothin
                System.out.println(newItem.getItemPrice() + " " + newItem.getItemsStock());


            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        return inventory;
    }
}
