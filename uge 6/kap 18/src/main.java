/**
 * Created by clint on 06-10-2016.
 */
public class main {

    public static void main(String[] args) {


        HashIntSet set1 = new HashIntSet();
        //set1.add(-5);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        HashIntSet set2 = new HashIntSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(6);
        //set2.add(44);
        //set2.add(79);

        /////////////////////////////////opgave 1 //////////////////////////
        /*set1.addAll(set2);
        System.out.println(set1);*/


        ///////////////////////////////opgave 2 ///////////////////////////////
        //System.out.println(set1.containsAll(set2));


        ///////////////////////////////opgave 3 ////////////////////////////////
        //System.out.println(set1.equals(set2));

        ///////////////////////////////opgave 4 ///////////////////////////////
        /*set1.removeAll(set2);
        System.out.println(set1);*/

        ///////////////////////////////opgave 5 ///////////////////////////////
        /*set1.retainAll(set2);
        System.out.print(set1);*/

        ///////////////////////////////opgave 6 /////////////////////////////////
        /*int array[] = set1.toArray();
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }*/

        ///////////////////////////////opgave 7 ///////////////////////////////

        System.out.println(set1);

    }

}
