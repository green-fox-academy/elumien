import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %   %
        // %   %
        // %   %
        // %   %
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");

        int rowNumber = scanner.nextInt();

        int star = 1;

        int empty = rowNumber - 1;

        for (int i = 0; i < rowNumber; i++) {

            String square = "";

            if (i == 0 || i == rowNumber - 1) {
                for (int j = 0; j < rowNumber; j++) {
                    square += "%";
                }
            } else {
                square += "%";
                for (int j = 0; j < rowNumber - 2; j++) {
                    square += " ";
                }
                square += "%";
            }

            System.out.println(square);

        }
    }


}
