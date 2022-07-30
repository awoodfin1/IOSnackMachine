package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Scanner;

import com.techelevator.application.RestockingItems;
import com.techelevator.ui.FeedMoney;


/**
 * Responsibilities: This class should handle receiving ALL input from the User
 *
 * Dependencies: None
 */
public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        System.out.println("option = " + option);
        if (option.equals("d")) {
            return "display";
        }
        else if (option.equals("p")) {
            return "purchase";
        }
        else if (option.equals("e")) {
            return "exit";
        }
        else {
            return "";
        }
    }

    public static String getMenuOptions(BigDecimal balance){
        System.out.println();
        System.out.println("(M) Feed Money");
        System.out.println("(S) Select item");
        System.out.println("(F) Finish Transaction");
        System.out.println();
        System.out.println("Current Money Provided: $" + balance);
        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        System.out.println("Option = " + option);

        if (option.equals("m")) {

            return "Feed Money";

        }
        else if (option.equals("s")) {
            return "Select Item";
            // Select Item \n
        }
        else if (option.equals("f")) {
            return "Finish Transaction";
        }
        else {
            return "";
        }
    }


}

