import java.util.Scanner;

public class AverageOfInput
{
    public static void main(String[] args)
    {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me 5 whole numbers!");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();
        int int5 = scanner.nextInt();

        int sum = int1 + int2 + int3 + int4 + int5;
        int average = sum / 5;

        System.out.println("Sum: "+ sum +", Average: "+ average +"");
    }
}
