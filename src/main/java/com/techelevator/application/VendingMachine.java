package com.techelevator.application;

import com.techelevator.stock.Items;
import com.techelevator.ui.*;

public class VendingMachine {
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
                    String answer = UserInput.getMenuOptions(feedMoney);
                    System.out.println(answer);
                    if (answer.equals("Feed Money")) {
                        feedMoney.userDollarAmount();
                    } else if(answer.equals("Select Item")){
                        selectItem.userSelection(stock);
                    }
                }



            }
            else if(choice.equals("exit")) {
                // good bye
                break;
            }
        }
    }
}
