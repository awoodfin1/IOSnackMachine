package com.techelevator.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Display {

//    private List<String> list = new ArrayList();

//System.out.println(list + "\n");
    public Display(){


    }
    public void getDisplay (){
        File file = new File("catering.csv");
        List<String> list = new ArrayList<>();
        try(Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {

                String itemInVendingMachine = scanner.nextLine();
                String [] arr = itemInVendingMachine.split("\\,");

                for (String s : arr) {
                    list.add(s + "\n");
                }
            }
            // attempt 1
            for (int i = 0; i < list ; i++) {

            }


            System.out.println(list);
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
