/**
 * Created by clint on 30-08-2016.
 */
package first;

import java.util.*;
public class opg2 {

    public static void main(String[] args){
        List<Integer> listA = new ArrayList<Integer>();
        List<Integer> listB = new ArrayList<Integer>();
        listA.add(1);
        listA.add(2);
        listB.add(3);
        listB.add(4);
        listB.add(5);
        System.out.println(alternate(listA,listB));


    }

     public static List<Integer> alternate(List<Integer> list1, List<Integer> list2)
     {

         List<Integer> kort = new ArrayList<Integer>();
         List<Integer> lang = new ArrayList<Integer>();
         if(list1.size() < list2.size())
         {
             kort = list1;
             lang = list2;
         }
         else
         {
             kort = list2;
             lang = list1;
         }

         List<Integer> newList = new ArrayList<Integer>();

         int i = 0;
         while( i < kort.size())
         {
             newList.add(list1.get(i));
             newList.add(list2.get(i));
             i++;
         }
         while(i < lang.size())
         {
             newList.add(lang.get(i));
             i++;
         }
         System.out.println(i);
         return newList;
     }
}
