package Functions;

public class basic_function {

    //! 1. function without parameter and without return type
    // public static void say() {
    // System.out.println("how's it going");
    // }

    // public static void main(String[] args) {
    // System.out.println("Hello guys ready to learn functions");
    // say();
    // System.out.println("I'm back");
    // }


    //! 2. function with parameter and without return type
    // public static void credentials(String name) {
    //     System.out.println("My name is " + name + " Kumar");
    // }

    // public static void main(String[] args) {
    //     credentials("Harshit");
    // }


    //! 3. function with parameter and with return type
    //  public static int add(int a, int b) {
    //      int sum = a + b;
    //      return sum;
    //  }
    //  public static void main(String[] args) {
    //      int result = add(12, 12);
    //      System.out.println(result);
    //  }


    //! 4. function without parameter and with return type
     public static String name() {
         String name = "Harshit Kumar";
         return name;
     }
     public static void main(String[] args) {
         String myName = name();
         System.out.println(myName);
     }
}