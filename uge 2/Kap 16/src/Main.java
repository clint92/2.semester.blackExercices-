import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedList;
/*

/* Created by clint on 12-09-2016.
 */
public class Main {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(-7);
        LinkedIntList list2 = new LinkedIntList();
        list2.add(1);
        list2.add(2);
        list2.add(2);
        System.out.println(list);
        System.out.println(list2);


        //////////////////////////////opgave 1////////////////////////////
        /*list.set(2,1);
        System.out.println(list);*/


        ////////////////////////////////Opgave 2 ////////////////////////////////////
        //System.out.println(list.max());


        /////////////////////////////////Opgave 3/////////////////////////////////
        //System.out.println(list.isSorted());


        ////////////////////////////////Opgave 4 ///////////////////////////////////
        // System.out.println(list.lastIndexOf(7));

        /////////////////////////////// Opgave 5 //////////////////////////////////
        //System.out.println(list.countDublicates());

        ////////////////////////////// Opgave 6 /////////////////////////////////
        //System.out.println(list.hasTwoConsicutive());

        ///////////////////////////// Opgave 7 ///////////////////////////////////
        /*System.out.println(list.deleteBack());
        System.out.println(list);*/

        //////////////////////////////Opgave 8 ////////////////////////////
        /*list.switchPairs();
        System.out.println(list);*/

        ////////////////////////////// Opgave 9 //////////////////////////
        /*list.stutter();
        System.out.println(list);*/

        /////////////////////////////// Opgave 10 //////////////////////////
       /* list.stretch(3);
        System.out.println(list);*/

        //////////////////////////////Opgave 11 ///////////////////////////
        /*list.compress();
        System.out.println(list);*/

        ////////////////////////////// Opgave 12 ////////////////////////
        /*list.split();
        System.out.println(list);*/

        ///////////////////////////////opgave 13 ///////////////////////
        /*list.transferFrom(list2);
        System.out.println(list);
        System.out.println(list2);*/

        ////////////////////////////// Opgave 14 /////////////////////////
       /* list.removeAll(3);
        System.out.println(list);*/

        ///////////////////////////// Opgave 15 /////////////////////////////
       // System.out.println(list.notEquals(list2));

        ///////////////////////////// Opgave 16 ////////////////////////////
        //Virker ikke
        /*list2 = list.removeEvens();
        System.out.println(list);
        System.out.println(list2);*/

        ////////////////////////////// Opgave 17 ////////////////////////////
        /*list.removeRange(1,3);
        System.out.println(list);*/

        ///////////////////////////// Opgave 18 ////////////////////////////
        list.doubleList();
        System.out.println(list);
    }
}