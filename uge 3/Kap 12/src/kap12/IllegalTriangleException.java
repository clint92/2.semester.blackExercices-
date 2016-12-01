package kap12;

/**
 * Created by clint on 19-09-2016.
 */
public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String error)
    {
        super("invalid sides" );
    }
}
