package Functions.Recursion;

import java.util.Scanner;

public class factorial {
    public static int fact (int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact_nm1 = fact(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number to find factorial: ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
    
}
