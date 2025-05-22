// ===================
// java
// ===================
// java is an purely objectt oriented programming language developed by sum microsystems of USA in 1991
// java is a high level programming language
// It was originally called jack by james(one of the inventors of java) gaslin

// -----------------------------------------------------------------------------------------------------
// How JAVA works:
// java is compiled into to the bytecode and then interpreted to the machine code
// 1. Java source code is written in .java file
// 2. Java compiler compiles the .java file and generates .class file
// 3. Java interpreter reads the .class file and executes the bytecode
// 4. Java Virtual Machine (JVM) is used to run the bytecode
// 5. JVM is platform independent
// 6. JVM is a part of Java Runtime Environment (JRE)
// 7. JRE is a part of Java Development Kit (JDK)
// 8. JDK is used to develop Java applications

// ------------------------------------------------------------------------------------------------------
// JAVA Installation:
// JDK = "Java Development Kit" collection of tools used for developing and running java programs
// 1. Download the JDK from the official website: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
// 2. Install the JDK by following the instructions on the website

// JRE = "Java Runtime Environment" is a part of JDK that is used to run Java applications/Programs
// 1. Download the JRE from the official website: https://www.oracle.com/java/technologies/javase-jre8-downloads.html
// 2. Install the JRE by following the instructions on the website

// Basic structure of a Java program:
// 1. Class Declaration
// 2. Main Method Declaration
// 3. Print Statement
// 4. End of Class Declaration
// 5. End of Main Method Declaration
// 6. End of Program


/**
public class Basic {
public class Basic {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

 */
// ------------------------------------------------------------------------------------------------------
// Java Naming Conventions:
// 1. Class names should start with an uppercase letter and use CamelCase.
// 2. Method names should start with a lowercase letter and use camelCase.
// 3. Variable names should start with a lowercase letter and use camelCase.
// 4. Constants should be in uppercase letters with underscores separating words.
// 5. Package names should be in lowercase letters and use dot notation to separate words.
// 6. Use meaningful names that describe the purpose of the class, method, or variable.
// 7. Avoid using single-letter variable names except for loop counters.
// 8. Avoid using underscores in variable names.
// 9. Avoid using reserved keywords as variable names.
// 10. Use descriptive names for classes, methods, and variables to improve code readability.
// ------------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------------
// Java Comments:
// 1. Single-line comments start with // and continue to the end of the line.
// 2. Multi-line comments start with /* and end with */.
// 3. Documentation comments start with /** and end with */.//
// ------------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------------
// Variablee 
// ------------------------------------------------------------------------------------------------------
// A Variable is a named storage location in memory that can hold a value.This value can be changed during the execution of the program. In Java, variables must be declared with a specific data type, which determines the kind of values they can store. The data type also defines the operations that can be performed on the variable.
// syntax:
// data_type variable_name = value;
// -------------------------------------------------------------------------------------------------------
// Rules for declaring a variable name 
// -------------------------------------------------------------------------------------------------------
// 1. Variable name must start with a letter (a-z, A-Z), underscore (_), or dollar sign ($).
// 2. Variable name can contain letters, digits (0-9), underscores (_), and dollar signs ($).
// 3. Variable name cannot start with a digit.
// 4. Variable name cannot be a reserved keyword in Java (e.g., int, class, public, etc.).
// 5. Variable name should be meaningful and descriptive.
// 6. Variable name should not contain spaces.
// 7. Variable name should be case-sensitive (e.g., myVariable and MyVariable are different).
// 8. Variable name should not contain special characters (e.g., @, #, %, etc.).
// 9. Variable name should not be too long or too short.
// -------------------------------------------------------------------------------------------------------


// -------------------------------------------------------------------------------------------------------
// Data types
// -------------------------------------------------------------------------------------------------------
// 1. Primitive Data Types(intrinsic types)
//    - int: Represents a 32-bit signed integer. Example: int age = 25;
//    - double: Represents a 64-bit double-precision floating-point number. Example: double price = 19.99;
//    - char: Represents a single 16-bit Unicode character. Example: char grade = 'A';
//    - boolean: Represents a true or false value. Example: boolean isActive = true;
//    - byte: Represents an 8-bit signed integer. Example: byte b = 100;
//    - short: Represents a 16-bit signed integer. Example: short s = 1000;
//    - long: Represents a 64-bit signed integer. Example: long l = 100000L;
//    - float: Represents a 32-bit single-precision floating-point number. Example: float f = 10.5f;

// 2. Non-Primitive Data Types(derived types)
//    - String: Represents a sequence of characters. Example: String name = "John";
//    - Arrays: Represents a collection of elements of the same type. Example: int[] numbers = {1, 2, 3};
//    - Classes: Represents a blueprint for creating objects. Example: class Person { String name; int age; }
//   - Interfaces: Represents a contract that classes can implement. Example: interface Animal { void sound(); }
// -------------------------------------------------------------------------------------------------------


// -------------------------------------------------------------------------------------------------------
// How to choose data types for owr Variables
// Primitive Data Types
// Inlegral(int) -> byte, short, int, long
// float (Decimal) -> float, double
// char -> char
// Boolean -> true/false
// In order to choose the data tybe we must need to find the type of data we want want to store. After that we need to analyze the Min 8 Max value we might use.
// -------------------------------------------------------------------------------------------------------


// -------------------------------------------------------------------------------------------------------
// keywords
// Words which are reserved by the programming language and cannot be used as variable names. For example, int, class, public, etc.
// -------------------------------------------------------------------------------------------------------


// -------------------------------------------------------------------------------------------------------
// Reading data from the keyword
// 1. Scanner class is used to read input from the user.
// 2. Scanner class is part of the java.util package.
// 3. To use the Scanner class, we need to import the java.util package.
// 4. We can create an object of the Scanner class using the new keyword.
// 5. The Scanner class has several methods to read different types of data.
// 6. The most commonly used methods are nextInt(), nextDouble(), nextLine(), and next().
// - nextInt() is used to read an integer value.
// - nextDouble() is used to read a double value.
// - nextLine() is used to read a string value.
// - next() is used to read a single word.

/**  syntax:
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter your name: "); // prompt the user for input
        String name = scanner.nextLine(); // read a string value
        System.out.print("Enter your age: "); // prompt the user for input
        int age = scanner.nextInt(); // read an integer value
        System.out.println("Hello " + name + ", you are " + age + " years old."); // print the output
        }
    }  */

// -------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------
