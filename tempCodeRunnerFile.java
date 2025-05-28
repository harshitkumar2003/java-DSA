import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
           // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // Print the greeting message
         System.out.println("Hello " + name + ", have a good day!");
        scanner.close(); // Close the Scanner object
    }
}