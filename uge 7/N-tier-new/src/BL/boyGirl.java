package BL;

import Database.DataBoyGirl;
import Database.DataBoyGirlInterface;

import java.io.FileNotFoundException;

/**
 * Created by clint on 17-11-2016.
 */
public class boyGirl implements boyGirlInterface{
    DataBoyGirlInterface schoolClass;
    private int boys;
    private int girls;
    private int boyName;
    private int girlName;

    public void getFile(String name) throws FileNotFoundException
    {
        schoolClass = new DataBoyGirl();
        schoolClass.readFile(name);
        this.boys = schoolClass.getBoys();
        this.girls = schoolClass.getGirls();
        this.boyName = schoolClass.getBoyName();
        this.girlName = schoolClass.getGirlName();

    }

    public void printSum()
    {
        int sum = Math.abs(boys-girls);
        System.out.println("Age difference between boys' and girls' sums: " + sum);
    }

    public void printBoyAndGirlAmount()
    {
        System.out.println(boyName + " boys, " + girlName + " girls");
    }
}
