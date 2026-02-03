//! Instance Initialization Block (IIB) in Java
/*
In Java, an Instance Initialization Block (IIB) is used to initialize instance-level data and executes every time an object is created, before the constructor. It helps run common initialization logic shared across multiple constructors and ensures consistent object setup.

!Execution Order of IIB
When an object is created:

* Instance variables are initialized
* Instance Initialization Block executes
* Constructor executes

Syntax
{

    / statements

}
*/

class IIblock {
 public IIblock() {
    System.out.println("Constructor called ");
 }
//! IIB
 {
    System.out.println("Instance Initialization Block ");
 }
}

public class IIB {
    public static void main(String[] args) {
        IIblock obj = new IIblock();
    }
}