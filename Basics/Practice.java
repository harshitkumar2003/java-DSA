package Basics;
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
// 5 Write a Java program using conditional statements to find out whether a student has passed or failed. The passing marks are 40.

// public class Practice {
//     public static void main(String[] args) {
//         int marks = 34;
//         if (marks >= 40) {
//             System.out.println("The student has passed.");
//         } else {
//             System.out.println("The student has failed.");
//         }
//     }
// }

// -------------------------------------------------------------------------------------------------------
// 6 Write a Java program to find the largest of three numbers using nested if-else statements.
//  public class Practice {
//     public static void main (String[] args) {
//         int num1 = 41;
//         int num2 = 44;
//         int num3 = 45;
//         if (num1 >= num2 && num1 >= num2) {
//             System.out.println(num1 + " is the largest number.");
//         } else if (num2 >= num1 && num2 >= num3) {
//             System.out.println(num2 + " is the largest number.");
//         } else {
//             System.out.println(num3 + " is the largest number.");
//         }
//     }
//  }


// -------------------------------------------------------------------------------------------------------
// 7 Write a Java program to make a simple calculator that can perform addition, subtraction, multiplication, and division based on user input.
// import java.util.Scanner;
//     public class Practice {
//         public static void main (String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             System.out.print("Enter first number: ");
//             double num1 = scanner.nextDouble();
//             System.out.print("Enter second number: ");
//             double num2 = scanner.nextDouble();
//             System.out.print("Enter an operator (+, -, *, /): ");
//             char operator = scanner.next().charAt(0);
//             double result;
    
//             switch (operator) {
//                 case '+':
//                     result = num1 + num2;
//                     break;
//                 case '-':
//                     result = num1 - num2;
//                     break;
//                 case '*':
//                     result = num1 * num2;
//                     break;
//                 case '/':
//                     if (num2 != 0) {
//                         result = num1 / num2;
//                     } else {
//                         System.out.println("Error: Division by zero is not allowed.");
//                         scanner.close();
//                         return;
//                     }
//                     break;
//                 default:
//                     System.out.println("Error: Invalid operator.");
//                     scanner.close();
//                     return;
//             }
    
//             System.out.println("The result is: " + result);
//             scanner.close();
//         }
//  }
