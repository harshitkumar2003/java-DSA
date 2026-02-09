

@FunctionalInterface
interface Lunch {
    public void big();
}

public class functionalinterface {
    public static void main(String[] args) {
        Lunch a = new Lunch(){
            public void big() {
                System.out.print("I'm the functional interface");
            }
        };
        a.big();

    }
}
