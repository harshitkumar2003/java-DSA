package innerclass;

/*
! 3. Local Inner Class: 
A class defined within a method or a block of code. It has access to the final variables of the method or block in which it is defined.

* Defined inside a method, constructor, or block
* Cannot be static because they belong to the instance context
* Commonly used in event handling or callbacks, particularly inside GUI or multithreaded code
*/

//! Outer Class
class Mall {
    private  String item = "Jeans";
    private int budget = 3443;
    public void purchase() {
        //! Inner Class inside method
        class Shop {
            public String brand = "Levis";
            public void showPayment() {
                System.out.println("Payment History : \n" + "Item : " + item + "\n" + "Brand : " + brand + "\n" + "Total Amount : " + budget/2);
            }
        }

        Shop sh = new Shop();
        sh.showPayment();
    }
}


public class Localinnerclasse {
    public static void main(String[] args) {
        Mall m = new Mall();
        m.purchase();
    }
}
