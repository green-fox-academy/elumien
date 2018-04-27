import java.util.Scanner;

public class DrawDiagonal {

    public static void main(String[] args) {
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
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

                for (int j = 0; j < rowNumber; j++) {
                    if (j == 0 || j == rowNumber - 1 || j==i) {
                        square += "%";
                    } else {
                        square += " ";
                    }
                }

            }

            System.out.println(square);

        }


    }

}
