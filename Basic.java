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
// Words which are reserved by the programming language and cannot be used as variable names, they cannot used as a identifier. For example, int, class, public, etc.
// -------------------------------------------------------------------------------------------------------


// -------------------------------------------------------------------------------------------------------
// How to read data from the user using Scanner class
// 1. Import the Scanner class from the java.util package.
// import java.util.Scanner;
// 2. Create an object of the Scanner class using the new keyword.
// Scanner scanner = new Scanner(System.in);
// 3. Use the appropriate method of the Scanner class to read the input.
//   - Use nextInt() to read an integer value.
//   - Use nextDouble() to read a double value.
//   - Use nextLine() to read a string value.
//   - Use next() to read a single word.
// 4. Close the Scanner object after use to free up system resources.
// scanner.close();
// -------------------------------------------------------------------------------------------------------
// 5. Example:
// public class Basic {
    // public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in); // Create a Scanner object
      //  System.out.print("Enter your name: "); // Prompt the user for input
      //  String name = scanner.nextLine(); // Read a string value
      //  System.out.print("Enter your age: "); // Prompt the user for input
      //  int age = scanner.nextInt(); // Read an integer value
      //  System.out.println("Hello " + name + ", you are " + age + " years old."); // Print the output
      //  scanner.close(); // Close the Scanner object. why we use this?
        // Closing the Scanner object is important to free up system resources and avoid memory leaks.
        // If you don't close the Scanner object, it will remain open and consume system resources until
        // the program terminates. This can lead to performance issues, especially in larger applications.
   // }
// }
// -------------------------------------------------------------------------------------------------------


// -------------------------------------------------------------------------------------------------------
// Write a proganm to calculate percentage of a given student in CBSE board exam His 'marks from 5 Suljects must be taken as input from the keyboardd (Marks are out of 100).
// import java.util.Scanner;
// public class PercentageCalculator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Create a Scanner object
//         // Prompt the user for input
//         System.out.print("Enter marks for Subject 1: ");
//         int subject1 = scanner.nextInt();
//         System.out.print("Enter marks for Subject 2: ");
//         int subject2 = scanner.nextInt();
//         System.out.print("Enter marks for Subject 3: ");
//         int subject3 = scanner.nextInt();
//         System.out.print("Enter marks for Subject 4: ");
//         int subject4 = scanner.nextInt();
//         System.out.print("Enter marks for Subject 5: ");
//         int subject5 = scanner.nextInt();

//         // Calculate total and percentage
//         int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
//         double percentage = (totalMarks / 500.0) * 100; // Total marks are out of 500

//         // Print the result
//         System.out.println("Total Marks: " + totalMarks);
//         System.out.println("Percentage: " + percentage + "%");

//         scanner.close(); // Close the Scanner object
//     }
// }
// -------------------------------------------------------------------------------------------------------


// -------------------------------------------------------------------------------------------------------
// Practice Questiom
// -------------------------------------------------------------------------------------------------------
// 1 Write a program to sum three nunbers in Java.
// import java.util.Scanner;
// public classSumThreeNumbers {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Create a Scanner object
//         // Prompt the user for input
//         System.out.print("Enter Number 1: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Enter Number 2: ");
//         int num2 = scanner.nextInt();
//         System.out.print("Enter Number 3: ");
//         int num3 = scanner.nextInt();

//         // Calculate total sum
//         int sum = num1 + num2 + num3;
        
//         // Print the result
//         System.out.println("Total Sum: " + sum);

//         scanner.close(); // Close the Scanner object
//     }
// }
// -------------------------------------------------------------------------------------------------------


// -------------------------------------------------------------------------------------------------------
// 2 Write a program to calculate CGPA using marks of three subjects (out of 100).
// import java.util.Scanner;
// public class CGPACalculator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Create a Scanner object
//         // Prompt the user for input
//         System.out.print("Enter marks for subject 1: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Enter marks for subject 2: ");
//         int num2 = scanner.nextInt();
//         System.out.print("Enter marks for subject 3: ");
//         int num3 = scanner.nextInt();

//         // Calculate total sum
//         int sum = num1 + num2 + num3;
//         double cgpa = sum / 30.0; // Assuming each subject is out of 100, CGPA is calculated out of 10

        
//         // Print the result
//         System.out.println("CGPA:" + cgpa);

//         scanner.close(); // Close the Scanner object
//     }
// }
// -------------------------------------------------------------------------------------------------------


// -------------------------------------------------------------------------------------------------------
// 3 Write a java program which asks the user to enter his/her name greets them with "Hello <name>, have a good day" text.
// import java.util.Scanner;
// public class Greet {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Create a Scanner object
//            // Prompt the user for input
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();
//         // Print the greeting message
//          System.out.println("Hello " + name + ", have a good day!");
//         scanner.close(); // Close the Scanner object
//     }
// }
// -------------------------------------------------------------------------------------------------------


// -------------------------------------------------------------------------------------------------------
// 4 Write a Java program to convert Kilometers to miles.
// import java.util.Scanner;
// public class KilometersToMiles {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Create a Scanner object
//            // Prompt the user for input
//         System.out.print("Enter distance in kilometers: ");
//         double kilometers = scanner.nextDouble();
//         // Convert kilometers to miles
//         // 1 kilometer is approximately equal to 0.621371 miles
//         double miles = kilometers * 0.621371;
//         double miles = kilometers / 1.6; // Alternative conversion factor
//         // Print the greeting message
//         System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

//         scanner.close(); // Close the Scanner object
//     }
// }
// -------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------
