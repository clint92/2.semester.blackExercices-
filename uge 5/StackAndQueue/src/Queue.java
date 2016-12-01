import java.util.LinkedList;
import java.util.List;

/**
 * Created by clint on 27-09-2016.
 */
public class Queue<T> implements QueueInterface<T> {
    List<T> list;
    int size = 0;

    public Queue()
    {
        list = new LinkedList();
    }

    public void add(T value)
    {
        list.add(value);
        size++;
    }

    public T remove()
    {
        T temp = list.get(0);
        list.remove(0);
        size--;
        return temp;
    }

    public  boolean isEmpty()
    {
        return size <= 0;
    }

    public T peek()
    {
        return list.get(0);
    }

    public int size()
    {
        return size;
    }

    public String toString()
    {
        String result = "";
        for(int i = 0; i < size; i++)
        {
            result += list.get(i) + " ";
        }
        return result;
    }

}
