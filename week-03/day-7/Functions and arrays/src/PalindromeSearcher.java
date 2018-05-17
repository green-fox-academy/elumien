import java.util.ArrayList;

public class PalindromeSearcher {
    public static void main(String[] args) {

        System.out.println(palindromeSearch("dog goat dad duck doodle never"));
        System.out.println(palindromeSearch("apple"));
        System.out.println(palindromeSearch("racecar"));
        System.out.println(palindromeSearch(""));
}

    private static ArrayList<String> palindromeSearch(String text) {

        char[] wordCharacters = text.toCharArray();

        ArrayList<String> palindromes = new ArrayList<>();

        for (int i = 0; i < wordCharacters.length; i++) {

            for (int j = wordCharacters.length - 1; j > i + 1; j--) {

                String word ="";

                for (int k = i; k <= j; k++) {

                    word += wordCharacters[k];

                }

                //System.out.println(word);

                String reversedWord = new StringBuilder(word).reverse().toString();

                if(word.equals(reversedWord)) {
                    palindromes.add(word);
                }

            }
        }

        return palindromes;

    }


}