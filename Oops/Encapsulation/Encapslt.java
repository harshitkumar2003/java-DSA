package Oops.Encapsulation;
//! Encapsulation

import java.util.Scanner;

/*Encapsulation is achieved by declaring class variables as private and providing public getter and setter methods to access and modify them. This approach hides the internal implementation details while exposing only the necessary functionality.*/

/*Encapsulation ensures data hiding, which prevents unauthorized access to sensitive information. It enhances data integrity by allowing only validated data to be assigned through setter methods. Encapsulated code is more reusable and maintainable, as changes to internal implementations do not affect external code. It also improves security by controlling access to internal data. */
//! Key Rules:
// Declare data as private: Hide the class data so it cannot be accessed directly from outside the class.
// Use getters and setters: Keep variables private and provide public getter and setter methods for controlled access and safe modification, often with validation.
// Apply proper access modifiers: Use private for data hiding and public for methods that provide access.
//! 1. Encapsulation in Java
// Encapsulation is the OOP principle of hiding internal data and exposing only necessary functionality through public methods (getters/setters).
// Data members are usually marked private.
// Access is provided via public methods.
// This improves security, maintainability, and flexibility.
//! 2. this Keyword
// Refers to the current object.
// Common uses:
// Differentiate between instance variables and method parameters with the same name.
// Call another constructor in the same class (this(...)).
// Pass the current object as a parameter.
//! 3. Private Methods
// Declared with the private access modifier.
// Accessible only within the same class.
// Often used for internal helper logic that should not be exposed to other classes.

class Human {

    private String color = "fair";
    private int bones = 206;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBones() {
        return bones;
    }

    public void setBones(int bones) {
        this.bones = bones;
    }

}

class School {
    private String name;
    private String city;
    private int pincode;

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name.equals("MIET") || name.equals("MIT")) {
            this.name = name;
            return true;
        }
        return false;
    }

    public String getCity() {
        return city;
    }

    public boolean setCity(String city) {
        if (city != null && city.length() > 5) {
            this.city = city;
            return true;
        }
        return false;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

}

public class Encapslt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Human h = new Human();
        // h.color = "Dark";
        // h.bones = 206;
        // h.setColor("Dark");
        // h.setBones(206);
        School s = new School(); // object
        // user input
        System.out.println("enter the name");
        String name = sc.nextLine();
        System.out.println("enter the city");
        String city = sc.nextLine();
        System.out.println("enter the pincode");
        int pincode = sc.nextInt();

        // calling
        boolean isNameValid = s.setName(name);
        boolean isCityValid = s.setCity(city);
        s.setPincode(pincode);

        if (isNameValid && isCityValid) {
            System.out.println(s.getName() + " : " + s.getCity() + " ; " + s.getPincode());
        } else {
            System.out.println("Invalid data cannot print values");
        }
    }
}
