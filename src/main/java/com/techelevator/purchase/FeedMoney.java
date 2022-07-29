package com.techelevator.purchase;

import java.util.Objects;

public class FeedMoney extends Money{

    private final Double SINGLE_DOLLAR = 1.00;
    private final Double FIVE_DOLLAR = 5.00;
    private final Double TEN_DOLLAR = 10.00;
    private final Double TWENTY_DOLLAR = 20.00;
    private Double bills;

    public FeedMoney(Double wholeDollars) {
        super(wholeDollars);
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
}
