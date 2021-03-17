package wk2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {
    private class Node {
        E value;
        Node next;

        Node(E value) {
            this(value, null);
        }

        Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    @Override
    public boolean add(E element) {
        if(isEmpty()) {
            head = new Node(element);
        } else {
            Node walker = head;
            while (walker.next != null) {
                walker = walker.next;
            }
            walker.next = new Node(element);
        }
        return true;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean contains(Object target) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object target) {
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object target) {
        return false;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int size() {
        int size = 0;
        Node walker = head;
        while(walker!=null) {
            ++size;
            walker = walker.next;
        }
        return size;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    /* -------------------------------------------------------------- */

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Too lazy");
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Too lazy");
    }
}