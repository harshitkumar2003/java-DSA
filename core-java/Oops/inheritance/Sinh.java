//! Inheritance is the concept of OOPs where a child class inherits the properties(variables and methods) of parent class without creating a variables and methods for child class.

// It helps in creating a new class from an existing class, promoting code reusability and better organization

// A subclass can reuse the fields and methods of the parent class without rewriting the code
// A subclass can add its own fields and methods or modify existing ones to extend functionality.

//!  In single inheritance, a sub-class is derived from only one super class. It inherits the properties and behavior of a single-parent class. 

    class Calc {
        public int add(int n1, int n2) {
            return n1 + n2;
        }

        public int sub(int n1, int n2) {
            return n1 - n2;
        }
    }

    //! AdvCalc inherit the properties of Calc without creating an object for that 
    class AdvCalc extends Calc {
       public int multi(int n1, int n2) {
            return n1 * n2;
        }

        public int div(int n1, int n2) {
            return n1 / n2;
        }
    }

    public class Sinh {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc(); 
        int r1 = obj.add(3, 5);
        int r2 = obj.sub(3, 2);
        int r3 = obj.multi(5, 2);
        int r4 = obj.div(3, 8);
        System.out.println(r1 + " \n" + r2 + " \n" + r3 + " \n" + r4);
    }
}