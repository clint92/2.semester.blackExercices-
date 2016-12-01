import java.util.*;

/**
 * Created by clint on 10-09-2016.
 */
public class s766opg19 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("ali", 4);
        map1.put("anders", 4);
        map1.put("e", 4);
        map1.put("trine", 3);
        map1.put("fin", 2);
        map1.put("bo", 2);
        map1.put("noah", 3);
        System.out.println(rarest(map1));
    }

    public static Integer rarest(Map<String, Integer> map1)
    {
        Map<Integer, Integer> count = new TreeMap<>();
        Integer result = 0;

        if (map1.isEmpty())
        {
            throw new IllegalArgumentException();
        } else {
            for (String i : map1.keySet())
            {
                if (count.containsKey(map1.get(i)))
                {
                    Integer value = count.get(map1.get(i));
                    count.put(map1.get(i), value + 1);
                } else {
                    count.put(map1.get(i), 1);
                }
            }

            Integer m = Collections.min(count.values());
            for (Integer j : count.keySet())
            {
                if (count.get(j) == m)
                {
                    result = j;
                    break;
                }
            }


            return result;

        }
    }
}
