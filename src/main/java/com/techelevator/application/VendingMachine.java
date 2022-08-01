package com.techelevator.application;

import com.techelevator.stock.Items;
import com.techelevator.ui.*;

import java.math.BigDecimal;
import java.util.Scanner;


public class VendingMachine {

    private BigDecimal machineBalance = new BigDecimal("0.00");

    public BigDecimal getMachineBalance() {
        return this.machineBalance;
    }

    public void balanceAdd(BigDecimal addition) {
        this.machineBalance = machineBalance.add(addition);
    }

    public void balanceSub(BigDecimal subtraction) {
        this.machineBalance = machineBalance.subtract(subtraction);
    }



    private String test;

    public void run() {
        Audit auditRun = new Audit();
        Audit.audit(test);
        RestockingItems stock = new RestockingItems();
        stock.getFileMap().toString();

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
                    }else if (answer.equals("Finish Transaction")){
                        finishTransaction();
                        run();
                        return;
                    }
                }
            }
            else if(choice.equals("exit")) {
                System.out.println("Have a good one!");
                break;
            }
        }
    }
    public void userDollarAmount() {
        Scanner scanner = new Scanner(System.in);
        Audit audit = new Audit();
        System.out.println("Please insert a dollar bill (only accepts $1, $5, $10, $20 bills) or press R to return to menu ");
        String userInput = scanner.nextLine().toUpperCase();
        if(!userInput.equals("1") && !userInput.equals("5") && !userInput.equals("10") && !userInput.equals("20") && !userInput.equals("R")) {
            System.err.println("Invalid input");
            return;
        } else if (userInput.equals("R")) {
            return;
        } else {
            BigDecimal bill = new BigDecimal(userInput);
            machineBalance = machineBalance.add(bill);
            Audit.auditWriter("MONEY FEED:", bill, machineBalance);
        }
    }
    public void userSelection(RestockingItems restockingItems) {
        Scanner scanner = new Scanner(System.in);
        Display display = new Display();
        display.getDisplay();
        System.out.println();
        System.out.println("Watchu want? ");
        String selection = scanner.nextLine().toUpperCase();

        if (!restockingItems.getInventory().containsKey(selection)) {
            System.err.println("Not a valid slot");

        } else {
            Items item = restockingItems.getInventory().get(selection);
            double price = item.getItemPrice();
            String priceString = Double.toString(price);
            BigDecimal bigPrice = new BigDecimal(priceString);
            if (item.getItemsStock() == 0) {
                System.err.println("Out of stock");
            } else if (bigPrice.compareTo(machineBalance) == 1) {
                System.out.println("Not enough money");
            } else {
                machineBalance = machineBalance.subtract(bigPrice);
                Audit.auditDate();
                item.setItemsStock(item.getItemsStock() - 1);
                System.out.println();
                System.out.println("_____________________________________");
                System.out.println(item.getItemName() + " $" + item.getItemPrice() );
                System.out.println();
                System.out.println(item.getMessage());
                System.out.println("_____________________________________");
                Audit.auditWriter(item.getItemName(), machineBalance , machineBalance);
            }
        }
    }

    public void finishTransaction() {
        System.out.println();
        System.out.println("The total amount returned is: $" + machineBalance);
        Audit.auditWriter("CHANGE GIVEN:", machineBalance, new BigDecimal("0.00"));

        int dollar = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        while (machineBalance.compareTo(BigDecimal.valueOf(0.0)) >= 0) {
            if (machineBalance.compareTo(BigDecimal.valueOf(1.0)) >= 0) {
                machineBalance = machineBalance.subtract(BigDecimal.valueOf(1.0));
                dollar++;
            } else if (machineBalance.compareTo(BigDecimal.valueOf(0.25)) >= 0) {
                machineBalance = machineBalance.subtract(BigDecimal.valueOf(0.25));
                quarters++;
            } else if (machineBalance.compareTo(BigDecimal.valueOf(0.10)) >= 0) {
                machineBalance = machineBalance.subtract(BigDecimal.valueOf(0.10));
                dimes++;
            } else if (machineBalance.compareTo(BigDecimal.valueOf(0.05)) >= 0) {
                machineBalance = machineBalance.subtract(BigDecimal.valueOf(0.05));
                nickels++;
            } else {
                break;
            }
        }
        if (dollar > 0) {
            System.out.print(dollar + " dollar(s) ");
        }
        if (quarters > 0) {
            System.out.print(quarters + " quarter(s) ");
        }
        if (dimes > 0) {
            System.out.print(dimes + " dimes(s) ");
        }
        if (nickels > 0) {
            System.out.print(nickels + " nickle(s) ");
        }
    }
}