package Database;
import BL.GroceryItemOrder;
import BL.GroceryItemOrderInterface;
import BL.GroceryList2;
import BL.GroceryListInterface;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by clint on 13-11-2016.
 */
public class Database implements Data {
    private ArrayList<GroceryItemOrderInterface> list;

    public Database()
    {
         list = new ArrayList<GroceryItemOrderInterface>();
    }

    public void getFile(String name) throws FileNotFoundException {

        Scanner input = new Scanner(new File("C:\\Users\\clint\\Google Drev\\datamatiker\\2. semester\\Java øvelser\\black exercise\\uge 7\\N-tier-new\\src\\Database\\"+ name +".txt"));
        while (input.hasNextLine()) {
            while (input.hasNext()) {
                list.add(new GroceryItemOrder(input.next(), input.nextInt(), input.nextDouble()));
            }
        }
    }

        public ArrayList getGList()
    {
        return list;
    }
}
