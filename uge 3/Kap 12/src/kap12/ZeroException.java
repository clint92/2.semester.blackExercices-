package kap12;

/**
 * Created by clint on 22-09-2016.
 */
public class ZeroException extends Exception {

    public ZeroException ()
    {
        super("can not divide by zero");
    }
}
