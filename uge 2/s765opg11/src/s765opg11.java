import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by clint on 05-09-2016.
 */
public class s765opg11 {

    public static void main(String[] args) {
        Set<Integer> list = new HashSet<Integer>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(8);

        Set<Integer> list2 = new HashSet<Integer>();
        list2.add(2);
        list2.add(6);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        list2.add(5);
        list2.add(1);

        System.out.println(symmetricSetDifference(list,list2));
    }
    public static Set<Integer> symmetricSetDifference(Set<Integer> list, Set<Integer> list2)
    {
        Set<Integer> newList = new HashSet<>();
        newList.addAll(list);
        list.retainAll(list2);
        newList.addAll(list2);
        newList.removeAll(list);

        return newList;

    }
}


