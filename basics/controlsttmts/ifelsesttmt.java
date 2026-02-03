//! if-else -> it executes one block of code if the condition is true and another block of code if the condition is false

package controlsttmts;


public class ifelsesttmt {
    public static void main(String[] args) {
         int Num = 4;
         
        //! if
        if (Num > 2) {
          System.out.println("Hello");
        } 

        //! if-else
        if (Num < 2) {
            System.out.println("Hello");
        } else {
            System.out.println("Namaste");
        }

        // nested if-else -> it is an if-else statement inside another if-else statement
        //! Nested if-else
        if (Num > 4) {
            System.out.println("Hello");
        } else if (Num < 2) {
            System.out.println("Namaste");  
        } else {
            System.out.println("Bonjour");
        }
    }

}

