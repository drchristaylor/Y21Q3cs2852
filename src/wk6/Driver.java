package wk6;

public class Driver {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        System.out.println(bst.height());
        bst.add(73);
        System.out.println(bst.height());
        bst.add(32);
        System.out.println(bst.height());
        bst.add(82);
        System.out.println(bst.height());
        bst.add(7);
        System.out.println(bst.height());
        bst.add(77);
        System.out.println(bst.height());
        System.out.println(bst.contains(68));
        System.out.println(bst.contains(82));
    }
}
