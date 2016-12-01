/**
 * Created by clint on 27-09-2016.
 */
public interface StackInterface<T> {

    public void push(T value);

    public T pop();

    public boolean isEmpty();

    public T peek();

    public int size();

    public String toString();
}
