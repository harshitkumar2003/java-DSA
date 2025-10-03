package Strings;
public class cocatenate {
    public static void main(String[] args) {
        // concatenation
        String first = "Harshit";
        String last = "Kumar";
        String fullname = first + " " + last;
        System.out.println(fullname); // Harshit Kumar

        // this function calculate the length of a string
        System.out.println(fullname.length()); // 13 including white space

        // this function read the full string character by character using for loop
        for(int i = 0; i < fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
