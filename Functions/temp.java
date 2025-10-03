package Functions;

import java.util.Scanner;

public class temp {
    static int[] arr = new int[0]; // ! Shared array across functions
    public static void main(String[] args) {
        quiz();
    }

public static void quiz() {
     Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Java Array Quiz:");
        System.out.println("PRESS 1 for Input array elements");
        System.out.println("PRESS 2 for Display array elements");
        System.out.println("PRESS 3 for Remove array elements");
        System.out.println("PRESS 4 for Add array elements");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                inputArray();
                break;
            case 2:
                displayArray();
                break;
            case 3:
                removeArray();
                break;
            case 4:
                addArray();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
        sc.close();
}

    public static void inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements inputted successfully.");
           System.out.println();
         quiz();
    }

    public static void displayArray() {
        if (arr.length == 0) {
            System.out.println("Array is empty. No elements to display.");
        } else {
            System.out.print("Array elements: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
   System.out.println();
         quiz();
    }

    public static void removeArray() {
        if (arr.length == 0) {
            System.out.println("Array is empty. No elements to remove.");
        } else {
            int newArr[] = new int[arr.length - 1];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            System.out.println("Last element removed successfully.");
        }
           System.out.println();
         quiz();
    }

    public static void addArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to add: ");
        int element = sc.nextInt();
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
        arr[arr.length - 1] = element;
        System.out.println("Element added successfully.");
        System.out.println();
         quiz();
    }
}
