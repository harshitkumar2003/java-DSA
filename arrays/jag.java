package arrays;

//! Jagged Array in Java
// A jagged array is a 2D array where each row can have a different number of columns.
// It is also called an irregular array.

public class jag {
    public static void main(String[] args) {
    //TODO_3. Jagged Array

    //! Jagged array Syntax
    // dataType[][] arrayName = new dataType[rows][];

    //! declaration + creation together + initialization:
    // a) By assigning values later
        int[][] arr = new int[3][];
        arr[0] = new int[2]; // row 0 has 2 columns
        arr[1] = new int[4]; // row 1 has 4 columns
        arr[2] = new int[3]; // row 2 has 3 columns
        arr[0][0] = 43;
        arr[0][1] = 23;
        arr[1][0] = 25;
        arr[1][1] = 32;
        arr[1][2] = 52;
        arr[1][3] = 27;
        arr[2][0] = 21;
        arr[2][1] = 12;
        arr[2][2] = 92;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

 System.out.println();
        //! Initializing Jagged Array
        // b) At the time of declaration
        int[][] jarr = {{1, 2},
                        {3, 4, 5, 6},
                        {7, 8, 9}};
        for (int i = 0; i < jarr.length; i++) {
            for (int j = 0; j < jarr[i].length; j++) {
                System.out.print(jarr[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
