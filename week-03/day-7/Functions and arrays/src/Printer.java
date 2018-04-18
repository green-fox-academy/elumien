//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...

public class Printer {

    public static void main(String[] args) {

        printer("first");
        printer("first", "second");
        printer("first", "second", "third", "fourth");
    }

    private static void printer(String... strings) {

        for (String word: strings)
        {
            System.out.println(word);
        }
    }
}
