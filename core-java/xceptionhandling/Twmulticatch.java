package xceptionhandling;

public class Twmulticatch {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        String str = null;
        int[] arr = {1, 2, 3};

        try {
            // Example 1: ArithmeticException
            j = 18/i; // Division by zero

            // Example 2: ArrayIndexOutOfBoundsException
            System.out.println(arr[5]); // Invalid index

            // Example 3: NullPointerException
            System.out.println(str.length());

        } 
        // Multiple catch blocks - order matters (more specific first)
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } 
        catch (NullPointerException e) {
            System.out.println("Null pointer error: " + e.getMessage());
        } 
        catch (Exception e) { 
            // General exception handler
            System.out.println("General error: " + e.getMessage());
        }
        System.out.println(j);

        System.out.println("Program continues after handling exceptions.");
    }
}


