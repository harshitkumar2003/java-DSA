package Oops.casting;

//! Upcasting
// To store Child class object in Parent class reference
// Upcasting = Parent reference ← Child object (Safe)
//! Downcasting
// To convert a parent reference into a child reference to access child-specific behavior, and it is safe only when the object is actually of child type.
class Tom {
    public void say() {
        System.out.println("Meow");
    }
}

class Jerry extends Tom {
    public void say() {
        System.out.println("Piew");
    }

    public void display() {
        System.out.println("Mouse");
    }
}

public class upcs {
    public static void main(String[] args) {
        //! Upcasting
        Tom obj = new Jerry();
        obj.say();
        //! Downcasting
        Jerry obj1 = (Jerry) obj;
        obj1.display();
        
    }
}
