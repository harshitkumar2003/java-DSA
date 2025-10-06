package Functions.Recursion;

import java.util.*;

public class fibbonachi {
    public static void fib (int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fib(b, c, n-1);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of terms for Fibonacci series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
    
        System.out.print(a + " " + b + " ");

        fib(a, b, n-2);
    }
    
}
