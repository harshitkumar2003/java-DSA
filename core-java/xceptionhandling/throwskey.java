package xceptionhandling;

class A {

    public void show() throws ClassNotFoundException {
       Class.forName("xceptionhandling.throwsky");
    }
}

public class throwskey {
    static {
        System.out.println("class loaded");
    }

    public static void main(String[] args) {
        A obj = new A();
         try {
            obj.show();
        
        } catch (ClassNotFoundException e) {
            System.out.println("Not able to find the class...");
            //! to print which method is calling which method or we can track the entired method call
            e.printStackTrace();
        }
        System.out.println("Program continues after handling exceptions.");
    }
}
