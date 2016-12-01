import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by clint on 05-09-2016.
 */
public class s765opg10 {

    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("hallo");
        list.add("bøllen");
        list.add("fylde");
        list.add("b");
        list.add("trip");
        removeOddLength(list);
        System.out.println(list);
    }

    public static void removeOddLength(Set<String> list)
    {
        Iterator<String> i = list.iterator();
        while(i.hasNext())
        {
            String word = i.next();
            if(word.length() % 2 != 0)
            {
                i.remove();
            }
        }
    }
}
