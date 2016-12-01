import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by clint on 27-09-2016.
 */
public class StackTest {
    Stack<Integer> s = new Stack<Integer>();

    @Before
    public void setUp() throws Exception {

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(11);
    }

    @Test
    public void push() throws Exception {
        int temp = s.size();
        s.push(12);
        int last = s.peek();
        assertEquals(temp + 1,s.size());
        assertEquals(last,12);
    }


    @Test
    public void pop() throws Exception {
        s.push(1);
        int temp = s.size();
        int removedValue = s.pop();
        assertEquals(temp-1,s.size());
        assertEquals(removedValue,1);

    }

    @Test
    public void isEmpty() throws Exception {
        Stack<Integer> s1 = new Stack<>();
        assertEquals(s1.isEmpty(),true);
    }

    @Test
    public void peek() throws Exception {
        s.push(1);
        int peekValue = s.peek();
        assertEquals(peekValue,1);
    }

    @Test
    public void size() throws Exception {
        int s1 = s.size();
        s.push(2);
        assertEquals(s1+1,s.size());
    }

}