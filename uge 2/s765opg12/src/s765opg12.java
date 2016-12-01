import java.util.*;

/**
 * Created by clint on 06-09-2016.
 */
public class s765opg12 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("hallo","bølle", "dame", "Hallo", "søren", "hallo", ));

        System.out.println(contains3(words));

    }

    public static boolean contains3(List<String> list)
    {
        boolean wordTimes3 = false;
        Iterator<String> i = list.iterator();
        Map<String, Integer> wordCount = new TreeMap<String, Integer>();

        while(i.hasNext())
        {
            String nextWord = i.next().toLowerCase();
            if(wordCount.containsKey(nextWord))
            {
                int count = wordCount.get(nextWord);
                if(count == 2)
                {
                    wordTimes3 = true;
                    break;
                }
                else
                {
                    wordCount.put(nextWord, count + 1);
                }
            }
            else
            {
                wordCount.put(nextWord, 1);
            }
        }
        return wordTimes3;
    }
}
