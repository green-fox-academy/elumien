import java.util.*;

public class ElementFinder {
    public static void main(String... args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        System.out.println(containsSeven2(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }

    private static String containsSeven(ArrayList<Integer> arrayList) {

        if (arrayList.indexOf(7) == -1) {
            return "Noooooo";
        } else {
            return "Hoorray";
        }

    }

    private static String containsSeven2(ArrayList<Integer> arrayList) {
        if (arrayList.contains(7)) {
            return "Hoorray";
        } else {
            return "Noooooo";
        }

    }
}