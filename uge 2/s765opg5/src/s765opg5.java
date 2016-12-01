/**
 * Created by clint on 02-09-2016.
 */
import java.util.*;

public class s765opg5 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,6,3,3,8,8,6,5,3,2,5,8));
        sortAndRemoveDublicates(numbers);
        System.out.println(numbers);
    }

    public static void sortAndRemoveDublicates(List<Integer> input)
    {
        Set<Integer> newList = new HashSet<>(input);
        input.clear();
        input.addAll(newList);
        Collections.sort(input);
    }
}
