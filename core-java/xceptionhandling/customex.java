package xceptionhandling;

//Creation of custom exception
//todo If i want to print my name exception
//? We can see error because all Exceptions (Arithmetic, Null, Arrayoutofbound) belongs to super class Exception so to solve this error we will use extends
//! No exception of type HarshitException can be thrown; an exception type must be a subclass of ThrowableJava
class HarshitException extends Exception {

    public HarshitException(String s) {
        //! to print message which we are passing in constructor below we need to call super class and as we know that HarshitException is belongs to super class Exception so we just call the message in super class
        super(s);

    }
}

public class customex {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            // Example 1: ArithmeticException
            j = 18 / i;
            // Division by zero
            if (j == 0) //! if i want to print message with exception i can use e.getMessage() in print or i can pass the message in the constructor whatever i want to print
            {
                throw new HarshitException("I don't want to print zero");
            }
        } catch (HarshitException e) {
            //? Using throw i can handle exception by printing default value instead of 0 
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
