package inputoutput;
/*
Java Input and Output

Java I/O is handled through the java.io package, which provides classes for reading from and writing to
various data sources like files, console, and network connections. It supports both byte 
streams (for binary data) and character streams (for text data).

Default Streams:

System.in – Standard input stream (keyboard input).

System.out – Standard output stream (console output).

System.err – Standard error stream (error messages).
*/
import java.util.Scanner;

public class io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
