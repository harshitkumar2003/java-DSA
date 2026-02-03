

//! 2. Runtime Polymorphism (Method Overriding)
// Method Overriding in Java is a feature that allows a subclass to provide its own specific implementation of a method that is already defined in its parent (super) class.
// It is a key concept in runtime polymorphism.

//! Rules for Method Overriding
// Name, parameters, and return type must match the parent method.
// Java picks which method to run at run time, based on the actual object type, not just the reference variable type.
// Static methods cannot be overridden.
// The @Override annotation catches mistakes like typos in method names.

class Shapes {
    void print()   {
        System.out.println("Parent class");
    }

}

class Rectangle extends Shapes {
    void print() {
        System.out.println("Child class");
    }

}

class Square extends Rectangle {
    //! print method from Base class is overriden in this method
    @Override    // annotation catches mistakes like typos in method names.
    void print() {
        System.out.println("Subchild class");
    }

}

public class RtimePolymorphism {
    public static void main(String[] args) {
        Shapes sh = new Square();
        sh.print();
    }
    
}
