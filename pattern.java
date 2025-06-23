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
// import java.util.Scanner;
// // *****
// // *   *
// // *   *
// // *   *
// // *   *
// // *****
//  public class pattern {
//      public static void main(String[] args)  {     
//      Scanner sc = new Scanner(System.in); 
//      System.out.print("Enter the number to be print for pattern: ");

       
//     int n = sc.nextInt(); // Read the input number
//     int m = 5; // Read the input number

//     for (int i = 1; i <= n; i++) { // Loop through rows
//         for (int j = 1; j <= m; j++) { // Loop through columns
//             if (i == 1 || j == 1 || j == m || i == n) { // Check if it's the first or last column or last row
//             System.out.print("*"); // Print the current row number
//         }
//         else {
//             System.out.print(" "); // Print space for other positions
//         }
//     }
//         System.out.println(); // Move to the next line after each row
//     }
//     }  
//  }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
// import java.util.Scanner;
// *
// **
// ***
// ****
// *****
//   public class pattern {
//       public static void main(String[] args)  {     
//       Scanner sc = new Scanner(System.in); 
//       System.out.println("Enter the number to be print for pattern: ");
//       int m = 5; // Read the input number
//       for (int i = 1; i <= m; i++) { // Loop through rows
//          for (int j = 1; j <= i; j++) { // Loop through columns
//              System.out.print("*"); // Print the current row number
//          }
//          System.out.println(); // Move to the next line after each row
//      }
//     }
// }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
//  import java.util.Scanner;
// *****
// ****
// ***
// **
// *
//   public class pattern {
//       public static void main(String[] args)  {     
//       Scanner sc = new Scanner(System.in); 
//       System.out.println("Enter the number to be print for pattern: ");
//       int m = 5; // Read the input number
//       for (int i = m; i >= 1; i--) { // Loop through rows
//          for (int j = 1; j <= i; j++) { // Loop through columns
//              System.out.print("*"); // Print the current row number
//          }
//          System.out.println(); // Move to the next line after each row
//      }
//     }
// }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
//  import java.util.Scanner;
//     *
//    **
//   ***
//  ****
// *****
//   public class pattern {
//       public static void main(String[] args) {     
//       Scanner sc = new Scanner(System.in); 
//       System.out.println("Enter the number to be print for pattern: ");
//         int m = 5; // Read the input number
//         for (int i = 1; i <= m; i++) { // Loop through rows
//             for (int j = 1; j <= m - i; j++) { // Loop through columns
//                 System.out.print(" "); // Print the current row number
//             }
//             for (int k = 1; k <= i; k++) { // Loop to print asterisks
//                 System.out.print("*"); // Print the current row number
//             } 
//             System.out.println(); // Move to the next line after each row
//             }
//           } 
//         }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
//  import java.util.Scanner;
// 1
// 22
// 333
// 4444
// 55555
//   public class pattern {
//       public static void main(String[] args) {     
//       Scanner sc = new Scanner(System.in); 
//       System.out.println("Enter the number to be print for pattern: ");
//         int m = 5; // Read the input number
//         for (int i = 1; i <= m; i++) { // Loop through rows
//             for (int j = 1; j <= i; j++) { // Loop through columns for spaces         
//                 System.out.print(i); // Print the current row number
//             } 
//             System.out.println(); // Move to the next line after each row
//             }
//           } 
//         }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
//  import java.util.Scanner;
// 1
// 12
// 123
// 1234
// 12345
//   public class pattern {
//       public static void main(String[] args) {     
//       Scanner sc = new Scanner(System.in); 
//       System.out.println("Enter the number to be print for pattern: ");
//         int m = 5; // Read the input number
//         for (int i = 1; i <= m; i++) { // Loop through rows
//             for (int j = 1; j <= i; j++) { // Loop through columns for spaces         
//                 System.out.print(j); // Print the current row number
//             } 
//             System.out.println(); // Move to the next line after each row
//             }
//           } 
//         }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
//  import java.util.Scanner;
// 12345
// 1234
// 123
// 12
// 1
//   public class pattern {
//       public static void main(String[] args) {     
//       Scanner sc = new Scanner(System.in); 
//       System.out.println("Enter the number to be print for pattern: ");
//         int m = 5; // Read the input number
//         for (int i = m; i >= 1; i--) { // Loop through rows
//             for (int j = 1; j <= i; j++) { // Loop through columns for spaces         
//                 System.out.print(j); // Print the current row number
//             } 
//             System.out.println(); // Move to the next line after each row
//             }
//           } 
//         }
// ------------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------
//  import java.util.Scanner;
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

//   public class pattern {
//       public static void main(String[] args) {     
//       Scanner sc = new Scanner(System.in); 
//       System.out.println("Enter the number to be print for pattern: ");
//          int m = sc.nextInt(); // Read the input number
//          int num = 1;
//         for (int i = 1; i <= m; i++) { // Loop through rows
//             for (int j = 1; j <= i; j++) { // Loop through columns for spaces         
//                 System.out.print(num+" "); // Print the current row number
//                 num++;
//             } 
//             System.out.println(); // Move to the next line after each row
//             }
//           } 
//         }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
 import java.util.Scanner;

  public class pattern {
      public static void main(String[] args) {     
      Scanner sc = new Scanner(System.in); 
      System.out.print("Enter the number to be print for pattern: ");
         int m = 5; // Read the input number
        for (int i = 1; i <= m; i++) { // Loop through rows
            for (int j = 1; j <= i; j++) { // Loop through columns for spaces  
                int sum = i + j; // Calculate the sum of row and column indices
                if(sum % 2 != 0) { // Check if the row number is even
                    System.out.print("1 "); // Print space for even rows
                } else {
                System.out.print("0 "); // Print the current row number
            } 
            System.out.println(); // Move to the next line after each row
            }
          } 
        }
    }
// ------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------


 
  
