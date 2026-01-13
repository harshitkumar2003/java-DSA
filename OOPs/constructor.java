package OOPs;

class Shop {
    String brand;
    String type; 

    void show () {
        System.out.println(brand + " -> " + type);
        System.out.println(" ");
    }

    //! Non-Parameterized constructor
    Shop() {
        System.out.println("First Constructor call");
    }

}

class Men {
    String color;
    double height;

    void printdet() {
        System.out.println(color +" = "+ height + " inch");
    }

    //! Parameterized constructor
    Men(String color, double height) {
        System.out.println("Second Constructor call");
        this.color = color;
        this.height = height;
    }
    
}

class Women {
    String name;
    int age;

    void showdet() {
        System.out.println("name = " + this.name);
        System.out.println("age = " + this.age);
    }

    //! Copy constructor
    Women(Women w2) {
        this.name = w2.name;
        this.age = w2.age;

    }

    //! if we use copy constructor than we have to define another same constructor blank they do not define by default itself
    Women() {
    }

}

public class constructor {
    public static void main(String[] args) {
        //! new keyword create a space in memory to stored an object
        //! Shop "class name"() -> () parenthesis used for function, and with this keyword (Shop()) is also a function which is named as "Constructor" which means to construct or make and object in java.
        //! Constructor Types
        // Parameterized constructor
        // Non-Parameterized constructor
        // Copy constructor

        //! Properties to write a constructor
        // class and constructor name will be same
        // constructor is functions, methods but they do not return anything
        // constructor will call only once for an object

        // object 1
        Shop s1 = new Shop ();
        s1.brand = "Zara";
        s1.type = "Pant";

        s1.show();

        // object 2
        Men m1 = new Men("Fair", 5.5);
        m1.printdet();

        // object 3
        Women w1 = new Women();
        w1.name = "Nancy";
        w1.age = 23;

        // object 4
        //! obj 4 copy data of obj 3
        Women w2 = new Women(w1); // Copy parameters of w1 
        w2.showdet();

    }
    
}
