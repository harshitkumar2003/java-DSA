
//! Static
// In Java, the static keyword is used to define members (variables, methods, blocks, nested classes) that belong to the class itself rather than any specific object. This means they are shared across all instances and can be accessed without creating an object.

//! 1. A static variable is also known as a class variable. It is shared among all instances of the class and is used to store data that should be common for all objects.
class Mobile {
    String brand;
    String name;
    int prize;
    static String ram = "128GB";  //!Static Varible
    //! Data should be common for all objects
    void show() {
        System.out.println(brand + " : " + name + " : " + ram + " : " + prize);
    }

}
public class StatiV {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.name = "iPhone 12";
        obj1.prize = 120000;
        // obj1.ram = "128GB";
        // Mobile.ram = "128GB"; //! static belong to class we don't need to call static varible using object we can directly call using class.

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.name = "S24 Ultra";
        obj2.prize = 110000;
        // obj2.ram = "128GB";
        // Mobile.ram = "128GB";

        Mobile obj3 = new Mobile();
        obj3.brand = "OnePlus";
        obj3.name = "15 Plus 5G";
        obj3.prize = 68000;
        // obj3.ram = "128GB";
        // Mobile.ram = "128GB";

        obj1.show();
        obj2.show();
        obj3.show();
    }
    
}
