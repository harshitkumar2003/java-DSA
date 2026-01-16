package arrays;

//! A Java array is a collection of elements of the same data type stored in a fixed-size list and accessed using an index.

//! Types of array 
//! 1. One-Dimensional Array
//! 2. Multidimensional array

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
    System.out.println(num[2]);

    // b) At the time of declaration
    int[] val = {10, 20, 30};
    System.out.println(val[1]);

  }
 
}
