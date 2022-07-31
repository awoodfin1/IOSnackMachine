package com.techelevator.ui;

import com.techelevator.application.VendingMachine;

import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

// Not sure how we get it to other classes

public class Audit {


    public static void audit(String report) {

        File audit = new File("audit.txt");

        try {
            if(!audit.exists()){
                audit.createNewFile();
            }

        } catch (FileNotFoundException e) {
            System.out.println( audit.getName() + "not found");
        } catch (IOException e) {
            System.out.println("Problem creating file.");
        }
    }

    public static void auditDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss aa");
        String date = dateFormat.format(new Date());
        System.out.println(date);
    }

    public static void moneyTransactions(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.userDollarAmount();
        vendingMachine.getMachineBalance();
        System.out.println(vendingMachine.getMachineBalance());


    }



    
}
