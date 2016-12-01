/**
 * Created by clint on 27-09-2016.
 */
public interface QueueInterface<T> {

    public void add(T value);

    public T remove();

    public  boolean isEmpty();

    public T peek();

    public int size();

}
