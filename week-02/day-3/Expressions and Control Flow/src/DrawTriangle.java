import java.util.Scanner;

public class DrawTriangle
{
    public static void main(String[] args)
    {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        String triangle = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number!");

        int number = scanner.nextInt();



        for (int i = 0; i < number ; i++)
        {
            triangle += "*";
            System.out.println(triangle);
        }
    }

}
