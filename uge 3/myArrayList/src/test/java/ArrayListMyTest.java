import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by clint on 15-09-2016.
 */
public class ArrayListMyTest {
    ArrayListMy<String> list;

    @Before
    public void setUp() throws Exception {
        list = new ArrayListMy<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        list.add("2");
        list.add("3");
    }

    @Test
    public void clear() throws Exception {
        list.clear();
        assertEquals(list.getCapacity(),10);
        assertEquals(list.get(0), null);
    }

    @Test
    public void add() throws Exception {
        int temp = list.size();
        list.add("2");
        int dif = list.size()-temp;
        assertEquals(dif,1);
        assertEquals(list.get(list.size()-1),"2");
    }

    @Test
    public void add1() throws Exception {
        int temp = list.size();
        list.add(3,"2");
        int dif = list.size()-temp;
        assertEquals(dif,1);
        assertEquals(list.get(3),"2");
    }

    @Test
    public void contains() throws Exception {
        assertEquals(list.contains("2"), true);
    }

    @Test
    public void reSize() throws Exception {
        int temp = list.getCapacity();
        list.reSize();
        assertEquals(temp*2,list.getCapacity());
    }

    @Test
    public void reSizeDown() throws Exception {
        System.out.println(list);
        list.reSizeDown();
        System.out.println(list);
    }

    @Test
    public void isEmpty() throws Exception {
        assertNotEquals(list.get(0), null);
    }

    @Test
    public void lastIndexOf() throws Exception {
        int temp = list.lastIndexOf("3");
        assertEquals(temp, 11);
    }

    @Test
    public void remove() throws Exception {
        int temp = list.size();
        String temp1 = list.get(4);
        list.remove(3);
        int dif = temp - list.size();
        assertEquals(dif,1);
        assertEquals(list.get(3), temp1);
    }

    @Test
    public void indexOf() throws Exception {
        assertEquals(list.indexOf("3"),2);
    }

    @Test
    public void removeO() throws Exception {
        list.removeO("3");
        assertEquals(list.contains("3"),false);
    }

    @Test
    public void get() throws Exception {
        list.add(0,"1");
        assertEquals(list.get(0),"1");
    }

    @Test
    public void size() throws Exception {
        int temp = list.size();
        list.add("9");
        assertEquals(temp,list.size()-1);
    }

    @Test
    public void getCapacity() throws Exception {
        assertEquals(list.getCapacity(), 20);
    }

    @Test
    public void set() throws Exception {
        list.set(3,"10");
        assertNotEquals(list.get(3), 10);
    }

   /* @Test
    public void toString() throws Exception {

    }*/

}