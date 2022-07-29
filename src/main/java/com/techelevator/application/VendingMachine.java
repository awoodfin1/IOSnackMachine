package com.techelevator.application;

import com.techelevator.ui.Display;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class VendingMachine {
    public void run() {
        RestockingItems stock = new RestockingItems();
        System.out.println(stock.getInventory().toString());

        while(true) {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();
            System.out.println(choice);
            if(choice.equals("display")) {
                Display display = new Display();
                       display.getDisplay();
            }
            else if(choice.equals("purchase")) {
                String answer = UserInput.getMenuOptions();
                System.out.println(answer);

            }
            else if(choice.equals("exit")) {
                // good bye
                break;
            }
        }
    }
}
