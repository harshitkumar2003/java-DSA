//! Lambda Expression only works with @FunctionalInterface

@FunctionalInterface
interface La {

    void output();
}

@FunctionalInterface
interface Top {

    public void show(int i);
}

@FunctionalInterface
interface Cal {
    public int add(int i, int j);
}

public class Lambdafn {

    public static void main(String[] args) {
        //! Instead of this 
        // La l = new La() {
        //     public void output() {
        //         System.out.println("in lambda function");
        //     }
        // };
        //! we use lambda expression for clean and shorten the code for better readability
        La l = () -> System.out.println("Shorten code in one line using Lambda Expression...");
        l.output();

        //! Lambda Expression using Parameters
        //* */ Top t = (int i, int j) -> System.out.println("Lambda using Parameters. : " + i  + " : " + j);
        //t.show(3, 2);

        //! In Lambda using Parameters in main class we do not need to mention variable type we have already define in interface
        //* */ Top t = (i) -> System.out.println("Lambda using Parameters. : " + i  + " : " + j);

        //!  We can also remove curly brackets if we have one parameter
        Top t =  i -> System.out.println("Lambda using Parameters. : " + i);
        t.show(3);

        //! Lambda Expression with return
        // Cal c = new Cal() {
        //     public int add(int i, int j) {
        //         return i + j;
        //     }
        // };

        //* when we use return we do not need to write return if we have single statement in lambda expression
         Cal c = (i, j) ->  i + j;
           
         int result = c.add(4, 4);
         System.out.println("Addition of two values :" + result);

    }
}
