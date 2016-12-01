package kap12;

/**
 * Created by clint on 20-09-2016.
 */
public class kap12opg7 {

    public static int bin2Dec(String bin) throws NumberFormatException
    {
        int result = 0;
        if(!bin.contains("1") && !bin.contains("0"))
        {
            throw new NumberFormatException("not binary");
        }
        else
        {
            result = Integer.parseInt(bin,2);
            bin = String.valueOf(result);
        }
        return result;
    }
}
