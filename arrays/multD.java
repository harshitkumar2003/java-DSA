package arrays;

public class multD {
    public static void main(String[] args) {
        
    //TODO_2. Multidimensional Array
    //! 1. Declaring an Array 
    // dataType[][] arrayName;
    int[][] num;

    //! 2. Creating an Array
    // arrayName = new dataType[rows][columns];
    num = new int[3][4];

    //! declaration + creation together:
    //  dataType[][] arrayName = new dataType[rows][columns];
    int[][] m1 = new int[2][3];

    //! 3. Initializing an Array
    // a) By assigning values later
    int[][] matrix = new int[2][3];
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;
    matrix[1][0] = 4;
    matrix[1][1] = 5;
    matrix[1][2] = 6;
    System.out.println(matrix[0][1]);
    
    // b) At the time of declaration
    int[][] matrix1 = {
        {1, 2, 3},
        {4, 5, 6}
    };
    System.out.println(matrix1[0][2]);


    }
}