package bufferedreader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
! BufferedReader is a class in Java that reads text from a character-input stream, buffering characters to provide efficient reading of characters, arrays, and lines. It is part of the java.io package and extends the Reader class.

?Buufered Reader (OLDER)
When reading large text files or multiple lines from input.

?Scanner (UPDATED)
When you need better performance than Scanner for plain text reading.

! Key Points:
1. BufferedReader reads text efficiently by buffering characters.
2. readLine() reads until a newline or end-of-stream.
3. Always close resources (here, using try-with-resources).
*/
public class buffread {
    public static void main(String[] args) {
        // Wrap System.in with InputStreamReader and BufferedReader
        System.out.println("Enter a number: ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))  {
            // We have 2 option first we use String datatype for user input it support only String and secon we can use parseInt()
            // String n = br.readLine();   //! using string
            int n = Integer.parseInt(br.readLine());   //! using parseInt
            System.out.println(n);  
            
            //! hence we know BufferedReader is a resource so its our responsibility to close it (not compulsory) but its leaking resources
            br.close();
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
        
        //! Scanner class in Java is a part of the java.util package and is used to obtain input of various types from the user. It provides methods to read different types of data such as strings, integers, and doubles from various input sources like keyboard input, files, and streams.
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num);
        */
    }
}
