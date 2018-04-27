public class PalindromeSearcher {
    public static void main(String[] args) {

    System.out.println(palindromeSearch("dog goat dad duck doodle never"));
    System.out.println(palindromeSearch("apple"));
    System.out.println(palindromeSearch("racecar"));
    System.out.println(palindromeSearch(""));
}

    private static String palindromeSearch(String word) {

        //mehh mehh mehh

        String reversedWord = new StringBuilder(word).reverse().toString();
        word += reversedWord;

        return  word;

    }


}