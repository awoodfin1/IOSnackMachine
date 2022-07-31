package com.techelevator.ui;

import java.io.*;

// Not sure how we get it to other classes

public class audit {

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

    
}
