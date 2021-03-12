package wk1;

import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList<E> implements Iterable<E>, Collection<E>, List<E>, RandomAccess {

    private Object[] list;

    public ArrayList() {
        list = new Object[0];
    }

    @Override
    public boolean add(E element) {
        Object[] temp = new Object[list.length+1];
        for(int i=0; i<list.length; i++) {
            temp[i] = list[i];
        }
        temp[temp.length-1] = element;
        list = temp;
        return true;
    }

    @Override
    public void add(int index, E element) {
        if(index<0 || index>size()) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size());
        }
        Object[] temp = new Object[list.length+1];
        for(int i=0; i<index; i++) {
            temp[i] = list[i];
        }
        temp[index] = element;
        for(int i=index+1; i<temp.length; i++) {
            temp[i] = list[i-1];
        }
        list = temp;
    }

    @Override
    public void clear() {
        list = new Object[0];
    }

    @Override
    public boolean contains(Object target) {
        return indexOf(target)>=0;
    }

    @Override
    public E get(int index) {
        if(index<0 || index>=size()) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size());
        }
        return (E)list[index];
    }

    @Override
    public int indexOf(Object target) {
        int index = 0;
        boolean found = false;
        while(index<size() && !found){
            found = (target==null ? get(index++)==null : target.equals(get(index++)));
        }
        return found ? index-1 : -1;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object target) {
        int index = indexOf(target);
        if(index!=-1) {
            remove(indexOf(target));
        }
        return index!=-1;
    }

    @Override
    public E set(int index, E element) {
        if(index<0 || index>=size()) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size());
        }
        E oldValue = (E)list[index];
        list[index] = element;
        return oldValue;
    }

    @Override
    public int size() {
        return list.length;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
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
