import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {


    public boolean Anagram(String string1, String string2) {

        char[] stringCharArray = string1.toCharArray();

        char[] stringCharArrayReversed = new char[stringCharArray.length];

       for (int i = 0; i < stringCharArray.length; i++) {

           stringCharArrayReversed[i] = stringCharArray[stringCharArray.length-1-i];
       }

        string1 = new String(stringCharArrayReversed);

        return string1.equals(string2);
    }



}