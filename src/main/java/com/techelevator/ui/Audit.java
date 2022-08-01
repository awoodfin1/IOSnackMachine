package com.techelevator.ui;

import com.techelevator.application.RestockingItems;
import com.techelevator.application.VendingMachine;

import java.io.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Audit {

    public static void audit(String report) {

        File audit = new File("audit.txt");

        try {
            if (!audit.exists()) {
                audit.createNewFile();
            }
        } catch (FileNotFoundException e) {
            System.out.println(audit.getName() + " not found");
        } catch (IOException e) {
            System.out.println("Problem creating file.");
        }
    }

    public static String auditDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy " + "hh:mm:ss aa ");
        String date = dateFormat.format(new Date());
        return date;
    }

//    public static void feedMoneyAudit(BigDecimal balance) {
//
//    }
//
//    public static void purchaseChange(BigDecimal balance) {
//        System.out.println(balance);
//
//    }

    public static void auditWriter(String message, BigDecimal balance, BigDecimal balanceAfter) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("audit.txt", true);
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            DecimalFormat bigDecimal = new DecimalFormat("0.00");
            printWriter.println(">" + auditDate() + " " + String.format("%-19s", message) + " $" + bigDecimal.format(balance) + " $" + bigDecimal.format(balanceAfter));
            printWriter.flush();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
