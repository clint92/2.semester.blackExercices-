import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by clint on 25-10-2016.
 */
public class SAndS {
    public static void main(String[] args) {
       /* Integer[] a = {5,63,4,2,1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));*/

        /*Integer[] b = {8,1,5,9,2};
        bubbleSort(b, new IntComparator());
        System.out.println(Arrays.toString(b));*/

        /*Integer[] c = {8,1,5,9,2,6,4,3,9,78};
        mergeSort(c);
        System.out.println(Arrays.toString(c));*/

       /* Integer[] d = {8,1,5,9,2,6,4,3,9,78};
        mergeSort(d, new IntComparator());
        System.out.println(Arrays.toString(d));*/

        /*Integer[] e = {8, 1, 5, 9, 2, 6, 4, 3, 9, 78};
        quickSort(e);
        System.out.println(Arrays.toString(e));*/

        Integer[] e = {1, 5, 9, 2, 6, 4, 3, 9, 78};
        quickSort(e, new IntComparator());
        System.out.println(Arrays.toString(e));
    }


    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        int n = list.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list[j - 1].compareTo(list[j]) > 0) {
                    //swap elements
                    E temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }

            }
        }
    }

    public static <E> void bubbleSort(E[] list, Comparator<? super E> Comparator) {
        int n = list.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (Comparator.compare(list[j - 1], (list[j])) > 0) {
                    //swap elements
                    E temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }

            }
        }
    }

    public static <E extends Comparable<E>> void mergeSort(E[] list) {
        if (list.length > 1) {
            E[] a1 = Arrays.copyOfRange(list, 0, list.length / 2);
            E[] a2 = Arrays.copyOfRange(list, list.length / 2, list.length);

            mergeSort(a1);
            mergeSort(a2);

            int i1 = 0; // for a1
            int i2 = 0; // for a2

            for (int i = 0; i < list.length; i++) {
                if (i2 >= a2.length || (i1 < a1.length && a1[i1].compareTo(a2[i2]) <= 0)) {
                    list[i] = a1[i1];
                    i1++;
                } else {
                    list[i] = a2[i2];
                    i2++;
                }
            }
        }


    }

    public static <E> void mergeSort(E[] list, Comparator<? super E> Comparator) {
        if (list.length > 1) {
            E[] a1 = Arrays.copyOfRange(list, 0, list.length / 2);
            E[] a2 = Arrays.copyOfRange(list, list.length / 2, list.length);

            mergeSort(a1, Comparator);
            mergeSort(a2, Comparator);

            int i1 = 0; // for a1
            int i2 = 0; // for a2

            for (int i = 0; i < list.length; i++) {
                if (i2 >= a2.length || (i1 < a1.length && Comparator.compare(a1[i1], (a2[i2])) <= 0)) {
                    list[i] = a1[i1];
                    i1++;
                } else {
                    list[i] = a2[i2];
                    i2++;
                }
            }
        }
    }

    public static <E extends Comparable<E>> void quickSort(E[] list) {

        sort(list, 0, list.length - 1);
    }

    private static <E extends Comparable<E>> void sort(E[] list, int low, int high) {

        if (list == null || list.length == 0)
            return;

        if (low >= high)
            return;


        // pick the pivot

        ////////////////////////////////////////////////// Opgave 23.4.
        // change pivot to:
        //int middle = low + (high - low) / 2;
        //E pivot = list[int middle];

        int start = low;
        E pivot = list[start];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (list[i].compareTo(pivot) < 0) {
                i++;
            }

            while (list[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                E temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            sort(list, low, j);

        if (high > i)
            sort(list, i, high);
    }



    public static <E> void quickSort(E[] list, Comparator<? super E> Comparator)
    {
        sort2(list,0,list.length-1,Comparator);
    }
    private static <E> void sort2(E[] list, int low, int high, Comparator<? super E> comparator) {

        if (list == null || list.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot

        // Opgave 23.4.
        // change pivot to:
        //int middle = low + (high - low) / 2;
        //E pivot = list[int middle];

        int start = low;
        E pivot = list[low];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (comparator.compare(list[i], (pivot)) > 0) {
                i++;
            }

            while (comparator.compare(list[j],pivot) > 0) {
                j--;
            }

            if (i <= j) {
                E temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            sort2(list, low, j, comparator );

        if (high > i)
            sort2(list, i, high, comparator);
    }



}

