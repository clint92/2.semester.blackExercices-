package BL;

import DAO.Database;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


/**
 * Created by clint on 18-10-2016.
 */
public class GroceryList {
    private ArrayList<GroceryItemOrder> list2;
    String listName;
    Database data;
    public GroceryList()
    {
        list2 = new ArrayList<GroceryItemOrder>();
        data = new Database();
    }

    public GroceryList(String name) throws FileNotFoundException {
        list2 = new ArrayList<GroceryItemOrder>();
        data = new Database(name);
    }
    public void add(GroceryItemOrder item)

    {
        list2.add(item);
    }

    public void GetTotalCost()

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

    public GroceryList getGroceryList(String listName) throws FileNotFoundException
    {
       return  data.loadGroceryList(listName);
    }

    public void saveData(String name, GroceryList list) throws FileNotFoundException, UnsupportedEncodingException
    {
            data.saveData(name, list);
    }




    ////////////////////////////////to String///////////////////////////////////
    public String toString() {
        String output = "";
        for (int i = 0; i < list2.size(); i++) {
            output += "Item: " + list2.get(i).getItem() + ". Quantity: " + list2.get(i).getQuantity() + " Price: " + list2.get(i).getCost() + " Kr.\n";
        }

        return output;
    }
}
