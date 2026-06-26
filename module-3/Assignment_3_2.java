package Assignment_3_2;

public class Assignment_3_2 {

    public static void main(String[] args) {

        int totalRows = 7;
        int maxWidth = 31; // width of the numbers on the last row

        for (int row = 1; row <= totalRows; row++) {

            int currentWidth = 0;

            // CENTERING:
            for (int s = 0; s < (totalRows - row) * 2; s++) {
                System.out.print(" ");
                currentWidth++;
            }

            // LEFT SIDE
            int value = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(value + " ");
                currentWidth += String.valueOf(value).length() + 1;
                value *= 2;
            }

            // RIGHT SIDE
            value /= 4; 
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(value + " ");
                currentWidth += String.valueOf(value).length() + 1;
                value /= 2;
            }

            for (int pad = 0; pad < (maxWidth - currentWidth); pad++) {
                System.out.print(" ");
            }

            System.out.println("@");
        }
    }
}
