package com.techelevator.ui;

import com.techelevator.application.RestockingItems;

import java.util.Scanner;

public class SelectItem {

    public SelectItem() {
    }

    Scanner scanner = new Scanner(System.in);



    public void userSelection(){
        RestockingItems restockingItems = new RestockingItems();
        Display display = new Display();
        display.getDisplay();
        System.out.println();
        System.out.println("Watchu want? ");
        String selection = scanner.nextLine();

        //RestockingItems ourMap = new RestockingItems();
        Display ourArray = new Display();
        ourArray.getArr();
        for (int i = 0; i < ourArray.getArr().length; i++) {
            if (selection.equals(ourArray.getArr())) {
                //return ourArray.getArr([1]);
            }
        }



        //System.out.println(display.getDisplay([3]));
    }


}
