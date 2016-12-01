/**
 * Created by clint on 27-09-2016.
 */
public class Main {

    public static void main(String[] args) {


        /////////////////////////////////////////STACK /////////////////////////////
        Stack<Integer> s = new Stack<Integer>();
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
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);


       // s.push(10);


        ///////////////////////////////////// QUEUE ///////////////////////////////////////

        /*Queue<Integer> q = new Queue<>();
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
        System.out.println(q);

        System.out.println(q.size());
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.print(q.isEmpty());
        */
    }
}
