// Assignment 8.2 Programming Assignment
// Frederick Costello
// 08/01/2026
// File Name: FredArrayListTest.java
// -----------------------------------------
// Purpose: The purpose of this assignment is to create a method that finds the largest number in an ArrayList of integers. 
// The method will be tested with user input, and the largest number will be displayed.
// Resources: Bellevue Videos "Darrell Payne", Apache Beans, Code Editor, Google, Copilot

import java.util.ArrayList;
import java.util.Scanner;


public class FredArrayListTest {

public static Integer max(ArrayList<Integer> list) {
    if (list == null || list.isEmpty()) {
        return 0; // Return 0 if the list is null or empty
    }
    Integer largest = list.get(0);
    for (Integer value : list) {
        if (value > largest) {
            largest = value;
        }
    }
    return largest;
}

// ---------------------------------------------------------
// Testing the method according to assignment instructions
// ---------------------------------------------------------
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    System.out.println("Enter integers (0 to finish):");

    while (true) {
        int num = input.nextInt();
        numbers.add(num); // 0 is also added
        if (num == 0) {
            break; // Exit the loop if 0 is entered
        }
        
    }
    Integer largestNumber = max(numbers);
    System.out.println("The largest number is: " + largestNumber);
    input.close();
    }
    
}





