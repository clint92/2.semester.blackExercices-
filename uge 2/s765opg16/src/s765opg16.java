import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by clint on 08-09-2016.
 */
public class s765opg16 {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        /*map1.put("anders", "123");
        map1.put("gunnar", "23");
        map1.put("bo", "123");
        map1.put("trine", "3");
        map1.put("ahmed", "555");
        map1.put("mohammed", "532");
        map1.put("ali", "321");
*/
        System.out.println(is1to1(map1));
    }

    public static boolean is1to1(Map<String, String> map1)
    {
        boolean result = true;
        Set<String> set1 = new HashSet<>(map1.values());

        if(map1.size() != set1.size())
        {
            result = false;
        }
        else

        {
            result = true;
        }

        return result;
    }
}
