 public class KilometersToMiles {
     public static void main(String[] args)       
        Scanner scanner = new Scanner(System.in); 
System.out.print("Enter distance in kilometers: ");
         double kilometers = scanner.nextDouble();
       
        double miles = kilometers * 0.621371;
        double miles = kilometers / 1.6;      
         System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        scanner.close(); // Close the Scanner object
    }
} {
    
}
