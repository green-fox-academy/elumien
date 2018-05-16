import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters countLetters = new CountLetters();

    @Test
    public void countLettersTest() {

        String string = "guineapig";
        HashMap<Character, Integer> expectedDictionary = new HashMap<>();
        expectedDictionary.put('g', 2);
        expectedDictionary.put('u', 1);
        expectedDictionary.put('i', 2);
        expectedDictionary.put('n', 1);
        expectedDictionary.put('e', 1);
        expectedDictionary.put('a', 1);
        expectedDictionary.put('p', 1);

        assertEquals(expectedDictionary, countLetters.countLetters(string));

    }
}