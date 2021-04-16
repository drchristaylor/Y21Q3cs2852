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
        boolean added = false;
        if(root==null) {
            root = new Node<>(element);
            added = true;
        } else {
            added = add(root, element);
        }
        return added;
    }

    public boolean add(Node<E> subroot, E element) {
        boolean added = false;
        int bigness = element.compareTo(subroot.value);
        if(bigness!=0) {
            if(bigness<0) {
                if(subroot.leftKid!=null) {
                    added = add(subroot.leftKid, element);
                } else {
                    subroot.leftKid = new Node(element);
                    added = true;
                }
            } else {
                if(subroot.rightKid!=null) {
                    added = add(subroot.rightKid, element);
                } else {
                    subroot.rightKid = new Node(element);
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












