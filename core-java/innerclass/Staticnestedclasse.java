package innerclass;

/*
! 2. Static Nested Class

* Declared with the static keyword.
* Can access only static members of the outer class directly.
* Does not require an instance of the outer class.
*/

class Computer {
    static String brand = "HP";
    static String model = "Pavillion14";
    static OpSy os;  //! static reference variable for the nested class.

     static class OpSy {

        public void showInfo() {
            System.out.println("Computer Brand " + brand + " : Computer Model " + model);
        }
    }
}

public class Staticnestedclasse {
    public static void main(String[] args) {
        Computer.os = new Computer.OpSy();   //! initialize static reference variable
        Computer.os.showInfo();
    }
}
