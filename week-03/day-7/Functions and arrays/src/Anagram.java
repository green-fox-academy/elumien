public class Anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("dog", "god"));
        System.out.println(isAnagram("green", "fox"));

    }

    private static boolean isAnagram(String word1, String word2) {

        String reversedWord1 = new StringBuilder(word1).reverse().toString();

        boolean isAnagram = reversedWord1.contentEquals(word2);

        return isAnagram;
    }
}
