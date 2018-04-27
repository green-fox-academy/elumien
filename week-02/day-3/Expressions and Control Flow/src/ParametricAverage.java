import java.util.Scanner;

public class ParametricAverage {
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
    public static void main(String[] args) {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number!");

        int number = scanner.nextInt();

        System.out.println("Give me "+ number +" numbers!");

        for (int i = 0; i < number; i++) {
            sum += scanner.nextInt();
        }

        double average = sum/number;

        System.out.println("Sum: " + sum + ", Average: " + average);


    }
}
