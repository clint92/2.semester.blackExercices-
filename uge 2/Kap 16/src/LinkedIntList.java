/**
 * Created by clint on 12-09-2016.
 */
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

class LinkedIntList {

    private ListNode front; // first value in the list

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;
    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: returns comma-separated, bracketed version of list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            //16.2 A Linked List Class 1005
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: returns the position of the first occurrence of the
    // given value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
            //Chapter 16 Linked Lists
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }


    /////////////////////////////// Opgave 1 ///////////////////////////////////////////

    public void set(int index, int value) {
        ListNode current = front;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = value;
    }


    /////////////////////////////////////Opgave 2/////////////////////////////

    public int max() {
        int result = 0;
        ListNode current = front;
        if (current.equals(null)) {
            throw new NoSuchElementException();
        } else {
            result = current.data;
            while (current != null) {
                if (current.data > result) {
                    result = current.data;
                }
                current = current.next;
            }
        }
        return result;
    }


    ///////////////////////////////////Opgave 3 ///////////////////////////////

    public boolean isSorted() {
        ListNode current = front;
        if (current.equals(null)) {
            return true;
        }
        while (current != null && current.next != null) {
            if (current.data > current.next.data) {
                return false;
            }
            current = current.next;
        }
        return true;
    }


    ////////////////////////////////////// Opgave 4 /////////////////////////////
    public int lastIndexOf(int value) {
        ListNode current = front;
        int index = 0;
        int indexFinal = -1;

        while (current != null) {
            if (current.data == value) {
                indexFinal = index;
            }
            index++;
            current = current.next;
        }
        return indexFinal;
    }


    ////////////////////////////////////// Opgave 5 //////////////////////////////
    public int countDublicates() {
        ListNode current = front;
        int dublicates = 0;

        while (current.next != null) {
            if (current.data == current.next.data) {
                dublicates++;
            }
            current = current.next;
        }

        return dublicates;
    }

    /////////////////////////////////// Opgave 6 /////////////////////////
    public boolean hasTwoConsicutive() {
        ListNode current = front;

        while (current.next != null) {
            if (current.data + 1 == current.next.data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    ///////////////////////////////// Opgave 7 ////////////////////////////////
    public int deleteBack() {
        ListNode current = front;
        int index = 0;
        int result = 0;
        if (current == null) {
            throw new NoSuchElementException();
        }
        while (current != null) {
            if (current.next == null) {
                result = current.data;
                remove(index);
                return result;
            }
            current = current.next;
            index++;
        }
        return result;
    }


    ///////////////////////////// Opgave 8 ///////////////////////////////////
    public void switchPairs() {
        ListNode current = front;

        if (current == null) {
            throw new NoSuchElementException();
        }
        while (current.next != null) {
            int temp;
            temp = current.data;
            current.data = current.next.data;
            current.next.data = temp;
            current = current.next.next;
        }
    }

    //////////////////////////////// Opgave 9 /////////////////////////////
    public void stutter() {
        ListNode current = front;
        ListNode temp;
        int index = 0;
        // temp = current;

        while (current != null) {
            add(index + 1, current.data);
            index += 2;
            current = current.next.next;
        }
    }

    //////////////////////////////// Opgave 10 //////////////////////////////
    public void stretch(int n) {
        ListNode current = front;
        ListNode temp;
        int index = 0;
        // temp = current;

        while (current != null) {
            for (int i = 1; i < n; i++) {
                add(index + i, current.data);
                current = current.next;
            }
            index += n;
            current = current.next;
        }
    }

    /////////////////////////////////////////// Opgave 11 //////////////////////////

    public void compress() {

        ListNode current = front;
        int index = 0;
        int temp = 0;

        while (current.next != null) {
            temp = current.data + current.next.data;
            System.out.println(temp);
            current.data = temp;
            remove(index + 1);
            index++;
            if (current.next != null) {
                current = current.next;
            }
        }
    }

    ///////////////////////////////// Opgave 12 /////////////////////////////////

    public void split() {
        ListNode current = front;
        ListNode privious = front;

        while (current != null) {

            if (current.data < 0) {
                privious.next = current.next;
                current.next = front;
                front = current;
                current = privious;
            }
            privious = current;
            current = current.next;
        }
    }

    /////////////////////////////////// Opgave 13 ///////////////////////////////

    public void transferFrom(LinkedIntList list) {
        int size = size();
        ListNode currentList = list.front;
        nodeAt(size - 1).next = currentList;
        list.front = null;

    }

    ///////////////////////////////// Opgave 14 /////////////////////////////////

    public void removeAll(int value) {
        ListNode current = front;
        ListNode privious = front;

        while (current != null) {
            if (current.data == value) {
                privious.next = current.next;
                current = privious;
            }
            privious = current;
            current = current.next;
        }
    }

    ////////////////////////////////// Opgave 15 ////////////////////////////
    public boolean notEquals(LinkedIntList list) {
        ListNode current = front;
        ListNode currentList = list.front;
        if (size() != list.size()) {
            return false;
        }
        while (current != null) {
            if (current.data != currentList.data) {
                return false;
            }
            current = current.next;
            currentList = currentList.next;
        }
        return true;
    }

    /////////////////////////// Opgave 16 //////////////////////////

    public LinkedIntList removeEvens() {
        LinkedIntList newList = new LinkedIntList();
        ListNode current = front;
        ListNode privious = front;
        ListNode currentNewList = newList.front;
        while (current != null) {
            if (current.data % 2 == 0) {
                if (newList.front == null) {
                    newList.front = current;
                } else {
                    newList.front.next = privious.next;
                    privious.next = current.next;
                    //currentNewList = currentNewList.next;
                    current = privious;
                }

            }
            privious = current;
            current = current.next;
        }
        return newList;
    }

    //////////////////////////// Opgave 17 //////////////////////////////////

    public void removeRange(int start, int end) {
        ListNode nodeStart = front;
        ListNode nodeEnd = front;
        int counter = 0;
        if (start < 0 || end < 0) {
            throw new IllegalArgumentException();
        } else {
            while (nodeEnd.next != null && end != counter) {
                if (counter == start - 1) {
                    nodeStart = nodeEnd;
                }
                nodeEnd = nodeEnd.next;
                counter++;
            }
            if (start == 0) {
                front = nodeEnd.next;
            } else {
                nodeStart.next = nodeEnd.next;
            }
        }
    }

    //////////////////////////////// Opgave 18 /////////////////////////////
    public void doubleList()
    {
        LinkedIntList temp = new LinkedIntList();
        ListNode current = front;
        temp.front = new ListNode(current.data);
        ListNode tempN = temp.front;

        while(current.next != null)
        {
            tempN.next = new ListNode(current.next.data);
            current = current.next;
            tempN = tempN.next;
        }
        current.next = temp.front;
    }

    //////////////////////////////// Opgave 19 //////////////////////////////////

}