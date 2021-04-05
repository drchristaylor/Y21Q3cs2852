package wk5;

public class CircularQueue<E> {

    private E[] data;
    private int front;
    private int back;
    private boolean isFull;

    public CircularQueue(int capacity) {
        data = (E[])new Object[capacity];
        front = 0;
        back = capacity-1;
        isFull = capacity<=0;
    }

    public boolean offer(E element) {
        boolean changed = !isFull;
        if(changed) {
            back = (back + 1) % data.length;
            data[back] = element;
            isFull = (back+1)%data.length==front;
        }
        return changed;
    }

    public E poll() {
        E retVal = null;
        if(!isEmpty()) {
            retVal = data[front];
            data[front] = null;
            front = (front+1)%data.length;
            isFull = false;
        }
        return retVal;
    }

    public E peek() {
        return isEmpty() ? null : data[front];
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return size()==0;
    }
}
