package com.techelevator.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Display {
    private List<String> list = new ArrayList<>();
//    private List<String> list = new ArrayList();


    //System.out.println(list + "\n");
    public Display() {


    }

    public void getDisplay (){
        File file = new File("catering.csv");
        List<String> list = new ArrayList<>();
        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String itemInVendingMachine = scanner.nextLine();
                String [] arr = itemInVendingMachine.split(",");

                for (int i = 0; i < arr.length; i += 4) {
                    list.add (arr[i]+", "+arr[i+1]+", "+arr[i+2]+", "+arr[i+3] +"\n");
                }
            }
            System.out.println(list.toString());
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

}
