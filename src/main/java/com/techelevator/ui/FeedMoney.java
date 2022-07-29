package com.techelevator.ui;

import com.techelevator.purchase.Money;

import java.util.Scanner;

public class FeedMoney {

    private final Double SINGLE_DOLLAR = 1.00;
    private final Double FIVE_DOLLAR = 5.00;
    private final Double TEN_DOLLAR = 10.00;
    private final Double TWENTY_DOLLAR = 20.00;
    private Double bills;

    public FeedMoney (){

    }

    public boolean acceptedDollars() {
        if (!(bills == SINGLE_DOLLAR) && (bills == FIVE_DOLLAR) && (bills == TEN_DOLLAR) && (bills == TWENTY_DOLLAR)) {
            return false;
        } else {
            return true;
        }
    }
    public Double startingBalance() {
        boolean isTrue = acceptedDollars();
        Double startBalance = 0.00;
        if (isTrue) {

            //while {
               startBalance += bills;
        }
        return startBalance;
    }

    public Double getBills() {
        return bills;
    }

    public void setBills(Double bills) {
        this.bills = bills;
    }

    public Double getUserDollarAmount () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a dollar bill (only accepts $1, $5, $10, $20 bills)");
        setBills(Double.parseDouble(scanner.nextLine()));
        System.out.println(scanner);
        // use the other 2 methods to make sure the dolalr is 1,5,10,20 and then
        // add dollar to the user amount.

//        while ()

        return null;
    }
    }
