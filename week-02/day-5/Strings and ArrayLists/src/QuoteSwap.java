import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."

    }

    private static String quoteSwap(ArrayList<String> list) {

        int indexOfCannot = list.indexOf("cannot");
        int indexOfDo = list.indexOf("do");

        list.remove("cannot");
        list.remove("do");

        list.add(indexOfDo, "cannot");
        list.add(indexOfCannot, "do");

        String quote = list.toString();
        quote = quote.replace("[", "");
        quote = quote.replace("]", "");
        quote = quote.replace(",", "");

        return quote;

    }
}
