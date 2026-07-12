// Frederick Costello
// Assignment 5.2
// 07/11/2026
// Resources: Bellevue Videos "Darrell Payne", Apache Beans, Code Editor, Copilot
// Purpose: This Program calculates the location of the largest and smallest values in a 2D array of doubles and integers. 
// It uses two overloaded methods for each data type to find the locations of the largest and smallest values. 
// The main method demonstrates the functionality by creating sample arrays and printing the results.
// Resources: Bellevue Videos "Darrell Payne", Apache Beans, Visual Studio, Code Editor, Copilot



public class ArrayLocator_Mod_5 {

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {

        double[][] doubleArray = {
            {1.5, 3.2, 9.8},
            {4.4, 2.1, 7.7},
            {6.6, 5.5, 0.2}
        };

        int[][] intArray = {
            {4, 9, 2},
            {7, 1, 8},
            {3, 6, 5}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Largest (double[][]) located at: [" +
                largestDouble[0] + ", " + largestDouble[1] + "]");

        System.out.println("Smallest (double[][]) located at: [" +
                smallestDouble[0] + ", " + smallestDouble[1] + "]");

        System.out.println("Largest (int[][]) located at: [" +
                largestInt[0] + ", " + largestInt[1] + "]");

        System.out.println("Smallest (int[][]) located at: [" +
                smallestInt[0] + ", " + smallestInt[1] + "]");
    }
}
