

//! 2. Runtime Polymorphism (Method Overriding)


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
    void print() {
        System.out.println("Subchild class");
    }

}

public class RtimePolymorphism {
    public static void main(String[] args) {
        Shapes sh = new Shapes();
        sh.print();
    }
    
}
