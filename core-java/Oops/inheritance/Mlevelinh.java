//! In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also acts as the base class for other classes.

class Computer {
    public void type() {
        System.out.println("I can type ");
    }
    public void snakeGame() {
        System.out.println("I can play snake game");

    }
}

class Tablet extends Computer {
    public void videocall() {
        System.out.println("I can videocall");

    }
    public void apps() {
        System.out.println("I can use an apps");

    }
}

class Laptop extends Tablet {
    public void editing() {
        System.out.println("I can editing");

    }
    public void meetings() {
        System.out.println("I can do meetings");

    }
}

public class Mlevelinh {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        lap.type();
        lap.snakeGame();
        lap.videocall();
        lap.apps();
        lap.editing();
        lap.meetings();
    }
}
