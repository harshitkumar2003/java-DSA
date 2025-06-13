// import java.util.Scanner;
// This program prints a pattern of asterisks based on user input.
// *
// **
// ***
// ****
// *****

//  public class pattern {
//      public static void main(String[] args)  {     
//      Scanner sc = new Scanner(System.in); 
//      System.out.print("Enter the number to be print for pattern: ");
       
//     int n = sc.nextInt(); // Read the input number

//     for (int i = 1; i <= n; i++) { // Loop through rows
//         for (int j = 1; j <= i; j++) { // Loop through columns
//             System.out.print("*"," "); // Print the current row number
//         }
//         System.out.println(); // Move to the next line after each row
//     }
       
//     }
    
//  }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
// import java.util.Scanner;
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
//  public class pattern {
//      public static void main(String[] args)  {     
//      Scanner sc = new Scanner(System.in); 
//      System.out.print("Enter the number to be print for pattern: ");
       
//     int n = sc.nextInt(); // Read the input number

//     for (int i = 1; i <= n; i++) { // Loop through rows
//         for (int j = 1; j <= 5; j++) { // Loop through columns
//             System.out.print("*"+" "); // Print the current row number
//         }
//         System.out.println(); // Move to the next line after each row
//     }
       
//     }
    
//  }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
import java.util.Scanner;
 public class pattern {
     public static void main(String[] args)  {     
     Scanner sc = new Scanner(System.in); 
     System.out.print("Enter the number to be print for pattern: ");

       
    int n = sc.nextInt(); // Read the input number
    int m = sc.nextInt(5); // Read the input number

    for (int i = 1; i <= n; i++) { // Loop through rows
        for (int j = 1; j <= m; j++) { // Loop through columns
            if (i==1 || j == 1 || j == m || i == n) { // Check if it's the first or last column or last row
            System.out.print("*"+" "); // Print the current row number
        }
        else {
            System.out.print(" "); // Print space for other positions
        }
    }
        System.out.println(); // Move to the next line after each row
    }
    }  
 }
