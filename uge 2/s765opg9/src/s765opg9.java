import jdk.internal.dynalink.beans.StaticClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by clint on 05-09-2016.
 */
public class s765opg9
{
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(1);
        System.out.println(hasEven(list));
    }

    public static boolean hasEven(Set<Integer> list)
    {
        boolean what = false;
        Iterator<Integer> i = list.iterator();
        while(i.hasNext())
        {
            if(i.next() % 2 == 0)
            {
                what = true;
            }
        }
        return what;
    }
}
