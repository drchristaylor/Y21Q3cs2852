package wk1;

import java.util.Iterator;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<String> phrases = new ArrayList<>();
        phrases.add("Horses can't swim very well");
        phrases.add("Seahorses can't swim very well");
        phrases.add(1, "Seamonkeys can swim very well");
        {
            Iterator<String> iter = phrases.iterator();
            while (iter.hasNext()) {
                String phrase = iter.next();
                System.out.println(phrase);
            }
        }
        for(String phrase : phrases) {
            System.out.println(phrase);
        }
    }
}
