import javax.xml.soap.Node;
import java.util.Comparator;

/**
 * Created by clint on 25-10-2016.
 */
import java.util.Comparator;
public class IntComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
