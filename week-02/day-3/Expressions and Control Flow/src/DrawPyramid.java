import java.util.Scanner;

public class DrawPyramid
{
    public static void main(String[] args)
    {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

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
