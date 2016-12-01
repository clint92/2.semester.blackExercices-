package kap12;
import java.util.Scanner;
/**
 * Created by clint on 20-09-2016.
 */
public class kap12opg6 {

    public static int hexToDecimal(String hex) {
           int decimalValue = 0;
           try {
               if (hex.length() < 1) {
                   for (int i = 0; i < hex.length(); i++) {
                       char hexChar = hex.charAt(i);
                       decimalValue = decimalValue + hexCharToDecimal(hexChar);
                   }


                   }

               }
               catch(NumberFormatException ex){
                   System.out.println(ex);
           }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) throws NumberFormatException {
        int value = (int) ch;
        System.out.println(value);
        if( ch >= 'A' && ch <= 'F') {
            if (ch >= 'A' && ch <= 'F') {
                return 10 + ch - 'A';
            } else // ch is '0', '1', ..., or '9'
            {
                return ch - '0';
            }
        }
            else
            {
                throw new NumberFormatException("not a hex number");
            }
    }

}
