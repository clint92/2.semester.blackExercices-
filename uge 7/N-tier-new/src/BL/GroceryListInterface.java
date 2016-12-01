package BL;

import java.io.FileNotFoundException;

/**
 * Created by clint on 16-11-2016.
 */
public interface GroceryListInterface {
    public void add(GroceryItemOrder item);
    public void getTotalCost();
    public void getData(String name)throws FileNotFoundException;
}
