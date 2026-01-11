public class demo {
    public static void main(String[] args) {
        //! if you want to repeat something multiple times

        //! while loop and nested while loop
        int i = 1;
        while (i <= 4) {
            System.out.println("Hello " + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("java " + j);
                j++;
            }
            i++;
        }

        //! do while loop
        int k = 1;
        do { 
            System.out.println("Hi " + k);
            k++;
        } while (k <= 4);

        //! for loop
        for (int a = 1; a <= 4; a++) {
            System.out.println("Na " + a);
        }

        for (int b = 4; b >= 1; b--) {
            System.out.println("Ha " + b);
        }

        //! Nested for loop
        for (int c = 1; c <= 4; c++) {
            System.out.println("day " + c);
            for (int d = 1; d <= 9; d++) {
                System.out.println(" " + (d+8) + "AM - " + (d+9) + "PM");
            }
        }
    }
}
