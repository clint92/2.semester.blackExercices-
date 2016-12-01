import java.util.*;

/**
 * Created by clint on 08-09-2016.
 */
public class s765opg15 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,1,4,8,8,1));
        System.out.println(maxOccurences(list));
    }

    public static Integer maxOccurences(List<Integer> list1)
    {
        Map<Integer,Integer> listOfNumbers = new HashMap<>();
        Iterator<Integer> i = list1.iterator();

        // check if new map list had next key.
        while(i.hasNext())
        {
            int key = i.next();
            if(listOfNumbers.containsKey(key))
            {
                // set new value
                int value = listOfNumbers.get(key);

                listOfNumbers.put(key, value + 1);
            }
            else
            {
                // set value
                listOfNumbers.put(key, 1);
            }
        }
        // find max value
        int maxValueInMap = Collections.max(listOfNumbers.values());
        return maxValueInMap;
    }
}
