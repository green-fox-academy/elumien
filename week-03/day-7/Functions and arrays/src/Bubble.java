import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `True` sort that list descending

        //  Example:
        System.out.println(Arrays.toString(bubble(new int[] {34, 12, 24, 9, 5})));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(advance0dBubble(new int[] {34, 12, 24, 9, 5}, true)));
        //  should print [34, 24, 12, 9, 5]
    }

    private static int[] bubble(int[] ints) {

        int length = ints.length;

        int temp;

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length; j++) {
                if (ints[j - 1] > ints[j]) {
                    temp = ints[j - 1];
                    ints[j - 1] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return ints;
    }

    private static int[] advance0dBubble(int[] ints, boolean b) {

        int length = ints.length;

        int temp;

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length; j++) {

                if(b) {
                    if (ints[j - 1] < ints[j]) {
                        temp = ints[j - 1];
                        ints[j - 1] = ints[j];
                        ints[j] = temp;
                    }
                }

                else {
                    if (ints[j - 1] > ints[j]) {
                        temp = ints[j - 1];
                        ints[j - 1] = ints[j];
                        ints[j] = temp;
                    }
                }
            }
        }
        return ints;
    }

}