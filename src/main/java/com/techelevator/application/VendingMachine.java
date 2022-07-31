package com.techelevator.application;

import com.techelevator.stock.Items;
import com.techelevator.stock.Message;
import com.techelevator.ui.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class VendingMachine {

    private BigDecimal machineBalance = new BigDecimal("0.00");

    public void balanceAdd(BigDecimal addition) {
        machineBalance = machineBalance.add(addition);
    }

    public void balanceSub(BigDecimal subtraction) {
        machineBalance = machineBalance.subtract(subtraction);
    }

    public void run() {
        RestockingItems stock = new RestockingItems();
        System.out.println(stock.getFileMap().toString());

        while(true) {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();
            System.out.println(choice);
            if(choice.equals("display")) {
                Display display = new Display();
                display.getDisplay();
            }
            else if(choice.equals("purchase")) {
                FeedMoney feedMoney = new FeedMoney();
                SelectItem selectItem = new SelectItem();
                while (true) {
                    String answer = UserInput.getMenuOptions(machineBalance);
                    System.out.println(answer);
                    if (answer.equals("Feed Money")) {
                        userDollarAmount();
                    } else if(answer.equals("Select Item")){
                        userSelection(stock);
                    }
                }
            }
            else if(choice.equals("exit")) {
                // good bye
                break;
            }
        }
    }
    public void userDollarAmount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a dollar bill (only accepts $1, $5, $10, $20 bills) or press R to return to menu ");

        String userInput = scanner.nextLine();
        if(!userInput.equals("1") && !userInput.equals("5") && !userInput.equals("10") && !userInput.equals("20") && !userInput.equals("R")) {
            System.err.println("Invalid input");
            return;
        } else if (userInput.equals("R")) {
            return;
        } else {
            BigDecimal bill = new BigDecimal(userInput);
            machineBalance = machineBalance.add(bill);
        }
    }
    public void userSelection(RestockingItems restockingItems) {
        Scanner scanner = new Scanner(System.in);
        Display display = new Display();
        display.getDisplay();
        System.out.println();
        System.out.println("Watchu want? ");

        // made change so changes lower case to uppercase.
        String selection = scanner.nextLine().toUpperCase();

        if (!restockingItems.getInventory().containsKey(selection)) {
            System.out.println("Not a valid slot");

        } else {
            Items item = restockingItems.getInventory().get(selection);
            double price = item.getItemPrice();
            String priceString = Double.toString(price);
            BigDecimal bigPrice = new BigDecimal(priceString);
            if (item.getItemsStock() == 0) {
                System.out.println("Out of stock");
            } else if (bigPrice.compareTo(machineBalance) == 1) {
                System.out.println("Not enough money");
            } else {
                machineBalance = machineBalance.subtract(bigPrice);
                item.setItemsStock(item.getItemsStock() - 1);
                System.out.println(item.getItemName() + " " + item.getItemPrice() + " " );
                System.out.println();
                // get sound/slogan of whatever user buys.
                System.out.println(item.getMessage());
            }
        }
    }
}

