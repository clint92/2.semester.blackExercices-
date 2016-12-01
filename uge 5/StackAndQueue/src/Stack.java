import java.util.Arrays;

/**
 * Created by clint on 27-09-2016.
 */
public class Stack<T> implements StackInterface<T> {

    T[] array;
    int capacity = 0;
    int size = 0;

    public Stack()
    {
        capacity = 10;
        array = (T[]) new Object [10];
    }

    public void push(T value)
    {
        if(this.size == capacity)
        {
            capacity = capacity * 2;
          array = Arrays.copyOf(array, capacity);
        }
        array[size] = value;
        size++;
    }

    public T pop()
    {
        T temp = array[size-1];
        array[size] = null;
        size--;

        if(size == capacity/2)
        {
            capacity = capacity / 2;
            array = Arrays.copyOf(array,capacity);
        }

        return temp;
    }

    public boolean isEmpty()
    {

        return size <= 0;
    }

    public T peek()
    {
        return array[size-1];
    }

    public int size()
    {
        return this.size;
    }

    public String toString()
    {
        String result = "";
        for(int i = 0; i < size; i++)
        {
            result += array[i] + " ";
        }
        return result;
    }
}
