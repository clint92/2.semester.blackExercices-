import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by clint on 06-09-2016.
 */
public class s765opg13 {

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("martin", "rasmussen");
        names.put("trine", "geller");
        names.put("line", "else");
        names.put("futte", "jensen");
        names.put("jens", "geller");

        System.out.println(isUnique(names));
    }

    public static boolean isUnique(Map<String, String> list)
    {
        Set<String> lastNames = new HashSet<String>(list.values());
        if(lastNames.size() == list.size())
        {
            return true;
        }
        return false;
    }
}
