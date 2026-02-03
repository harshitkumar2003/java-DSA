package Arrays;

//! A Java array is a collection of elements of the same data type stored in a fixed-size list and accessed using an index.

//! Types of array 
//! 1. One-Dimensional Array
//! 2. Multidimensional Array
//! 3. Jagged Array

public class oneD {
  public static void main(String[] args) {

    //TODO_1. One-Dimensional Array
    //! 1. Declaring an Array 
    // dataType[] arrayName; or dataType arrayName[];
    int[] numbers;

    //! 2. Creating an Array
    numbers = new int[5]; // array of size 5

    //! declaration + creation together:
    int[] n = new int[5]; 

    //! 3. Initializing an Array
    // a) By assigning values later
    int[] num = new int[3];
    num[0] = 10;
    num[1] = 20;
    num[2] = 30;

    //! For loop for displaying the array using (.length) property
    for (int i = 0; i < num.length; i++) {
      // System.out.println(num[i]);
    }
    
    // b) At the time of declaration
    int[] val = {10, 20, 30, 40, 50};

// -------------------------------------------------------------------------------
    //! Enhanced for loop -> only works on collection (group of numbers or array)
// -------------------------------------------------------------------------------
  // Syntax
  //!  for (iterable_type iterable_element : iterable) {  }
  //TODO_ iterable_type -> datatype | iterable_element -> number itslef not a index | iterable -> array name
  
  for(int a : val) {
    System.out.print(a + " ");
  }

// -------------------------------------------------------------------------------
  // Ques1. WAP to search an element in an array 
   int[] arr = {12, 14, 22, 42, 55};
   
  //  for (int i = 0 ; i < arr.length ; i++) 
  //! Enhanced for loop
  for (int i : arr) {
       if (i == 12) {
        System.out.println("\nFound");
    }    
   }

// -------------------------------------------------------------------------------
  // Ques2. WAP to find maximum element in an array
  int[] fm = new int[5];
  fm[0] = 11;
  fm[1] = 55;
  fm[2] = 66;
  fm[3] = 33;
  fm[4] = 32;
  int res = Integer.MIN_VALUE; //! take the smallest value

  //! Enhanced for loop
  for (int i : fm) {
    if (i > res) {
      res = i;
    }
  }
    System.out.println(res);
  
// -------------------------------------------------------------------------------
  // Ques3. WAP to reverse an array 
  int[] rev = {1, 3, 4, 6, 8};
  int sum = 0;
  for (int i = rev.length-1 ; i >= 0 ; i--) {
      System.out.print(rev[i] + " ");
    }
  //! Enhanced for loop
  for (int i : rev) {
      sum += i;
    }
    System.out.println("\n"+ sum);
// -------------------------------------------------------------------------------

  }
 
}
