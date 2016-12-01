package BL;

import Database.Data;
import Database.Database;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by clint on 29-08-2016.
 */
public class GroceryList2 implements GroceryListInterface{
    private ArrayList<GroceryItemOrder> list2 = new ArrayList<GroceryItemOrder>();

    public void add(GroceryItemOrder item)

    {
        list2.add(item);
    }

    public void getTotalCost()

    {
        double totalPrice = 0;
        System.out.println("Items:" + "\n");
        for(int i = 0; i < list2.size(); i++)
        {
            System.out.println(list2.get(i));
            totalPrice += list2.get(i).getCost();

        }
        System.out.printf("Total: " + totalPrice + " Kr.");
        System.out.println();
    }

    public void getData(String name) throws FileNotFoundException {
        Data list = new Database();
        list.getFile(name);
        list2 = list.getGList();
    }



    ////////////////////////////////to String///////////////////////////////////
    public String toString()
    {
        String output = "";
        for(int i = 0; i < list2.size(); i++)
        {
            output += "Item: " + list2.get(i).getItem() + ". Quantity: " + list2.get(i).getQuantity() + ". Price: " + list2.get(i).getCost() + " Kr.\n";
        }

        return output;
    }
}

