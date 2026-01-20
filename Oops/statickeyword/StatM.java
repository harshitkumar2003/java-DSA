

//! A static method belongs to the class rather than to any object. It can be called directly using the class name.

//! Can access only static data directly.
//! Cannot access instance variables or methods directly.
//! Cannot use this or super keywords.

class Mobiles {
    String brand;
    String name;
    int prize;
    static String ram = "128GB";  //!Static Varible

    public void show() {
        System.out.println(brand + " : " + name + " : " + ram + " : " + prize);
    }

    //! In static method we cannot access/used instance(Unstatic) variables or methods directly in th static methods they should give errors only static variable can access.
    public static void show1(Mobiles obj) {
        System.out.println(obj.brand + " : " + obj.name + " : " + ram + " : " + obj.prize);
    }
}

public class StatM {
    public static void main(String[] args) {
        Mobiles obj1 = new Mobiles();
        obj1.brand = "Apple";
        obj1.name = "iPhone 12";
        obj1.prize = 120000;
        // obj1.ram = "128GB";

        Mobiles obj2 = new Mobiles();
        obj2.brand = "Samsung";
        obj2.name = "S24 Ultra";
        obj2.prize = 110000;
        // obj2.ram = "128GB";

        Mobiles obj3 = new Mobiles();
        obj3.brand = "OnePlus";
        obj3.name = "15 Plus 5G";
        obj3.prize = 68000;
        // obj3.ram = "128GB";

        obj1.show();
        obj2.show();
        obj3.show();

        //! static belong to class we don't need to call static method using object we can directly call using class.
        //! if we want to access unstatic variable in static method we need to pass an object as a parameter.
        Mobiles.show1(obj2);
    }
    
}