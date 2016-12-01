/**
 * Created by clint on 12-10-2016.
 */
public class Main {
    public static void main(String[] args) {
        StackIterator s = new StackIterator();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        Iterator i = s.getIterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }


        QueueIterator q = new QueueIterator();
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        Iterator j = q.getIterator();
        while(j.hasNext())
        {
            System.out.println(j.next());
        }
    }
}
