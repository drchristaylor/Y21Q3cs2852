package wk3;

public interface PureInterface<E> {
    E pop();
    E peek();
    void push(E value);
    boolean isEmpty();
    int size();
}
