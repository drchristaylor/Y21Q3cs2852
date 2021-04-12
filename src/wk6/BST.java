package wk6;

public class BST<E extends Comparable> {
    private Node<E> root;

    private static class Node<E> {
        E value;
        Node leftKid;
        Node rightKid;

        Node(E value) {
            this(value, null, null);
        }

        Node(E value, Node<E> left, Node<E> right) {
            this.value = value;
            leftKid = left;
            rightKid = right;
        }
    }

    public BST() {
        root = null;
    }

    public boolean isEmpty() {
        return null==root;
    }

    public boolean contains(E target) {
        return contains(root, target);
    }

    public boolean contains(Node<E> subroot, E target) {
        boolean found = false;
        if(subroot==null || target.compareTo(subroot.value)==0) {
            found = subroot!=null;
        } else {

        }
        return found;
    }
}












