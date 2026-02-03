//! In hierarchical inheritance, more than one subclass is inherited from a single base class

class House {
    public House() {
        System.out.println("Parent constructor called");
    }
    public void display() {
        System.out.println(" Welcome to our house");
    }
}

class Bed extends House {
    public Bed() {
        System.out.println("Child 1 constructor called");
    }
}

class Kitchen extends House {
    public Kitchen() {
        System.out.println("Child 2 constructor called");
    }
}

public class Hireinh {
    public static void main(String[] args) {
        Kitchen kit = new Kitchen();
        kit.display();
     
    }
}
