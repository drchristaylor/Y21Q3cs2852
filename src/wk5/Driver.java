package wk5;

public class Driver {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(contains(data, 3));

    }

    private static boolean contains(int[] data, int target) {
        return contains(data, target, 0, data.length);
    }

    private static boolean contains(int[] data, int target, int start, int end) {
        int midway = (end+start)/2;
        boolean found = (data[midway]==target);
        if(!found && start+1<end) {
            if(target<data[midway]) {
                found = contains(data, target, start, midway);
            } else {
                found = contains(data, target, midway+1, end);
            }
        }
        return found;
    }


    public static void main2(String[] args) {
        System.out.println(factorial(30));
    }

    public static int factorial(int n) {
        // Base case: if n is 1, we can return the answer directly
        if (n == 1) return 1;

        // Recursion: otherwise make a recursive call with n-1
        // (towards the base case), i.e. call factorial(n-1).
        // Assume the recursive call works correctly, and fix up
        // what it returns to make our result.
        return n * factorial(n-1);
    }
}
