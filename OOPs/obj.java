package OOPs;

class Car {
    String company;
    String color;

    void printcompany() {
        System.out.println(company);
    }

    void printcolor() {
        //! this keyword tells which object "variable" is called
        System.out.println(this.color);
    }
}

class Studentinfo {
    String name; 
    int age;

    void display() {
        System.out.println(this.name + " = " + this.age);
    }
}

public class obj {
    public static void main(String[] args) {
        //! object 1
        Car c1 = new Car();
        c1.color = "Black";
        c1.company = "BMW";

        //! object 2
        Car c2 = new Car();
        c2.color = "White";
        c2.company = "Skoda";

        //! calling method with different object of same class
        c1.printcolor();
        c2.printcolor();

        c2.printcompany();

        //! object 3
        Studentinfo s1 = new Studentinfo();
        s1.name = "Harshit";
        s1.age = 21;
        
        //! object 4
        Studentinfo s2 = new Studentinfo();
        s2.name = "Luv";
        s2.age = 22;

        //! calling method with different object of same class
        s1.display();
        s2.display();
    }
    
}
