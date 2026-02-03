/* //! B. Non-Primitive Data Types(derived types)
-> Non-primitive data types in Java, also known as reference types, are user-defined types that refer to object, non-primitive types are created by programmers. These types are used to store multiple values and can call methods to perform certain operations.

 Class & Object: Represents a blueprint for creating objects. Example: class Person { String name; int age; }
 String: Represents a sequence of characters. Example: String name = "John";
 Arrays: Represents a collection of elements of the same type. Example: int[] numbers = {1, 2, 3};
 Interfaces: Represents a contract that classes can implement. Example: interface Animal { void sound(); }
*/

//! Interfaces waiting
//! Class & Object
class Example {
    String name = "Harry";
    int age = 21;

    public void show() {
        System.out.println(name + " : " + age);
    }
}
public class NonPrimitiveDtype {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.show();

//! String
        String letter = "hey this is javs 111";
        System.out.println("String : " + letter);

//! Array
        int [] marks = {87,77,89,67,82};
        System.out.println("Array elements are : ");
        for(int num : marks) {
            System.out.print(num + " ");
        }

    }
}
