//! In Java, the final keyword is a non-access modifier used to impose restrictions on variables, methods, and classes.
// It ensures that once something is declared final, it cannot be changed or overridden.
/* 
Key Points
Final variable → constant value (cannot be reassigned).
Final method → cannot be overridden.
Final class → cannot be inherited.
!optional
Final parameter → cannot be reassigned inside method.
Blank final variable → declared but initialized later (in constructor).
Static final → constant shared across all objects (like public static final double PI = 3.14159;).
*/

    //! Final Classes
    // A final class cannot be extended (no subclassing allowed).
final class Math {
    //! Final Variables
    // A final variable’s value cannot be changed once assigned.
    final int a = 20;

    //! Final Methods
    // A final method cannot be overridden by subclasses.
    final void show() {
        System.out.println("this final cannot be overide if it is declared with final keyword");
    }

    public void display(final int num) {
        // num = num + 1;  //! shows Compile-time error final parameter num may not be assigned
        System.out.println(num);
    }
}

/*class Alpha extends Math {  //! shows Compile-time error - final class cannot be inerit
   public void show() {  //! shows Compile-time error - method can not be overide
        System.out.println("this will be overide if parent class method declared without final keyword");
    }
}*/

public class finalkey {
    public static void main(String[] args) {
        Math obj = new Math();
        obj.display(4);
        // Alpha obj = new Alpha();
        // System.out.println(obj.a);
        // obj.a = 19; //! shows Compile-time error - value cannot be change
        // obj.show();
    }
}
