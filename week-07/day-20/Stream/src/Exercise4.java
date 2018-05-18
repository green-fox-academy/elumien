import java.util.ArrayList;
import java.util.Arrays;

public class Exercise4 {

    public static void main(String[] args) {

        //Write a Stream Expression to find which number squared value is more then 20 from the following array:

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        numbers.stream().map(n -> Math.pow(n, 2)).forEach(System.out::println);

    }


}
