package Recursion;

public class printnum {
    public static int print(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return n-1;
}
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
}
