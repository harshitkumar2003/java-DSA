//! In hierarchical inheritance, more than one subclass is inherited from a single base class

class Car {
    Car() {
        System.out.println("This is a Car");
    }
}

class Engine extends Car  {
    Engine() {
        System.out.println("This Engine in Car");
    }
}

class Tyres extends Car {
    Tyres() {
        System.out.println("This Tyre in Car");
    }
}


public class Hireinh {
    public static void main(String[] args) {
        Engine eng = new Engine();
        Tyres tyr = new Tyres();
       
    }
}
