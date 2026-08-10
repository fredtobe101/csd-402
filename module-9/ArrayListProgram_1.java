// Assignment 9.2 Program 1
// Frederick Costello
// 08/07/2026
// The purpose of this program is to demonstrate the use of an ArrayList in Java.
// It creates an ArrayList of Strings, populates it with 10 elements, and allows the user to retrieve an element by its index. 
// The program also includes error handling for invalid input or out-of-bounds access.
// Resources: Visual Code Studio, Bellevue Videos "Darrell Payne", Apache Beans, Code Editor, GitHub Copilot, IntelliSense



import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram_1 {
    public static void main(String[] args) {
        
        //Creating an ArrayList with 10 String elements
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Elderberry");
        items.add("Fig");
        items.add("Grape");
        items.add("Honeydew");
        items.add("Kiwi");
        items.add("Lemon");

        // Using "for-each" loop
        System.out.println("ArrayList content:");
        for (String s : items) {
            System.out.println(s);
        }
        // Ask the user which element they want to see again
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element you want to see again: ");
        // User will enter a string then AutoBoxing will convert it to an integer
        String input = scanner.nextLine();

        try {
            // AutoBoxing: String to Integer conversion
            Integer indexObject = Integer.valueOf(input);
            // Auto-unboxing: Integer to int conversion
            int index = indexObject;

            // Attempt to print the element
            System.out.println("Element at index " + index + ": " + items.get(index));
        } catch (Exception e) {
            // Catch invalid index or invalid number format
            System.out.println("Exception occurred: Out of bounds or invalid input");
        }

        scanner.close();
    }
}