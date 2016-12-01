/**
 * Created by clint on 30-08-2016.
 */
import java.util.*;

public class s764opg3 {

    public static void main(String[] args) {
        LinkedList<Integer> listA = new LinkedList<Integer>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);
        listA.add(6);
        listA.add(7);
        listA.add(8);
        listA.add(9);
        listA.add(10);
        listA.add(11);
        listA.add(12);

        removeEvenInRange(listA, 6, 11);
        System.out.println(listA);
    }

    public static void removeEvenInRange(LinkedList<Integer> list, int start, int end) {

        Iterator<Integer> i = list.iterator();
        int j = 0;
        while (i.hasNext()) {
            if (i.next() % 2 == 0 && j >= start && j < end -1 ){
                i.remove();
            }
            j++;
        }
    }
}