package Arrays;

public class multD {
    public static void main(String[] args) {
        
    //TODO_2. Multidimensional Array
    //! 1. Declaring an 2D Array 
    // dataType[][] arrayName;
    int[][] num;

    //! 2. Creating an 2D Array
    // arrayName = new dataType[rows][columns];
    num = new int[3][4];

    //! declaration + creation together:
    //  dataType[][] arrayName = new dataType[rows][columns];
    int[][] m1 = new int[2][3];

    //! 3. Initializing an 2D Array
    // a) By assigning values later
    int[][] matrix = new int[2][3];
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;
    matrix[1][0] = 4;
    matrix[1][1] = 5;
    matrix[1][2] = 6;
    // System.out.println(matrix[0][1]);
    
    // b) At the time of declaration
    int[][] matrix1 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    //! For loop for displaying 2D array using (.length) property
    /*for (int i = 0; i < matrix1.length; i++) {
        for (int j = 0; j < matrix1.length; j++) {
            System.out.print(matrix1[i][j] + " ");
        }
      System.out.println();
        
    }*/

    //! display an alphabet array
    char[][] alpha = new char[2][3];
    alpha[0][0] = 'a';
    alpha[0][1] = 'b';
    alpha[0][2] = 'c';
    alpha[1][0] = 'd';
    alpha[1][1] = 'e';
    alpha[1][2] = 'f';

    for (int i = 0; i < alpha.length; i++) {
        for (int j = 0; j < alpha[i].length; j++) {
            System.out.print(alpha[i][j] + " ");
        }
        System.out.println();
    }

    }

}



//! Three Dimensional Array
//! Syntax
// datatype[][][] arrayName = new datatype[][][];

/*+----+----+----+
  |              |
  +----+----+----+
  |              | layer 1
  +----+----+----+
  |              |
  +----+----+----+
*/
/*+----+----+----+
  |              |
  +----+----+----+
  |              | layer 2 inside layer 1
  +----+----+----+
  |              |
  +----+----+----+
*/
/*+----+----+----+
  |              |
  +----+----+----+
  |              | layer 3 inside layer 2
  +----+----+----+
  |              |
  +----+----+----+
*/

/*     0     1   2
   0 +----+----+----+
     |              |
     +----+----+----+
   1 |              | elements of each array
     +----+----+----+
     |              |
   2 +----+----+----+
*/