import java.util.Scanner;

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

public class hide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        School s = new School();  //object
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
        
        if(isNameValid && isCityValid) {
            System.out.println(s.getName() + " : " + s.getCity() + " ; " + s.getPincode());
        } else {
            System.out.println("Invalid data cannot print values");
        }

    }
    
}