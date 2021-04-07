package wk5;

public class Driver {

    public static void main(String[] args) {
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
