

/*
! In Java, an enum (short for enumeration) is a special data type used to define a fixed set of named constants.
! Enums improve readability, type safety, and maintainability compared to using plain constants.
! Enums can be used in switch statements to handle different cases based on the enum constants.
! Enums can declare abstract methods that each constant must implement.
! Enums can have constructors and methods, executed separately for each constant
! Enums can also be declared inside a class but not inside a method.
! We can combine enums with regular classes to organize your program logic. An enum can be a member variable in a class, and methods can perform actions based on the enum value.

EnumSet.range() allows iteration over a specific range of enum constants.
ordinal() => Method – will give you the index of constants
values() => Method – Returns an array of all enum constants
 */

//! Enum declaration
enum Body {
    Hair, Head, Eyes, Ears, Nose, Lips, Neck, Shoulder, Chest, Hand;
}

enum Color {
    RED, BLUE, GREEN, BLACK, YELLOW, PURPLE, WHITE, PINK;
}

enum Laptop {
    HP(4600), MacBook(4800), Asus(3000), Dell(2800), VivoBook;

    private int price;

    //! In some case we don't know the price of laptop like VivoBook = then we take non-parameterized constructor
    private Laptop() {
        price = 500;
    }

    // Parameterized constructor passing values
    private Laptop(int price) {
        this.price = price;
    }
    
    // Getters and Setters for price due to private
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Method for enum
    public void show() {
        System.out.println("My favourite Laptop : " + this);
    }
}

public class sdaty {
    public static void main(String[] args) {
        Body[] by = Body.values();
       //! Iterating Enums Using values()
        for (Body bo : by) {
            // System.out.println(bo + " : " + bo.ordinal());
        }
        
        //! Enum in a Switch Statement
        Color c = Color.RED;
        switch (c) {
            case RED -> System.out.println("MY FAVOURITE COLOUR IS RED...");
            case BLUE -> System.out.println("MY FAVOURITE COLOUR IS BLUE...");
            case GREEN -> System.out.println("MY FAVOURITE COLOUR IS GREEN...");
            case BLACK -> System.out.println("MY FAVOURITE COLOUR IS BLACK...");
            case YELLOW -> System.out.println("MY FAVOURITE COLOUR IS YELLOW...");
            case PURPLE -> System.out.println("MY FAVOURITE COLOUR IS PURPLE...");
            case WHITE -> System.out.println("MY FAVOURITE COLOUR IS WHITE...");
            case PINK -> System.out.println("MY FAVOURITE COLOUR IS PINK...");
            default -> System.out.println("OTHER COLOUR");
               
        }

        //! Enum as a class with constructor and method
        Laptop l = Laptop.HP;
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice() + "$");
        }
        l.show();
    }
}
