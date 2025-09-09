package Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        // rows
        for (int i = 0; i < rows; i++) {
            // cols
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // find number given by user
        int x = 55;

        // print output
        // rows
        for (int i = 0; i < rows; i++) {
            // cols
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("X is found at: (" + i + "," + j + ")");
                }
                // System.out.print(matrix[i][j] + " ");
            }
            // System.out.println();
        }
    }
}
