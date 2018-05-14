import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {

        Anagram a = new Anagram();
        a.Anagram("alma", "körte");

    }

    public boolean Anagram(String string1, String string2) {

        char[] stringCharArray = string1.toCharArray();

        List stringCharList = Arrays.asList(stringCharArray);

        Collections.reverse(stringCharList);

        string1 = stringCharList.toString();

        System.out.println(string1);

        return true;
    }



}
