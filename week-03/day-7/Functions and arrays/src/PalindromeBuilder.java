public class PalindromeBuilder {

    public static void main(String[] args) {

        System.out.println(createPalindrome(""));
        System.out.println(createPalindrome("greenfox"));
        System.out.println(createPalindrome("123"));
    }

    private static String  createPalindrome(String word) {

        String reversedWord = new StringBuilder(word).reverse().toString();
        word += reversedWord;

        return  word;

    }


}
