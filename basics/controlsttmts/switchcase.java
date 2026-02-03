package controlsttmts;

public class switchcase {
    public static void main(String[] args) {
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
