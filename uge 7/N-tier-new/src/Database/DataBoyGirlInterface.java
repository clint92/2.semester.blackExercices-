package Database;

import java.io.FileNotFoundException;

/**
 * Created by clint on 17-11-2016.
 */
public interface DataBoyGirlInterface {
public void readFile(String name) throws FileNotFoundException;
    public int getBoys();
    public int getGirls();
    public int getGirlName();
    public int getBoyName();
}
