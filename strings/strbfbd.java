package strings;

//! Overview
// Java provides three main classes to handle strings:

//! String → Immutable (cannot be changed after creation)
//! StringBuffer → Mutable, thread-safe (synchronized)
//! StringBuilder → Mutable, not thread-safe (faster)

//! Key Differences
/* 
Feature       |  	StringBuffer	             |      StringBuilder
Mutability	  |       Mutable	                 |        Mutable
Thread Safety |     Yes (synchronized)	         |  No (not synchronized)
Performance   | 	Slower (due to synchronization)|      Faster
Introduced In |	      JDK 1.0	                 |         JDK 1.5
Use Case	  |   Multi-threaded environments	 |  Single-threaded environments
*/

/* //! Both classes share the same methods:
append(String str) → Add text at the end.
insert(int offset, String str) → Insert text at a position.
replace(int start, int end, String str) → Replace part of the string.
delete(int start, int end) → Remove part of the string.
reverse() → Reverse the string.
capacity() → Get current buffer capacity.
ensureCapacity(int minCapacity) → Increase capacity if needed. */

public class strbfbd {
    public static void main(String[] args) {
        //! Using StringBuffer (Thread-safe)
        StringBuffer a = new StringBuffer("Hello");
        a.append(" Harshit");
        System.out.println("StringBuffer Output: " + a);  //  StringBuffer Output: Hello Harshit

        a.insert(5, "!");
        System.out.println("StringBuffer Output: " + a);  //  StringBuffer Output: Hello! Harshit

        a.replace(0, 5, "Hi");
        System.out.println("StringBuffer Output: " + a);  //  StringBuffer Output: Hi! Harshit

        a.delete(2, 3);
        System.out.println("StringBuffer Output: " + a);  //  StringBuffer Output: Hi Harshit

        //! Using StringBuilder (Faster, not thread-safe)
        //! If you don’t need thread safety, always prefer StringBuilder for better performance.
        StringBuilder b = new StringBuilder("Hello");
        b.append(" Harshit");
        System.out.println("StringBuilder Output: " + b);  //  StringBuilder Output: Hello Harshit

        b.insert(5, "!");
        System.out.println("StringBuilder Output: " + b);  //  StringBuilder Output: Hello! Harshit

        b.replace(0, 5, "Hi");
        System.out.println("StringBuilder Output: " + b);  //  StringBuilder Output: Hi! Harshit

        b.delete(2, 3);
        System.out.println("StringBuilder Output: " + b);  //  StringBuilder Output: Hi Harshit

        b.reverse();
        System.out.println("StringBuilder Output: " + b);  // StringBuilder Output: tihsraH iH

        StringBuffer sbf = new StringBuffer("Hell");
        StringBuilder sbd = new StringBuilder("Hello");

        //! Conversion between them requires converting to a String first:
        /*  //!StringBuffer to StringBuilder
        StringBuilder sbd = new StringBuilder(sbf.toString()); 
        \\ // ! StringBuilder to StringBuffer
        StringBuffer sbf = new StringBuffer(sbd.toString());  */
    }
    
}

