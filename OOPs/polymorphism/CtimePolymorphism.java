package OOPs.polymorphism;

//! Polymorphism in Java is an Object-Oriented Programming (OOP) concept that allows one interface or method name to represent different behaviors, depending on the object that is calling it.
//! 2. Runtime Polymorphism (Method Overriding)

//___________________________________________________________________________________________________________
//! 1. Compile-Time Polymorphism (Method Overloading)
// Achieved when multiple methods have the same name but different parameters.
// resolved at compile time 

//! Properties
// same method but parameters are different
// method can be overloaded within the same class 
// Overloading depends on: Number of parameters | Type of parameters | Order of parameters

class Calculate {

    int display(int num1, int num2) {
        System.out.println("Integer addition of 2 num \n" + num1 + " + " + num2);
    return num1 + num2;
    }

    int display(int num1, int num2, int num3) {
        System.out.println("Integer addition of 3 num \n" + num1 + " + " + num2 + " + " + num3);
    return num1 + num2 + num3;
    }

    double display(double num1, double num2) {
        System.out.println("Decimal addition 2 num \n" + num1 + " + " + num2);
     return num1 + num2;
    }

    Calculate() {
        System.out.println("I am the constructor called first ***");
    }

}

public class CtimePolymorphism {
    public static void main(String[] args) {
        Calculate cal = new Calculate();

        System.out.println(cal.display(21, 65));
        System.out.println(cal.display(2, 31, 78));
        System.out.println(cal.display(41.22, 81.32));

    }
}
