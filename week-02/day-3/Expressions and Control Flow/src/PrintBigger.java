import java.util.Scanner;

public class PrintBigger
{
    public static void main(String[] args)
    {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two numbers!");

        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        if (int1 > int2)
        {
            System.out.println(int1);
        }
        else
        {
            System.out.println(int2);
        }
    }

}
