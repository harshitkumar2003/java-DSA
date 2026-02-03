//! A static block is executed only once when the class is first loaded into memory. It is often used to initialize static variables or perform configuration tasks before the main method executes.

// Static block runs only one time
// Even if multiple objects are created
// Static block cannot access non-static variables or methods directly
// If class have multiple static, they execute in the order they appear in the class 
// Static block does not return anything

class Phone {
    static String brand; //! static variable
    int prize;
    String model;

    //! In simple words static block is used for initializing static variables.
    static {   //! static block
        brand = "Apple";
        System.out.println("IN STATIC");
    }

    public Phone() {
        System.out.println("IN CONSTRUCTOR");
    }

    public static void show(Phone ph) {  //! static method
        System.out.println("IN STATIC METHOD");
        System.out.println(brand + " " + ph.prize + " " + ph.model);
    }
}
public class StatB {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.prize = 2300;
        ph.model = "iPhnoe 15";
        Phone ph1 = new Phone();
        Phone.show(ph);
    }
}
