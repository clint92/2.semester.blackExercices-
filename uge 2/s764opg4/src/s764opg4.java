/**
 * Created by clint on 02-09-2016.
 */
import sun.java2d.loops.SurfaceType;

import java.util.*;
public class s764opg4 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(21);
        numbers.add(3);
        numbers.add(4);
        numbers.add(8);
        numbers.add(7);
        numbers.add(9);
        numbers.add(20);
        numbers.add(19);

        System.out.println(partition(numbers,5));
    }

    public static List<Integer> partition(List<Integer> input, Integer E )
    {
        Iterator<Integer> i = input.iterator();
        List<Integer> newList = new ArrayList<Integer>();
        while(i.hasNext())
        {
            int element = i.next();
            if(element > E)
            {
                newList.add(element);
                i.remove();
            }
        }

        input.addAll(newList);
        return  input;
    }
}
