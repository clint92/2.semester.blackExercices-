import com.sun.org.apache.xpath.internal.SourceTree;
import kap12.*;

import java.util.Random;
import java.util.Scanner;

import static kap12.Kap12opg3.arrayIndex;
import static kap12.kap12opg1.*;
import static kap12.kap12opg2.*;
import static kap12.kap12opg4.*;
import static kap12.kap12opg6.*;
import static kap12.kap12opg7.*;

/**
 * Created by clint on 19-09-2016.
 */

public class main {
    public static void main(String[] args) throws Exception {

        ///////////////////////////////////opg 1///////////////////////////////////////////////
        /*calculate("31", "9.8");
        calculate("hu", "4");

        calculate2("4", "i");*/


        ///////////////////////////////////Opg 2////////////////////////////////////////////////
        //printSum();


        ///////////////////////////////////Opg 3/////////////////////////////////////////
      /*  int[] list = new int[100];
        for(int i = 0; i < list.length; i++)
        {
            Random rand = new Random();
            int num = rand.nextInt(100);
            list[i] = num;
        }
        arrayIndex(list);*/


      ////////////////////////////////////// opg 4 //////////////////////////////////
        //kap12opg4 loan = new kap12opg4(0, 2000, 20);


        ////////////////////////////////////// opg5 //////////////////////////////
        /*try {
            kap12opg5 triangle = new kap12opg5(20, 50, 20);
        }
        catch(IllegalTriangleException e)
        {
            System.out.println(e);
        }*/


        ///////////////////////////////////opg6 /////////////////////////////////
        // virker ikke
      /*  // Create a Scanner
       Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));

*/
       ///////////////////////////////////opg 7///////////////////////////////////
        //virker ikke
       /* String binaryCode = "101004";
        bin2Dec(binaryCode);
        System.out.println(binaryCode);*/

       ///////////////////////// Faical opgave 1 /////////////////////////
        /*try
        {
            int var1 = 2;
            int  var2 = 0;
            if(var1 == 0 || var2 == 0 ) throw new ZeroException();
            System.out.println(var1 / var2);
        }
        catch(ZeroException ex)
        {
            System.out.println(ex);
        }*/

        /////////////////// Faical opgave 2 ///////////////////////////
        try
        {
            Scanner input = new Scanner(System.in);
            System.out.println("enter index");
            int index = input.nextInt();
            int[] list = new int[10];
            if( index > list.length || index < 0) throw new ArrayOutOfBoundException();
            System.out.println(index);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex);
        }
    }
}