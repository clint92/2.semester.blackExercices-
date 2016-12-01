package Database;
import BL.GroceryList2;
import BL.GroceryListInterface;

import java.io.FileNotFoundException;
import java.util.ArrayList;


/**
 * Created by clint on 13-11-2016.
 */
public interface Data {
    public void getFile(String name) throws FileNotFoundException;
    public ArrayList getGList();
}
