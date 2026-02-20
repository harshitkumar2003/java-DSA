package xceptionhandling;

public class throwkey {

    public static void main(String[] args) {
        //! If i is greater than denominator it will result 0 but i want to handle the exception without printing 0
        int i = 20;
        int j = 0;

        try {
            // Example 1: ArithmeticException
            j = 18 / i;
            // Division by zero
            if (j == 0) //! if i want to print message with exception i can use e.getMessage() in print or i can pass the message in the constructor whatever i want to print
            {
                throw new ArithmeticException("I don't want to print zero");
            }
        } catch (ArithmeticException e) {
            //? Using throw i can handle exception by printing default value what i want to print instead of 0 
            j = 18 / 1;
            // System.out.println("Arithmetic error: " +  e.getMessage());
            System.out.println("Arithmetic error: " + e);
        } catch (Exception e) {
            // General exception handler
            System.out.println("General error: " + e);
        }

        System.out.println(j);

        System.out.println("Program continues after handling exceptions.");
    }
}
