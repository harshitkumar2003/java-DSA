package innerclass;

/*
! Abstract class and Anonymous class when we both using together
*/
//! Abstract class
abstract class Aba {
    public abstract void show();
    public abstract void display();
}

public class AbsAnonyclasse {
    public static void main(String[] args) {
        //! Anonymous class
        Aba obj = new Aba() {
            public void show() {
                System.out.println("In new Show ");
            } 
            public void display() {
                System.out.println("In new Display ");
            } 
        };
        obj.show();
        obj.display();
    }
}
