package wk7;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Command line arguments (" + args.length + "):");
        for(String arg : args) {
            System.out.println(arg);
        }
    }
}
