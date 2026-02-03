//! Anonymous object is like same as declare or initialize a variable
// int a;
// a = 2;

class A {
    public A() {
        System.out.println("Object is created");
    }

    public void show() {
        System.out.println("A in show");
    }

    public void blow() {
        System.out.println("A in blow");
    }

}

public class anonymus {
    public static void main(String[] args) {
        A obj;  // Reference 
        obj = new A();  // creating an object and assigning to obj
        obj.show();  // call show method

        //! Generally we do not use this because whenever we call any method in class using this object the will create multiple object 
        new A().show();  //! Anonymous Object
        new A().blow();  //! it will call blow method but they create dublicate object of a same class
    }
}
