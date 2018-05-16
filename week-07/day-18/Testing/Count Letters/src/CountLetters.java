import java.util.*;
import java.util.stream.IntStream;

public class CountLetters {

    public static void main(String[] args) {

        CountLetters cl = new CountLetters();

        System.out.println(cl.countLetters("makrómikróba").toString());
    }

    //Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
    //Create a test for that.

    public HashMap<Character, Integer> countLetters(String string) {

        HashMap<Character, Integer> dictionary = new HashMap<>();

        string = string.toLowerCase();

        char[] stringCharArray = string.toCharArray();

        Set<Character> characterSet = new HashSet<>();

        for (char c : stringCharArray) {

            characterSet.add(c);
        }


        for (char ditinctCharachter: characterSet) {

            int count = 0;

            for (char Charachter : stringCharArray) {

                if (ditinctCharachter == Charachter) {
                    count++;
                }
            }

            dictionary.put(ditinctCharachter, count);
        }

        return dictionary;
    }

}
