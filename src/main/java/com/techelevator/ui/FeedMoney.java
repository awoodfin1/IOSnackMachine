package com.techelevator.ui;

import com.techelevator.purchase.Money;

import java.util.Scanner;

import static com.techelevator.ui.UserInput.getMenuOptions;

public class FeedMoney {

    private final Double SINGLE_DOLLAR = 1.00;
    private final Double FIVE_DOLLAR = 5.00;
    private final Double TEN_DOLLAR = 10.00;
    private final Double TWENTY_DOLLAR = 20.00;
    private Double bills;
    private boolean isBill = true;
    private Double startBalance = 0.00;



    public FeedMoney (){

    }
    public double userDollarAmount() {
        Scanner scanner = new Scanner(System.in);

        while (isBill) {
            System.out.println("Please insert a dollar bill (only accepts $1, $5, $10, $20 bills) or press R to return to menu ");
//            if(scanner.nextLine().equalsIgnoreCase("r")){
//                getMenuOptions();
//            }else {
            setBills(Double.parseDouble(scanner.nextLine()));
//            continue;
//
//        }
            if (acceptedDollars()) {
                System.out.println("this is a bill " + bills);
                startingBalance();
                System.out.println();

            } else if (isBill = false) {
                return userDollarAmount();
            } else {
                break;
            }

        }
    // }
        return bills;
    }
    public boolean acceptedDollars() {
        double currentValueOfBills = getBills();
        if ((bills == 1.00) || (bills == 5.00) || (bills == 10.00) || (bills == 20.00)) {
            System.out.println("Dollar Accepted!");
            return true;
        } else {
            System.out.println("Sorry, Please Insert a Valid Dollar Amount: ");
            return false;
        }
    }
    public Double startingBalance() {
        boolean isTrue = acceptedDollars();

        if (isTrue) {

            //while {
               startBalance += bills;
        }
        System.out.println("This is your current balance " + startBalance);
        return startBalance;
    }

    public Double getBills() {
        return bills;
    }

    public void setBills(Double bills) {
        this.bills = bills;
    }

//    public Double getUserDollarAmount () {
//
////        while(isBill){
////            if(bills ==  ){
////
////            }else{
////                isBill = false;
////
////            }
//
//        }
        // use the other 2 methods to make sure the dolalr is 1,5,10,20 and then
        // add dollar to the user amount.

//        while ()

       // return null;
    //}
    }
