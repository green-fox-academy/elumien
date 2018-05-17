import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    private static List<String> appendA(List<String> far) {

        List<String> plusA = new ArrayList<>();

        for (String s: far) {

            plusA.add(s+ 'a');
        }

        return plusA;
    }
}

// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"