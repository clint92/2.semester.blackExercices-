package DAO;

import BL.GroceryList;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Created by clint on 18-10-2016.
 */
public interface DataBaseInterface {


    public GroceryList loadGroceryList(String name) throws FileNotFoundException;

    public void saveData(String name, GroceryList list) throws FileNotFoundException, UnsupportedEncodingException;
}
