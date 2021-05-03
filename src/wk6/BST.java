package wk6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class BST<E extends Comparable<? super E>> implements Set<E> {
    private Node<E> root;

    private static class Node<E> {
        E value;
        Node<E> leftKid;
        Node<E> rightKid;
        Node<E> parent;

        Node(E value) {
            this(value, null, null, null);
        }

        Node(E value, Node<E> parent) {
            this(value, parent, null, null);
        }

        Node(E value, Node<E> parent, Node<E> left, Node<E> right) {
            this.value = value;
            this.parent = parent;
            leftKid = left;
            rightKid = right;
        }
    }

    public BST() {
        root = null;
    }

    private Node<E> rightRotate(Node<E> C) {
        Node<E> B = C.leftKid;
        Node<E> y = B.rightKid;
        Node<E> P = C.parent;
        C.leftKid = y;
        if(y!=null) {
            y.parent = C;
        }
        C.parent = B;
        B.rightKid = C;
        B.parent = P;
        if(P!=null) {
            if(P.rightKid==C) {
                P.rightKid = B;
            } else {
                P.leftKid = B;
            }
        }
        return B;
    }

    public boolean isEmpty() {
        return null==root;
    }

    public boolean contains(Object target) {
        boolean compatible = this.getClass().isAssignableFrom(target.getClass());
        return compatible && contains(root, (E)target);
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    private boolean contains(Node<E> subroot, E target) {
        boolean found;
        if(subroot==null || target.compareTo(subroot.value)==0) {
            found = subroot!=null;
        } else {
            if(target.compareTo(subroot.value)<0) {
                found = contains(subroot.leftKid, target);
            } else {
                found = contains(subroot.rightKid, target);
            }
        }
        return found;
    }

    public boolean add(E element) {
        boolean added;
        if(root==null) {
            root = new Node<>(element);
            added = true;
        } else {
            added = add(root, element);
        }
        return added;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return c.stream().allMatch(this::contains);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        root = null;
    }

    public boolean add(Node<E> subroot, E element) {
        boolean added = false;
        int bigness = element.compareTo(subroot.value);
        if(bigness!=0) {
            if(bigness<0) {
                if(subroot.leftKid!=null) {
                    added = add(subroot.leftKid, element);
                } else {
                    subroot.leftKid = new Node<>(element);
                    added = true;
                }
            } else {
                if(subroot.rightKid!=null) {
                    added = add(subroot.rightKid, element);
                } else {
                    subroot.rightKid = new Node<>(element);
                    added = true;
                }
            }

        }
        return added;
    }

    public int height() {
        return height(root);
    }

    private int height(Node<E> subroot) {
        return subroot==null ? 0 : 1 + Math.max(height(subroot.leftKid), height(subroot.rightKid));
    }

    public int size() {
        return 0;
    }

    private int size(Node<E> subroot) {
        return subroot==null ? 0 : 1 + size(subroot.leftKid) + size(subroot.rightKid);
    }

    @Override
    public String toString() {
        return "[" + inorder(root) + "]";
    }

    private String inorder(Node<E> subroot) {
        return subroot==null ? "" : inorder(subroot.leftKid) + " " + subroot.value.toString()
                + " " + inorder(subroot.rightKid);
    }
}












