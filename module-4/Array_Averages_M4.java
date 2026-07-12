// Assignment 4.2
// Frederick Costello
// 07/04/2026
// Resources: Bellevue Videos "Darrell Payne", Apache Beans, Code Editor, Copilot
// Purpose: This Program calculates the average of an array of numbers. The program includes overloaded methods to handle arrays of different data types (short, int, long, double). 
// Each method calculates the average by summing the elements of the array and dividing by the number of elements. 
// The main method tests these average methods with sample arrays and displays the results.
// Resources: Bellevue Videos "Darrell Payne", Apache Beans, Code Editor, Copilot


public class Array_Averages_M4 {

    // Average for short[]
    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short)(sum / array.length);
    }

    // Average for int[]
    public static int average(int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int)(sum / array.length);
    }

    // Average for long[]
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Average for double[]
    public static double average(double[] array) {
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Test program
    public static void main(String[] args) {

        short[] shortArray = {1, 5, 22, 8, 10};
        int[] intArray = {2, 6, 6, 9};
        long[] longArray = {10003, 2055, 7500, 4855, 5436};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        System.out.println("Short Array:");
        displayArray(shortArray);
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nInt Array:");
        displayArray(intArray);
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLong Array:");
        displayArray(longArray);
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDouble Array:");
        displayArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    // Overloaded display methods for readability
    public static void displayArray(short[] array) {
        for (short value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void displayArray(long[] array) {
        for (long value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void displayArray(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
