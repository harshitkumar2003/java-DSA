

    class Parent {
        void show() {
            System.out.println("Hi");
        }
    }

    class Child extends Parent {
     
    }

    public class Sinh {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
    }
}