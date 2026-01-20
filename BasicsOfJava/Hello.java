
public class Hello {
    public static void main(String[] args) {
        //! Printing hello world in console
        System.out.println("Hello java how are you!");

        //! Perform operation in console without variable
        System.out.println(3 + 5);

        //! Performing operation using variable
        int num1 = 5;
        int num2 = 7;
        int result = num1 + num2;
        System.out.println(result);

        //! Data Types
        char grade = 'a';
        double prize = 23.12;
        boolean bi = true;
        byte by = 100;
        // short num1 = 12243;
        // long num2 = 355565777;
        System.out.println(grade);
        System.out.println(prize);
        System.out.println(bi);
        System.out.println(by);
        // System.out.println(num1);
        // System.out.println(num2);

        //! Type Casting
        int val = 97;
        char v = (char) val;
        float range = val;
        // double range = val;
        double a = 1.1;
        // int b = (int) a;
        char c = 'D';
        // int n = (int) c;
        // System.out.print(n);

        //! Arithmetic Operators
        int v1 = 31;
        int v2 = 22;
        int sum = v1 + v2;
        System.out.println(sum);
        int sub = v1 - v2;
        System.out.println(sub);
        int pro = v1 * v2;
        System.out.println(pro);
        int div = v1 / v2;
        System.out.println(div);
        int rem = v1 % v2;
        System.out.println(rem);
        
        //! Comparison Operator and 
        // boolean com = v1 > v2;
        // boolean com = v1 < v2;
        // boolean com = v1 >= v2;
        // boolean com = v1 <= v2;
        // boolean com = v1 == v2;
        boolean com = v1 != v2;
        System.out.println(com);
        
        //! Logical Operator (mostly used)
        // boolean lcom = v1 > v2 && num1 < num2;  //! AND
        boolean lcom = v1 < v2 || num1 < num2; //! OR  
        System.out.println(lcom);

        //!if-else (Conditional Statments)
        int Num = 4;
        //! if
        if (Num > 2) {
          System.out.println("Hello");
        } 

        //! if-else
        if (Num < 2) {
            System.out.println("Hello");
        } else {
            System.out.println("Namaste");
        }

        //! Nested if-else
        if (Num > 4) {
            System.out.println("Hello");
        } else if (Num < 2) {
            System.out.println("Namaste");  
        } else {
            System.out.println("Bonjour");
        }

        //! Ternary Operator
        int tot = Num%2==0? 10: 20;
        System.out.println(tot);

        //! Switch Statement e a
        //TODO_In new java many feature are added like switch without break in shorter version
        int day = 6;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Ssturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("enter a valid number");
        }

    //! Advance switch java 12 version
    //TODO_And it supports string also, old releases does not support string in switch
    String dayname = "Monday";
    String op = "";
    switch (dayname) {
        case "Monday" -> op = "roti";
        case "Tuesday" -> op = "chawal";
        default -> op = "oats";
    }
    System.out.println(op);

    //! Advance switch 12 version
    //TODO_We can also use switch as a expression
    String daynamee = "Tuesday";
    String opt = "";
    opt = switch (daynamee) {
        case "Monday" -> "roti";
        case "Tuesday" -> "chawal";
        default -> "oats";
    };
    System.out.println(opt);

    //! Advance switch 12 version
    //TODO_Use switch as a expression but do not want arrow instead we want colon (:) so we use (yield)
    String dy = "Legday";
    String oupt = "";
    oupt = switch (dy) {
        case "Monday": yield "roti";
        case "Tuesday": yield "chawal";
        default: yield "oats";
    };
    System.out.println(oupt);

    }
}