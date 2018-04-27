import java.util.stream.IntStream;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    private static String unique(int[] ints) {

        int[] uniqueInts = IntStream.of(ints).distinct().toArray();

        String uniqIntsString = "[" + uniqueInts[0];

        for (int i = 1; i < uniqueInts.length; i++) {

            uniqIntsString+=", "+uniqueInts[i];
        }

        uniqIntsString += "]";

        return uniqIntsString;
    }
}