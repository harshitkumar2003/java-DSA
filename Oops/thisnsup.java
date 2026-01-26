package Oops;

//! In java, super keyword is used to access methods of the parent class while this is used to access methods of the current class.

//! Note: We can use 'this' as well as 'super' any number of times but main thing is that we cannot use them inside static context. 

class Apple {
    public Apple() {
        System.out.println("Constructor A called ");
    }
    public Apple(int n) 
    {
        this();
        System.out.println("Constructor A in Parameter ");
    }
}
 class Ball extends Apple {
    public Ball() {
        super();
        System.out.println("Constructor B called ");
    }
    public Ball(int n) {
        super(2);
        System.out.println("Constructor B in Parameter ");
    }
 }

public class thisnsup {
    public static void main(String[] args) {
     Ball b = new Ball(2);
    }
}
