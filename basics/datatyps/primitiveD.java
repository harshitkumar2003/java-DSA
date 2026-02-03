/*//! Data Types in Java
Java data types define what kind of data a variable can store.

A. Primitive Data Types (store simple values directly)
Data Type	Size (bits)	 Example Value	    Description
int	        32	            100000      	Default integer type
char	    16	             'A'	        Single character (Unicode)
double	    64	           3.14159	        Decimal numbers (double precision)
boolean   	1	          true/false	    Logical values 
float	    32	            3.14f	        Decimal numbers (single precision)
byte	     8	             100	        Small integers (-128 to 127)
short	    16	            32000	        Medium integers
long	    64         	  10000000000L  	Large integers
*/

public class primitiveD {
    public static void main(String[] args) {
        int age = 22;
        char grade = 'a';
        double prize = 23.3412;
        boolean bi = true;
        float marks = 87;
        byte by = 100;
        short num1 = 12243;
        long num2 = 355565777;

        System.out.println(age);
        System.out.println(grade);
        System.out.println(prize);
        System.out.println(bi);
        System.out.println(marks);
        System.out.println(by);
        System.out.println(num1);
        System.out.println(num2);

    }
}