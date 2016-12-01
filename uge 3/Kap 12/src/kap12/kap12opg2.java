package kap12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by clint on 19-09-2016.
 */
public class kap12opg2 {

    public static void printSum() {
        int num = 0;
        int num2 = 0;
        boolean continuee = true;
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1 int");
        do {

            try {
                num = input.nextInt();
                System.out.println("enter one more int");
                num2 = input.nextInt();
                System.out.println(num + " + " + num2 + " = " + (num + num2));
                continuee = false;
            }
            catch (InputMismatchException e) {
                System.out.println("Input not an int. Try again");
                input.nextLine();
            }
        }while (continuee) ;
    }
}
