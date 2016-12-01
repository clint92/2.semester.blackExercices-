import org.junit.Assert;

import static junit.framework.Assert.*;

/**
 * Created by clint on 27-09-2016.
 */
public class QueueTest {
    Queue<Integer> q = new Queue<>();

    @org.junit.Before
    public void setUp() throws Exception {
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        q.add(11);
    }

    @org.junit.Test
    public void add() throws Exception {
        int temp = q.size();
        int temp2 = q.peek();
        q.add(5);
        int temp3 = q.peek();
        assertEquals(q.size()-temp,1);
        assertEquals(temp2, temp3);
    }

    @org.junit.Test
    public void remove() throws Exception {
        int temp = q.peek();
        int tempSize = q.size();
        int temp2 = q.remove();
        assertEquals(tempSize-q.size(),1);
        assertEquals(temp,temp2);

    }

    @org.junit.Test
    public void isEmpty() throws Exception {
        Queue<Integer> q2 = new Queue<>();
        assertEquals(q2.isEmpty(),true);
    }

    @org.junit.Test
    public void peek() throws Exception {
        int temp = q.peek();
        int temp2 = q.remove();
        assertEquals(temp,temp2);
    }

    @org.junit.Test
    public void size() throws Exception {
        int tempSize = q.size();
        q.add(1);
        assertEquals(q.size()-tempSize,1);
    }

}