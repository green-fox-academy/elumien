import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    Sum sum = new Sum();

    @Test
    public void testSumWithNormalArrayList() {

        ArrayList<Integer> numbers =  new ArrayList<>(Arrays.asList(1,2,3,4,5));

        assertEquals(15,sum.sum(numbers));

    }

    @Test
    public void testSumWithEmptyArrayList() {

        ArrayList<Integer> numbers =  new ArrayList<Integer>();

        assertEquals(0,sum.sum(numbers));

    }

    @Test
    public void testSumWithOneElementArrayList() {

        ArrayList<Integer> numbers =  new ArrayList<Integer>();
        numbers.add(13);

        assertEquals(13,sum.sum(numbers));

    }

    @Test
    public void testSumWithNullArrayList() {

        ArrayList<Integer> numbers =  null;

        try {
            sum.sum(numbers);
        } catch (NullPointerException npe) {
            System.out.println("You cannot sum a null Array List!");
        }

    }

}