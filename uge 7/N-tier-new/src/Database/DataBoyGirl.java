package Database;
import java.util.*;
import java.io.*;
/**
 * Created by clint on 17-11-2016.
 */
public class DataBoyGirl implements DataBoyGirlInterface{
   private int boys = 0;
    private int girls = 0;
   private int girlName = 0;
   private int boyName = 0;

        public void readFile(String fileName)throws FileNotFoundException
        {
            Scanner input = new Scanner(new File("C:\\Users\\clint\\Google Drev\\datamatiker\\2. semester\\Java øvelser\\black exercise\\uge 7\\N-tier-new\\src\\Database\\"+ fileName +".txt"));

            while(input.hasNextLine()){
                String line = input.nextLine();
                Scanner scanLine = new Scanner(line);

                while(scanLine.hasNext()){
                    if(boyName <= girlName){
                        String nameBoy = scanLine.next();
                        boys += scanLine.nextInt();
                        boyName++;
                    }

                    else{
                        String nameGirl = scanLine.next();
                        girls += scanLine.nextInt();
                        girlName++;
                    }
                }
            }
    }
    public int getBoys() {
        return boys;
    }

    public int getGirls() {
        return girls;
    }

    public int getGirlName() {
        return girlName;
    }

    public int getBoyName() {
        return boyName;
    }
}
