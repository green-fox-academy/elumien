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

        String pyramid = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");

        int number = scanner.nextInt();
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******");

    }
}
