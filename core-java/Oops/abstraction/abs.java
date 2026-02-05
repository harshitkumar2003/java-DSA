package Oops.abstraction;
/*
!Abstraction in Java is an Object-Oriented Programming (OOP) concept where we hide the internal implementation details of a class and expose only the essential features to the user.

!It focuses on "what an object does" rather than "how it does it".
 
!Ways to Achieve: 
* Declared with the abstract keyword.
* Can have abstract methods (without body) and concrete methods (with body).
* Cannot be instantiated directly.
* Must be extended by a subclass that implements the abstract methods
*/

abstract class Music {
    public Music() {
        System.out.println("Music Constructor called...");
    }
    
    public abstract void pause();

    public void play() {   //! Concrete method
        System.out.println("Play Music...");
    }

}

//! Subclass implementing abstract method
class SanamRe extends Music {
    public SanamRe() {
        System.out.println("SanamRe Constructor called...");
    }
    public void pause() {
        System.out.println("Pause Music...");
    }

    public void lyrics() {
        System.out.println("Bheegee-bheegee sadakon par main intazaar karoon\r\n" + 
                        "Dheere-dheere dil kee zameen ko tera hee naam karoon\r\n" + 
                        "Khudakushee ko main yoon kho doon ki phir na kabhee paoon\r\n" +
                        "Haule-haule jindagee ko ab tumhaaree chhuttee karoon\r\n");
    }

}

public class abs {
    public static void main(String[] args) {
        SanamRe obj = new SanamRe();
        obj.pause();
        obj.play();
        obj.lyrics();
    }
}
