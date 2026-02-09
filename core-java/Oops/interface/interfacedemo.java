/*
! In Java, an interface is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces are used to achieve abstraction and to support multiple inheritance of type since Java allows a class to implement multiple interfaces.

! Key Points About Interfaces
* 1. Declaration: An interface is declared using the interface keyword.
* 2. Methods: By default, methods in an interface are abstract (until Java 8). Java 8 introduced default and static methods inside interfaces.
* 3. Fields: All fields are implicitly public, static, and final.
* 4. Implementation: A class "implements" an interface using the implements keyword. The class must provide concrete implementations for all interface methods (except default methods).
* 5. Multiple Interfaces: A Java class can implement multiple interfaces, unlike extending only one class

!class --> extends --> class
!class --> implements --> interface
!interface --> extends --> interface

!Types of Interfaces
1. Normal Interface - (Pure Abstract Interface)
Contains only abstract methods (before Java 8).
From Java 8 onwards, can also have default and static methods.
Used for defining a standard contract for multiple classes.

2. Functional Interface - (Single Abstract Method Interface)
Contains exactly one abstract method.
Can have multiple default or static methods.
Used mainly with lambda expressions (Java 8+).
Annotated with @FunctionalInterface (optional but recommended).

3. Marker Ineterface - without method
No methods or fields.
Used to mark a class with a specific property or behavior.
Example: Serializable, Cloneable, Remote

4. SAM Interface (Special case of Functional Interface)
Single Abstract Method interface, but often used for event handling or callbacks.
Example: Runnable, Callable.
*/
 
interface Outer {

    //! all felds variable , methods  will public, static, and final default does not need to add keyword.
    public int parcel  = 24;
    public String area = "Sweden";

    public void showInfo();
    public void detailInfo();
}

interface Subouter {
    public void brandDetail();
}

interface Medium extends Subouter {
    public void recieverDetail();
}

//! Only class can instantiate -> interface cannot have object
//! Instead extends keyword we use implements for interface
//! Class can implements multiple interface

class Inner implements Outer,Medium {

    public void showInfo() {
        System.out.println("In Details :");
    }

    public void detailInfo() {
        System.out.println("Parcel from : " + area + " || " + "Items to be Send : " + parcel);
    }

    public void brandDetail() {
        System.out.println("American Express");
    }

    public void recieverDetail() {
        System.out.println("Harshit Kumar :\nPhone : +464335324");
    }
}



public class interfacedemo {
    public static void main(String[] args) {   
        //! if we use outer reference we cannot call another interfaces methods we can only call same interface method

        // Outer in = new Inner();
        //! Instead of them we can create object of class that directly call all methods using inheritance of multiple interfaces
        Inner in = new Inner();
        in.showInfo();
        in.detailInfo();
        in.brandDetail();
        in.recieverDetail();

        System.out.println("Total Parcels  : " + Outer.parcel);
    }
}
