package innerclass;

/*
!In Java, an inner class (also called a nested class) is a class defined inside another class.
!It is mainly used to logically group classes, improve encapsulation, and make code more readable.

!Types of Inner Classes in Java

! 1. Non-static Inner Class (Member Inner Class)
* Defined inside another class without the static keyword.
* Can access all members (including private) of the outer class.
* Requires an instance of the outer class to be created.
 */

//! Outer class
class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

//! Inner class
    class Engine {
        public void start() {
            if(!isEngineOn) {       //! Can access private members of outer class
                isEngineOn = true;
                System.out.println(model + " Engine is start now...");  
            } else {
                System.out.println(model + " Engine is alreeady started...");
            }
        }

        public void stop() {
            if(isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " Engine is stop now...");
            } else {
                System.out.println(model + " Enigne is already stop...");
            }
        }
    }
}

public class MemberInnerclasse {
    public static void main(String[] args) {
        Car car = new Car("BMW"); //! Create outer object
        Car.Engine eng = car.new Engine();    //! Create inner object using an instance of the outer class
        eng.start();
        eng.stop();
    }
}
