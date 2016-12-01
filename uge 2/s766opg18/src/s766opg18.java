import java.util.*;

/**
 * Created by clint on 10-09-2016.
 */
public class s766opg18 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("ali", "123");
        map1.put("anders", "123");
        map1.put("bo", "123");
        map1.put("trine", "36");
        System.out.println(reverse(map1));

    }

    public static Map<String, Set<String>> reverse(Map<String, String> map1)
    {
        Map<String, Set<String> > newMap = new HashMap<>();

        for (String key: map1.keySet()) {
            if(!newMap.containsKey(map1.get(key)))
            {
                Set<String> values = new HashSet<>();
                values.add(key);
                newMap.put(map1.get(key), values);
            }
            else
            {
                Set<String> i = newMap.get(map1.get(key));
                i.add(key);
                newMap.put(map1.get(key), i);
            }

        }
        return newMap;
    }
}
