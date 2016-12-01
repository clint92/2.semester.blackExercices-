package Presentation;
import BL.GroceryList2;
import BL.GroceryListInterface;
import BL.boyGirl;
import BL.boyGirlInterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by clint on 16-11-2016.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {


      /*  GroceryListInterface list = new GroceryList2();
        list.getData("shopping");
        list.getTotalCost();*/

      //////////////////////////////////////// BoyGirl ///////////////////////
        boyGirlInterface class1 = new boyGirl();
        class1.getFile("BandG");
        class1.printBoyAndGirlAmount();
        class1.printSum();
    }
}

