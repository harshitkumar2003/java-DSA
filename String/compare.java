package String;

public class compare {
    public static void main(String[] args) {
        // compare
        String name1 = "Harshit";
        String name2 = "Kumar";

        // s1 > s2 = +ve value
        // s1 == s2 = 0 value
        // s1 < s2 = -ve value

         if (name1.compareTo(name2) == 0) {
             System.out.println("Strings are equal");
         } 
         else if (name1.compareTo(name2) > 0) {
             System.out.println("String 1 is greater then String 2");
         }
         else {
             System.out.println("String 1 is less then String 2");
         }

        // if (name1 == name2) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("String 1 is less then String 2");
        // }

        // if (new String ("Harshit") == new String("Kumar")) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("String 1 is less then String 2");
        // }
      }
}
