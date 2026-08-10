// Assignment 9.2 Program 1
// Frederick Costello
// 08/07/2026
// The purpose of this program is to create a file with 10 random integers to it, and then read the integers back from the file.
// Resources: Visual Code Studio, Bellevue Videos "Darrell Payne", Apache Beans, Code Editor, GitHub Copilot, IntelliSense

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Data_File_Program_2 {
    public static void main(String[] args) {
        
        File file = new File("data.txt");
        Random rand = new Random();

        try {
            // Create a file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists. Appending to file.");
            }

            //Write to append 10 random integers to the file
            FileWriter writer = new FileWriter(file, true); // true = append mode
            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(100); // Generate random integer between 0 and 99
                writer.write(number + " ");
            }
            writer.close();
            System.out.println("Random integers written to file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            return;
        }

    // Reopen the file to read the integers
        try {
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNext()) {
                System.out.print(fileReader.next() + " ");
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
