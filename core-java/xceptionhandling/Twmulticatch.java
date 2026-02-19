package xceptionhandling;

public class Twmulticatch {
    public static void main(String[] args) {
        try {
            // Example 1: ArithmeticException
            int result = 10 / 0; // Division by zero

            // Example 2: ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Invalid index

            // Example 3: NullPointerException
            String str = null;
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

        System.out.println("Program continues after handling exceptions.");
    }
}


