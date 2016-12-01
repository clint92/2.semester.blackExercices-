import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by clint on 05-09-2016.
 */
public class s765opg8 {

    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("hey");
        list.add("hallo");
        list.add("bananer");
        list.add("ul");
        list.add("skefe");
        list.add("ul");
        System.out.println(minLength(list));
    }

    public static int minLength(Set<String> list)
    {

        int amount;
        String word;
        Iterator<String> list1 = list.iterator();

        if(!list.equals(null))
        {
            word = list1.next();
            while (list1.hasNext())
            {
                String compare = list1.next();
                if(compare.length() < word.length())
                {
                    word = compare;
                }
            }
            amount = word.length();
        }
        else
        {
            amount = 0;
        }

        return amount;
    }
}
