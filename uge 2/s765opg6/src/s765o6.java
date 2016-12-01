import java.util.*;

/**
 * Created by clint on 05-09-2016.
 */
public class s765o6 {


    public static void main(String[]args){
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,3,3,4,5,61,5,5,6,4,1,2));
        System.out.println(countUnique(list));
    }


    public static int countUnique(List<Integer> numbers)
    {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        int amount = uniqueNumbers.size();
        return amount;
    }
}
