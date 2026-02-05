package innerclass;

/*
! 4. Anonymous Inner Class
* The class is declared within another class, usually for immediate use
* It's generally used where a short-lived class is needed.
* Ideal when you need to implement only one instance of a class.
*/

//! Outer class
class A {
    public void show() {
        System.out.println("In A Show ");
    }
}

//! Instead of them need to implement only one
// class B extends A {
//     public void show() {
//         System.out.println("In B Show ");
//     }
// }

public class Anonymousclasse {
    public static void main(String[] args) {
        //! Anonymous Class
        A obj = new A()
        {  //! Inner Class
            public void show() {
                System.out.println("In new Show ");
            } 
        };
        obj.show();
    }
}
