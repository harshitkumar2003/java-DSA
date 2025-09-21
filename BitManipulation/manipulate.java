package BitManipulation;

public class manipulate {
    public static void main(String[] args) {
// bit manipulation
        //! get bit
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1 << pos;

        // if ((bitMask & n) == 0) {
        //     System.out.println("bit was zero");

        // } else {
        //     System.out.println("bit was one");
        // }

        //! set bit
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        //! clear bit
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        //! update bit 
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);


    }

}
