/*
! In Java, an enum (short for enumeration) is a special data type used to define a fixed set of named constants.
! Enums improve readability, type safety, and maintainability compared to using plain constants.
 */

enum Body {
    Hair, Head, Eyes, Ears, Nose, Lips, Neck, Shoulder, Chest, Hand;
}
public class sdaty {
    public static void main(String[] args) {
        Body by = Body.Ears;
        System.out.println(by);
    }
}
