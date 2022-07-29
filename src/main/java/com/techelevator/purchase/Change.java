package com.techelevator.purchase;

import java.math.BigDecimal;


public class Change {

    public void makeChange() {

    BigDecimal balance = new BigDecimal("2.45");


        System.out.println("The total amount returned is: $" + balance);

    int dollar = 0;
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;

        while (balance.compareTo(BigDecimal.valueOf(0.0)) >= 0) {       // >= 0 means the comparison is true
        if (balance.compareTo(BigDecimal.valueOf(1.0)) >= 0) {
            balance = balance.subtract(BigDecimal.valueOf(1.0));
            dollar++;
        } else if (balance.compareTo(BigDecimal.valueOf(0.25)) >= 0) {
            balance = balance.subtract(BigDecimal.valueOf(0.25));
            quarters++;
        } else if (balance.compareTo(BigDecimal.valueOf(0.10)) >= 0) {
            balance = balance.subtract(BigDecimal.valueOf(0.10));
            dimes++;
        } else if (balance.compareTo(BigDecimal.valueOf(0.05)) >= 0) {
            balance = balance.subtract(BigDecimal.valueOf(0.05));
            nickels++;
        } else {
            break;
        }
    }
        if (dollar > 0) {
        System.out.print((int) dollar + " dollar(s) ");
    }
        if (quarters > 0) {
        System.out.print((int) quarters + " quarter(s) ");
    }
        if (dimes > 0) {
        System.out.print((int) dimes + " dimes(s) ");
    }
        if (nickels > 0) {
        System.out.print((int) nickels + " nickle(s) ");
    }
}
}


