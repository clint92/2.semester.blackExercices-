package kap12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by clint on 19-09-2016.
 */
public class Kap12opg3 {

    public static void arrayIndex(int[] list)
    {
        Scanner input = new Scanner(System.in);
        boolean continuee = true;
        System.out.println("enter an int representing the index which value you would like to see");
        do
        {
            try
            {
                int index = input.nextInt();
                System.out.println("the value of the index " + index + " is: " + list[index] );
                continuee = false;
            }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("index is out of bound. enter again");
                    input.nextLine();
                }
        }while(continuee);
    }
}
