import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    static Random rnd = new Random();

    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        int number = rnd.nextInt(101);

        int guessedNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number!");


        do {
            guessedNumber = scanner.nextInt();

            if (number == guessedNumber) {
                System.out.println("You found the number: " + number);
            } else if (guessedNumber > number) {
                System.out.println("The stroed number is lower");
            } else {
                System.out.println("The stored number is higher");
            }
        } while (number != guessedNumber);

        System.exit(0);


    }

}
