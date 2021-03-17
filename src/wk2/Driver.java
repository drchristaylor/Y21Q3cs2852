package wk2;

import wk1.ArrayList;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<String> phrases = new LinkedList<>();
        phrases.add("Horses can't swim very well");
        phrases.add("Seahorses can't swim very well");
        phrases.add(1, "Seamonkeys can swim very well");
        System.out.println(phrases.size());
    }
}
