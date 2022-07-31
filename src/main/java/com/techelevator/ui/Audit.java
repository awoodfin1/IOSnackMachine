package com.techelevator.ui;

import com.techelevator.application.RestockingItems;
import com.techelevator.application.VendingMachine;

import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


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

    public static String auditDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy " + "hh:mm:ss aa ");
        String date = dateFormat.format(new Date());
        return date;
    }

    public static void feedMoneyAudit(BigDecimal balance){
        System.out.println(balance);
        // how do we log this in the audit.txt?
    }


    public static String itemNameAudit(){
    // needs get Name for item selected.
        return null;
    }

    public static void purchaseChange(BigDecimal balance){
        System.out.println(balance);

    }

    public static void itemSelector(){
    // get slot for item selected.
    }

    public static void auditWriter(TreeMap <String,Integer> treeMap) {
        // treemap.. not sure how to make this work.
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("audit.txt", true);
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            printWriter.print(auditDate());
            for (Map.Entry <String,Integer> entry: treeMap.entrySet()) {
                printWriter.append(entry.getKey());



            }
//            printWriter.print(auditDate());
//            printWriter.append("MONEY FED");
            printWriter.println();
            printWriter.flush();
            printWriter.close();

        } catch (IOException e){
            System.out.println("problemooo");
        }
    }

}
