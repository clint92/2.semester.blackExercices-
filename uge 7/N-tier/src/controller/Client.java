package controller;

import BL.GroceryItemOrder;
import BL.GroceryList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created by clint on 18-10-2016.
 */
public class Client {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        GroceryList list = new GroceryList();
        Scanner console = new Scanner(System.in);
        String temp = "";

        System.out.println("create new grocery list press 'N'.");
        System.out.println("get grocery list press 'G'.");
        System.out.println("Exit. pres -1");

        if("N".equals(console.next()))
        {
            System.out.println("Enter name for list:");
            temp = console.next();
            GroceryList list1 = new GroceryList(temp);
        }
        else if("G".equals(console.next()))
        {
            System.out.println("Enter list name");
            temp = console.next();
            list = list.getGroceryList(temp);
            System.out.println(list);
        }

        System.out.println("Add to grocery to list? press Y. else exit");

        if("Y".equals(console.next()))
        {
            while(!"E".equals(console.next()))
            {
                System.out.println("enter item, quantity and price");
                list.add(new GroceryItemOrder(console.next(), console.nextInt(), console.nextDouble()));
                System.out.println(list);
                System.out.println("add more press enter. press E to exit and save.");
            }

            System.out.println("save in new file press N else press enter");

            if("N".equals(console.next()))
            {
                System.out.println("Enter new Name");
                temp = console.next();
            }

        }

            list.saveData(temp,list);
            System.out.println("Bye");
        }


        //GroceryList list = new GroceryList("Mette");
        //System.out.println(list.getGroceryList("Mette"));
       /*GroceryList list2 = new GroceryList("shopping");
        list2.add(new GroceryItemOrder("træ", 2, 10.5));
        list2.add(new GroceryItemOrder("blæer", 1, 9));
        list2.add(new GroceryItemOrder("junk", 2, 10));
        list2.add(new GroceryItemOrder("kød", 1, 6));
        list2.add(new GroceryItemOrder("blommer", 10, 1.5));
        list2.add(new GroceryItemOrder("blomster", 1, 125));
        list2.add(new GroceryItemOrder("shampoo", 2, 25));
        list2.add(new GroceryItemOrder("marsbar", 1, 12));
        list2.add(new GroceryItemOrder("agurk", 3, 6));
        list2.add(new GroceryItemOrder("kiwi", 5, 4));*/

        //list2.GetTotalCost();
        //  System.out.println(list2);
        // C:\Users\clint\Desktop\datamatiker\2. semester\Java øvelser\black exercise\GroceryList\src


    }

