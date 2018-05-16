import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    public void testAnagramPositive() {

    assertTrue(anagram.Anagram("alma", "amla"));

    }

    @Test
    public void testAnagramNegative() {

        assertFalse(anagram.Anagram("alma", "körte"));

    }

    @Test
    public void testAnagramNull() {

        try {
            assertFalse(anagram.Anagram(null, null));
        } catch (NullPointerException npe) {
            System.out.println("Null values are not valid inputs!");
        }

    }
}