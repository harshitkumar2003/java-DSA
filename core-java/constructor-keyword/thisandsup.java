//! In java, super keyword is used to access methods of the parent class while this is used to access methods of the current class.

//! Note: We can use 'this' as well as 'super' any number of times but main thing is that we cannot use them inside static context. 

class ACons {
    public ACons() {
        System.out.println("Constructor A called ");
    }
    public ACons(int n)
    {
        this();
        System.out.println("Constructor A in Parameter ");
    }
}
 class BCons extends ACons {
    public BCons() {
        super();
        System.out.println("Constructor B called ");
    }
    public BCons(int n) {
        super();
        System.out.println("Constructor B in Parameter ");
    }
 }

public class thisandsup {
    public static void main(String[] args) {
     BCons b = new BCons(2);
    }
}
