import java.util.Scanner;
 public class pattern {
     public static void main(String[] args)  {     
     Scanner sc = new Scanner(System.in); 
     System.out.print("Enter the number to be print for pattern: ");
       
    int n = sc.nextInt(); // Read the input number

    for (int i = 1; i <= n; i++) { // Loop through rows
        for (int j = 1; j <= i; j++) { // Loop through columns
            System.out.print("*"); // Print the current row number
        }
        System.out.println(); // Move to the next line after each row
    }
       
    }
    
 }
