package wk3;

import wk1.ArrayList;
import wk2.LinkedList;

import java.util.List;

public class Stack<E> implements PureInterface<E> {
    private List<E> data = new LinkedList<>();

    @Override
    public E pop() {
        return data.remove(0);
    }

    @Override
    public E peek() {
        return data.get(0);
    }

    @Override
    public void push(E value) {
        data.add(0, value);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }
}
