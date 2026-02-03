package wrapperclasses;
/*
!In Java, a wrapper class is a class that encapsulates (wraps) a primitive data type into an object.
!This allows primitive values to be used where objects are required — for example, in collections, generics, and APIs that work only with objects.

* Primitive Types and Their Wrapper Classes
Primitive Type	             Wrapper Class
byte	              --->      Byte
short	              --->      Short
int	                  --->      Integer
long	              --->      Long
float	              --->      Float
double	              --->      Double
char	              --->      Character
boolean	              --->      Boolean

!Why Use Wrapper Classes?
*Collections & Generics – Collections like ArrayList can store only objects, not primitives.
*Utility Methods – Wrapper classes provide useful methods (e.g., parsing, conversions).
*Null Handling – Objects can be null, primitives cannot.
*Autoboxing/Unboxing – Automatic conversion between primitives and wrapper objects. 
*/

public class wrapcls {
    public static void main(String[] args) {
        // Autoboxing: primitive to object
        int num = 10;
        Integer num1 = num;
        System.out.println("Automatically wraps int into Integer " + num1);

        // Unboxing: object to primitive
        Integer n = 100;
        int n1 = n;
        System.out.println("Automatically unwraps Integer to int " + n1);
    }
}
