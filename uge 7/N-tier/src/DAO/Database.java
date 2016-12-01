package DAO;

import BL.GroceryItemOrder;
import BL.GroceryList;

import java.io.*;
import java.util.Scanner;

/**
 * Created by clint on 18-10-2016.
 */
public class Database implements DataBaseInterface {
    Scanner data;
    File file;


    public Database() {

    }

    public Database(String name) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        try {
            file = new File("C:\\Users\\clint\\Google Drev\\datamatiker\\2. semester\\Java øvelser\\black exercise\\uge 7\\N-tier\\src\\DAO\\" + name + ".txt");
            if (file.createNewFile()) {
                System.out.println("New grocery list " + name + " is created!");
            } else {
                System.out.println("grocery list " + name + " already exists. Overwrite? Y / N");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public GroceryList loadGroceryList(String listName) throws FileNotFoundException {
        GroceryList list = new GroceryList();
        String item = "";
        int quantity;
        double price;


        data = new Scanner(new File("C:\\Users\\clint\\Google Drev\\datamatiker\\2. semester\\Java øvelser\\black exercise\\uge 7\\N-tier\\src\\DAO\\" + listName + ".txt"));

        while (data.hasNextLine()) {
            while (data.hasNext()) {
                data.next();
                item = data.next();
                data.next();
                quantity = Integer.parseInt(data.next());
                data.next();
                price = Double.parseDouble(data.next());
                data.next();
                list.add(new GroceryItemOrder(item, quantity, price));
            }
        }
        return list;
    }

    public void saveData(String name, GroceryList list) throws FileNotFoundException, UnsupportedEncodingException {
       // Scanner console = new Scanner(System.in);
       // System.out.println("save press S. Save with new file name pres N");
       // if ("S".equals(console.next())) {
        PrintWriter writer = new PrintWriter("C:\\Users\\clint\\Google Drev\\datamatiker\\2. semester\\Java øvelser\\black exercise\\uge 7\\N-tier\\src\\DAO\\" + name + ".txt");
        writer.println(list);
        writer.close();
            /*try {
                File tempFile = File.createTempFile("myfile", ".tmp");
                FileOutputStream fout = new FileOutputStream(tempFile);
                PrintStream out = new PrintStream(fout);
                out.println(list);
            } catch (IOException ex) {
                System.out.println("There was a problem creating/writing to the temp file");
                ex.printStackTrace();
            }*/
        }
        /*    else if("N".equals(console.next()))
            {

            }*/
    }
//}
