/**
 * Created by clint on 13-09-2016.
 */
public class ArrayListMy<T> {

    private T[] t;
    private int capacity;



 /*ok   +ArrayList()
 ok   +clear(): void
 ok   +contains(o: Object): boolean
 ok   +indexOf(o: Object): int
 ok   +isEmpty(): boolean
 ok   +lastIndexOf(o: Object): int
 ok   +remove(o: Object): boolean
 ok   +size(): int
 ok   +remove(index: int): boolean
 ok   +add(o: E): void
 ok   +add(index: int, o: E): void
 ok   +get(index:int): E
 ok   +set(index: int, o: E): E*/

    public ArrayListMy()
    {
        this.capacity = 10;
        t = (T[]) new Object[capacity];
    }

    public void clear()
    {
        // O(n) = 1
        this.capacity = 10;
        t = (T[]) new Object[capacity];
    }

    public void add(T object)
    {
        //O(n) = 3n    loop in size(), reSize() and add()   (O(n) = n^2 ) if .length includes a loop.
        // slow code, should have made a size field. not calling the size() in the loop
        // t.length is slow. it mide have a loop from java libary. should have used the field capacity.

        //include resize if list size is not big enough.
        if(size() >= this.capacity)
        {
            reSize();
        }
        for(int i = 0; i < t.length; i++)
        {
            if (this.t[i] == null) {
                this.t[i] = object;
                break;
            }
        }
    }

    public void add(int index, T object)
    {
        // O(n) = 2n + n^2  =  n^2
        // // slow code, should have made a size field. not calling the size() in the loop

        if(size() == capacity)
        {
            reSize();
        }
        for(int i = size()-1; i >= index; i--)
        {
            t[i+1] = t[i];
        }
        t[index] = object;
    }

    public boolean contains(T object)
    {
        // O(n) = n
        // t.length is slow. it mide have a loop from java libary. should have used the field capacity.
        for(int i = 0; i < t.length; i++)
        {
            if(t[i] == object)
            {
                return true;
            }
        }
        return false;
    }

    public void reSize()
    {
        // O(n) = n
        // t.length is slow. it mide have a loop from java libary. should have used the field capacity.
        this.capacity = 2 * this.capacity;
        T[] newList = (T[]) new Object[this.capacity];
        for(int i = 0; i < t.length; i++)
        {
            newList[i] = t[i];
        }
        this.t = newList;
    }

    public void reSizeDown()
    {
        // O(n) = n^4
        // slow code, should have made a size field. not calling the size().
        // t.length is slow. it mide have a loop from java libary. should have used the field capacity.

        int dif = t.length - size();

        T[] newList = (T[]) new Object[capacity];
        for(int i = 0; i < t.length; i++)
        {
            newList[i] = t[i];
        }
        this.t = newList;
    }

    public boolean isEmpty()
    {
        // O(n) = 1

        if(t[0] == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int lastIndexOf(T object)
    {
        //O(n) = n^2
        // slow code, should have made a size field. not calling the size() in the loop

        int index = 0;
        for(int i = size()-1; i >= 0; i--)
        {
            if(t[i] == object)
            {
                index = i;
                break;
            }
            else
            {
                index = -1;
            }
        }
        return index;
    }


    public void remove(int index)
    {
        // O(n) = n^2 + n + n + n = n^2
        // slow code, should have made a size field. not calling the size() in the loop
        // t.length is slow. it mide have a loop from java libary. should have used the field capacity.

        for(int i = index; i < size()-1; i++)
        {
            t[i] = t[i+1];
        }
        t[size()-1] = null;
        if(size() - t.length >= (t.length * 0.25))
        {
            reSizeDown();
        }
    }

    public int indexOf(T object)
    {
        //O(n) = n^2
        // slow code, should have made a size field. not calling the size() in the loop
        int index = 0;
        for(int i = 0; i < size(); i++)
        {
            if(t[i] == object)
            {
                index = i;
                break;
            }
        }
        return index;
    }


    public void removeO(T object)
    {
        //O(n) = n^2 + n + n + n^2 + n^2  = n^2 + n^2 + n^2
        // slow code, should have made a size field. not calling the size() in the loop

        for(int i = 0; i < size(); i++)
        {
            if(get(i) == object)
            {
                remove(i);
                i--;
            }
        }
    }

    ///////////////////////////getters////////////////////////////////////
    // O(n) = 1
    public T get(int index)
    {
        return t[index];
    }

    public int size()
    {
        // O(n) = n
        int i = 0;
        while(i < t.length)
        {
            // when an empty index is reacehed. break and return size.
            if(t[i] == (null))
            {
                break;
            }
            i++;
        }
        return i;
    }

    // O(n) = 1
    public int getCapacity()
    {
        return this.capacity;
    }

    ///////////////////////////Setters//////////////////////////////////////

    // O(n) = 1
    public void set(int index, T object)
    {
        t[index] = object;
    }


    ////////////////////////////////toString////////////////////////////////

    public String toString()
    {
        // O(n) = n

        String print = "";
        for(int i = 0; i < t.length; i++)
        {
            print += get(i);
        }
        return print;
    }
}
