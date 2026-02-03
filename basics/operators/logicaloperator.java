public class logicaloperator {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 20;

        // Logical AND
        System.out.println("a > b && c > a: " + (a > b && c > a)); // true

        // Logical OR
        System.out.println("a < b || c > a: " + (a < b || c > a)); // true

        // Logical NOT
        System.out.println("!(a > b): " + !(a > b)); // false

        // Logical XOR
        System.out.println("a > b ^ c < a: " + (a > b ^ c < a)); // true

        // Non-short-circuit AND
        System.out.println("a > b & c > a: " + (a > b & c > a)); // true

        // Non-short-circuit OR
        System.out.println("a < b | c > a: " + (a < b | c > a)); // true
    }
    
}
