import java.util.LinkedList;
import java.util.List;

/**
 * Created by clint on 12-10-2016.
 */
public class QueueIterator<T> implements QueueInterface<T>, Container {
    List<T> list;
    int size = 0;

    @Override
    public Iterator getIterator() {
        return new QueueIterator.MyIterator();
    }

    private class MyIterator implements Iterator
    {

        int index = 0;
        @Override
        public boolean hasNext() {
            if(index < size) {
                return true;
            }
            else
            {
                return false;
            }
        }

        @Override
        public Object next() {
            if(hasNext() == true)
            {
                return list.get(index++);
            }
            else
            {
                return null;
            }
        }
    }

    public QueueIterator()
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
