package xceptionhandling;
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
Throwable
   ├── Error (serious issues, not meant to be handled)
   │     ├── OutOfMemoryError
   │     ├── StackOverflowError
   │     └── ...
   └── Exception (conditions applications may handle)
         ├── Checked Exceptions
         │       ├── IOException
         │       ├── SQLException
         │       ├── ClassNotFoundException
         │       └── ...
         └── Unchecked Exceptions (RuntimeException and its subclasses)
                 ├── NullPointerException
                 ├── ArithmeticException
                 ├── ArrayIndexOutOfBoundsException
                 └── ...

Checked 
! Checked at compile-time.
! Must be declared in method signatures using throws or handled with try-catch.

Unchecked Exceptions (Runtime Exceptions)
! Checked at runtime.
! Do not need to be declared or caught explicitly.

Custom Exceptions
 */
public class demo{

    public static void main(String[] args) {

        int[] arr = {2, 1, 22, 34};

        try {
            System.out.println(arr[4]);
            //! Instead of exception we can write exception name
        } catch (Exception e) { //catch (Arrayindexoutofbound e)
            System.out.println("Array size kam kar 0 se suru hota hai..." + e);
        } finally {
            System.out.println("Exception Handle hogya");
        }
        System.out.println(arr[1]);

    }

}
