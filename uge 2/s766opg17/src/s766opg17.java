import java.util.HashMap;
import java.util.Map;

/**
 * Created by clint on 10-09-2016.
 */
public class s766opg17 {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("anders", "123");
        map1.put("gunnar", "23");
        map1.put("bo", "123");
        map1.put("trine", "36");

        map2.put("anders", "123");
        map2.put("gunnar", "23");
        map2.put("bo", "123");
        map2.put("trine", "3");
        map2.put("ahmed", "555");
        map2.put("mohammed", "532");

        System.out.println(supMap(map1,map2));
    }
    public static boolean supMap(Map<String, String> map1, Map<String, String> map2)
    {
        boolean result = false;

        for (String key: map1.keySet())
        {
            if (map2.containsKey(key) && map2.get(key) == map1.get(key))
            {
                result = true;
            }
            else
            {
                result = false;
                break;
            }
        }
        return result;
    }
}
