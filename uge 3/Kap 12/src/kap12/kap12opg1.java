package kap12;
import java.util.Scanner;
/**
 * Created by clint on 18-09-2016.
 */
public class kap12opg1 {


    public static void calculate(String input, String input2) throws NumberFormatException
    {
        try
        {
            double num = Double.parseDouble(input);
            double num2 = Double.parseDouble(input2);
            System.out.println(num + num2);
        }
        catch (NumberFormatException e)
        {
            System.out.println("wrong format exception");
        }
    }

    public static void calculate2(String input, String input2)
    {

        Scanner check = new Scanner(input);
        Scanner check2 = new Scanner(input2);
        if(check.hasNextDouble() || check.hasNextInt())
        {
            if(check2.hasNextDouble() || check2.hasNextInt())
            {
                double num = Double.parseDouble(check.next());
                double num2 = Double.parseDouble(check2.next());
                System.out.println(num + num2);
            }
            else
            {
                System.out.println("wrong format in input");
            }
        }
        else
        {
            System.out.println("wrong format in input");
        }
    }

}
