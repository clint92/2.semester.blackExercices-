import java.util.*;

/**
 * Created by clint on 05-09-2016.
 */
public class s765opg7 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,6,5));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(9,8,7,2,3,3,3));

        System.out.println(countcommon(list2,list1));
    }

    public static int countcommon(List<Integer> list1, List<Integer> list2)
    {
        Set<Integer> intersection = new HashSet<Integer>(list1);
        intersection.retainAll(list2);
        return intersection.size();
    }
}
