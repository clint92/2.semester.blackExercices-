package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        GroceryList list1 = new GroceryList();
        list1.add(new GroceryItemOrder("appel",2,2.5));
        list1.add(new GroceryItemOrder("orange", 4, 6));
        list1.add(new GroceryItemOrder("bær", 4, 2));
        list1.add(new GroceryItemOrder("kød", 1, 6));
        list1.add(new GroceryItemOrder("blommer", 10, 1.5));
        list1.add(new GroceryItemOrder("blomster", 1, 125));
        list1.add(new GroceryItemOrder("shampoo", 2, 25));
        list1.add(new GroceryItemOrder("marsbar", 1, 12));
        list1.add(new GroceryItemOrder("agurk", 3, 6));
        list1.add(new GroceryItemOrder("kiwi", 5, 4));
       // list1.add(new GroceryItemOrder("zigs", 2, 41));
       // list1.GetTotalCost();
       // System.out.println(Apple);
        //System.out.println(list1);



        GroceryList2 list2 = new GroceryList2();
        list2.add(new GroceryItemOrder("træ",2,10.5));
        list2.add(new GroceryItemOrder("blæer", 1, 9));
        list2.add(new GroceryItemOrder("junk", 2, 10));
        list2.add(new GroceryItemOrder("kød", 1, 6));
        list2.add(new GroceryItemOrder("blommer", 10, 1.5));
        list2.add(new GroceryItemOrder("blomster", 1, 125));
        list2.add(new GroceryItemOrder("shampoo", 2, 25));
        list2.add(new GroceryItemOrder("marsbar", 1, 12));
        list2.add(new GroceryItemOrder("agurk", 3, 6));
        list2.add(new GroceryItemOrder("kiwi", 5, 4));

        //list2.GetTotalCost();
      //  System.out.println(list2);
       // C:\Users\clint\Desktop\datamatiker\2. semester\Java øvelser\black exercise\GroceryList\src





        GroceryList2 list3 = new GroceryList2();
        Scanner input = new Scanner(new File("C:\\Users\\clint\\Google Drev\\datamatiker\\2. semester\\Java øvelser\\black exercise\\uge 1\\GroceryList\\src\\com\\company\\shopping.txt"));
        while(input.hasNextLine())
        {
            while(input.hasNext())
            {
                list3.add(new GroceryItemOrder(input.next(), input.nextInt(), input.nextDouble()));
            }
        }

        System.out.println(list3);
        list3.GetTotalCost();
    }
}
