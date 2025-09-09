// package Arrays;
// import java.util.*;

//  public class BasicArray {
//      public static void main(String[] args) {
//          int[]marks = new int[3];
        //  int[]marks = {33, 23, 22};  'this is also a valid syntax'
//           marks[0] = 97;  //hindi
//           marks[1] = 95;  //english
//           marks[2] = 95;  //math
//           System.out.println(marks[0]);
//           System.out.println(marks[1]);
//           System.out.println(marks[2]);
       // we can also use loopa to print 
//          for(int i = 0; i < 3; i++){
//              System.out.println(marks[i]);
//          }
//  }
//  }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
//  package Arrays;
// import java.util.*;

//  public class BasicArray {
//        public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//          int[]marks = new int[size];

//          for(int i = 0; i < size; i++){
//              marks[i] = sc.nextInt();
//          }

//          for(int i = 0; i < size; i++){
//              System.out.println(marks[i]);
//          }
//  }
//  }
// ------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------
package Arrays;

import java.util.*;

public class BasicArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] numbers = new int[size];

    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }

    int z = sc.nextInt();

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == z) {
        System.out.println("X found at index of: " + i);
    }
  }
}
}
// ------------------------------------------------------------------------------------------------
