import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");

        int rowNumber = scanner.nextInt();

        int star = 1;

        int empty = rowNumber-1;

        for (int i = 0; i < rowNumber; i++)
        {
            String pyramid = "";

            for (int j = 0; j < empty; j++) {
                pyramid += " ";
            }

            for (int k = 0; k < star; k++) {
                pyramid += "*";
            }

            System.out.println(pyramid);

            empty -= 1;
            star += 2;
        }


    }

}

