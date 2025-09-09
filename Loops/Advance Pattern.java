//  import java.util.Scanner;
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
//   public class pattern {
//       public static void main(String[] args) {     
//     //   Scanner sc = new Scanner(System.in); 
//     //   System.out.print("Enter the number to be print for pattern: ");
//          int m = 5; // Read the input number
//         for (int i = 1; i <= m; i++) { // Loop through rows
//             for (int j = 1; j <= i; j++) { // Loop through columns for spaces  
//                 int sum = i + j; // Calculate the sum of row and column indices
//                 if(sum % 2 == 0) { // Check if the row number is even
//                     System.out.print("1 "); // Print space for even rows
//                 } else {
//                 System.out.print("0 "); // Print the current row number
//                 }
//             }
//             System.out.println(); // Move to the next line after each row
//          }
//      } 
// }
// ------------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------
//  import java.util.Scanner;
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// public class pattern {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter the number to be print for pattern: ");
//         int m = 5; // Read the input number
//         // 1st part
//         for (int i = 1; i <= m; i++) { // Loop through rows
//             for (int j = 1; j <= i; j++) { // Loop through columns
//                 System.out.print("*"); // Print the current row number
//             }
//             for (int k = 1; k <= 2 * (m - i); k++) { // Loop to print asterisks
//                 System.out.print(" "); // Print the current row number
//             }
//             for (int j = 1; j <= i; j++) { // Loop through columns
//                 System.out.print("*"); // Print the current row number
//             }
//             System.out.println(); // Move to the next line after each row
//         }
//         for (int i = m; i >= 1; i--) { // Loop through rows
//             for (int j = 1; j <= i; j++) { // Loop through columns
//                 System.out.print("*"); // Print the current row number
//             }
//             for (int k = 1; k <= 2 * (m - i); k++) { // Loop to print asterisks
//                 System.out.print(" "); // Print the current row number
//             }
//             for (int j = 1; j <= i; j++) { // Loop through columns
//                 System.out.print("*"); // Print the current row number
//             }
//             System.out.println(); // Move to the next line after each row
//         }

//     }

// }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
// import java.util.Scanner;
//      *****
//     *****
//    *****
//   *****
//  *****
// public class pattern {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter the number to be print for pattern: ");
//         int m = 5; // Read the input number
//         // 1st part
//         for (int i = m; i >= 1; i--) { // Loop through rows
//             for (int j = 1; j <= i; j++) { // Loop through columns
//                 System.out.print(" "); // Print the current row number
//             }
//             for (int k = 1; k <= m; k++) { // Loop to print asterisks
//                 System.out.print("*"); // Print the current row number
//             }        
//             System.out.println(); // Move to the next line after each row
//        }
//     }
// }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
// import java.util.Scanner;
//  11111
//   22222
//    33333
//     44444
//      55555
// public class pattern {

//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter the number to be print for pattern: ");
//         int m = 5; // Read the input number
//         // 1st part
//         for (int i = 1; i <= m; i++) { // Loop through rows
//             for (int j = 1; j <= i; j++) { // Loop through columns
//                 System.out.print(" "); // Print the current row number
//             }
//             for (int k = 1; k <= m; k++) { // Loop to print asterisks
//                 System.out.print(i); // Print the current row number
//             }        
//             System.out.println(); // Move to the next line after each row
//        }
//     }
// }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
// import java.util.Scanner;
//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
// public class pattern {

//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter the number to be print for pattern: ");
//         int m = 5; // Read the input number
//         // 1st part
//         for (int i = 1; i <= m; i++) { // Loop through rows
//             for (int j = 1; j <= m-i; j++) { // Loop through columns
//                 System.out.print(" "); // Print the current row number
//             }
//             for (int k = 1; k <= i; k++) { // Loop to print asterisks
//                 System.out.print(i+" "); // Print the current row number
//             }        
//             System.out.println(); // Move to the next line after each row
//        }
//     }
// }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
// import java.util.Scanner;
//     1
//    212
//   32123
//  4321234
// 543212345
// public class pattern {

//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter the number to be print for pattern: ");
//         int m = 5; // Read the input number
//         // 1st part
//         for (int i = 1; i <= m; i++) { // Loop through rows
//             for (int j = 1; j <= m-i; j++) { // Loop through columns
//                 System.out.print(" "); // Print the current row number
//             }
//             for (int k = i ; k >= 1; k--) { // Loop to print asterisks
//                 System.out.print(k); // Print the current row number
//             }        
//             for (int k = 2 ; k <= i; k++) { // Loop to print asterisks
//                 System.out.print(k); // Print the current row number
//             }        
//             System.out.println(); // Move to the next line after each row
//        }
//     }
// }
// ------------------------------------------------------------------------------------------------
