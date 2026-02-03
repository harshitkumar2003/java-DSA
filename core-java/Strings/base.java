package Strings;

//! String
//In Java, a String is an object that represents a sequence of characters.
//It is part of the java.lang package and is immutable, meaning once created, its value cannot be changed.

//! Key Points about Strings in Java
// Immutable – Any modification creates a new String object.
// Stored in String Pool – Java optimizes memory by storing string literals in a special pool.
// UTF-16 Encoding – Each character is stored using 16 bits.
// String Class – Provides many built-in methods for manipulation.

public class base {

    public static void main(String[] args) {
        // Creating strings
        //! 1. Using string literal (stored in String Pool)
        String str1 = "Hello";
        //System.out.println(str1); //Display strings

        //! 2. Using new keyword (stored in heap memory)
        String str2 = new String("World");
        //System.out.println(str2); //Display strings

        
    //! String Methods
    String text = "Hello Java";
    // length(): Returns the length of the string.
    System.out.println("Length: " + text.length());   // 10

    // toUpperCase() and toLowerCase(): Converts the string to upper case or lower case.
    System.out.println("Uppercase: " + text.toUpperCase());  // HELLO JAVA
    System.out.println("Lowercase: " + text.toLowerCase());  // hello java

    // indexOf(String str): Returns the index of the first occurrence of the specified substring.
    System.out.println("IndexOf: " + text.indexOf("a"));

    // substring(int beginIndex, int endIndex): Returns a new string that is a substring of the original string.
    System.out.println("Substring: " + text.substring(5));   // Java

    // charAt(int index): Returns the character at the specified index.
    System.out.println("Char at index 2: " + text.charAt(2));     // l

    // contains(): Returns the boolean value of specified value.
    System.out.println("Contains 'Java': " + text.contains("Java"));   // true

    // replace(char oldChar, char newChar): Replaces all occurrences of the specified old character with the new character.
    System.out.println("Replace: " + text.replace("Java", "C++"));  // C++ Programming
    
    //! String Comparison
    String a = "Harshit";
    String b = "Harshit";
    String c = new String ("Harshit");

    //! Use .equals() to compare string values.
    //! Use == only to compare object references.

    System.out.println(a == b);   //  true (same reference in String Pool)
    System.out.println(a == c);   // false (different object in heap)
    System.out.println(a .equals(c));  // true (compares values)

    }
}
