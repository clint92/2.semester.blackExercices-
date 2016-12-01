import java.util.HashMap;
import java.util.Map;

/**
 * Created by clint on 06-09-2016.
 */
public class s765opg14 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map1.put("ge", 1);
        map1.put("et", 2);
        map1.put("12", 3);
        map1.put("yn", 4);
        map1.put("er", 5);

        map2.put("ge", 1);
        map2.put("77", 1);
        map2.put("hy", 1);
        map2.put("ik", 1);
        map2.put("yn", 4);
        map2.put("12", 1);

        System.out.println(intersect(map1, map2));

    }

    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2)
    {
        Map<String, Integer> newMap = new HashMap<String, Integer>();

        // if map2 contains key from map1
        for (String keyS: map1.keySet())
        {
            if(map2.containsKey(keyS) && map2.get(keyS).equals(map1.get(keyS)))
            {
                newMap.put(keyS,map1.get(keyS));
            }
        }
       return newMap;
    }



}
