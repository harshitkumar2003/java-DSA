/*//!In Java, arithmetic operators let you perform basic math on numbers, including addition, subtraction, multiplication, division, modulus, and increment/decrement.

//TODO_List of Arithmetic Operators in Java
Operator	Description        	Example (a = 10, b = 3)	       Result
+	          Addition                 	a + b	                 13
-	        Subtraction             	a - b	                  7
*	       Multiplication            	a * b	                 30
/	       Division (quotient)         	a / b	                  3 (integer division)
%         Modulus (remainder)	        a % b	                  1
++	       Increment (adds 1)	      a++ or ++a                 11 (after increment)
--	     Decrement (subtracts 1)	  a-- or --a	              9 (after decrement)
    }
}

 */
public class arithmeticopr {
    public static void main(String[] args) {
        //! Arithmetic Operators
        int v1 = 31;
        int v2 = 22;

        //  Addition  
        int sum = v1 + v2;
        System.out.println(sum);

        // Subtraction
        int sub = v1 - v2;
        System.out.println(sub);

        // Multiplication  
        int pro = v1 * v2;
        System.out.println(pro);

        // Division
        int div = v1 / v2;
        System.out.println(div);

        // Modulus
        int rem = v1 % v2;
        System.out.println(rem);

        // Increment
        int x = 5;
        System.out.println("x before increment: " + x);
        System.out.println("x++ = " + (x++)); // Post-increment
        System.out.println("After x++: " + x);
        System.out.println("++x = " + (++x)); // Pre-increment

        //  Decrement
        int y = 5;
        System.out.println("y before decrement: " + y);
        System.out.println("y-- = " + (y--)); // Post-decrement
        System.out.println("After y--: " + y);
        System.out.println("--y = " + (--y)); // Pre-decrement
        
    }
}
