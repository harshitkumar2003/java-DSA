package Exceptionhandling;
/*
What are Exceptions
! In Java, exception handling is a mechanism to handle runtime errors, allowing the normal flow of a program to continue. Exceptions are events that occur during program execution that disrupt the normal flow of instructions.

How to handle Exceptions
try-catch 
try with multiple catch block
! The try block contains code that might throw an exception,
! The catch block handles the exception if it occurs.

try-catch with finally
! The finally block always executed whether an exception is thrown or not. The finally is used for closing resources like db connections, open files and network connections, It is used after a try-catch block to execute code that must run.

throw and throws Keywords

! 1. throw: Used to explicitly throw a single exception. We use throw when something goes wrong (or “shouldn’t happen”) and we want to stop normal flow and hand control to exception handling.

! 2. throws: Declares exceptions that a method might throw, informing the caller to handle them. It is mainly used with checked exceptions (explained below). If a method calls another method that throws a checked exception, and it doesn’t catch it, it must declare that exception in its throws clause
Hierarchy
Checked & Unchecked Exceptions
Custom Exceptions
 */
public class Exc {

    public static void main(String[] args) {

    }

}
