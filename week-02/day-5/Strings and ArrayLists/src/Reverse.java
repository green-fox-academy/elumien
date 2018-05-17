import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.


        System.out.println(reverse(reversed));
        System.out.println(reverseStringBuilder(reversed));
    }

    public static String reverse(String text) {

        String reversedText = "";

        for (int i = text.length()-1; i >= 0; i--) {

            reversedText += text.charAt(i);

        }

        return reversedText;
    }


    public static String reverseStringBuilder(String text) {

        StringBuilder reversedText = new StringBuilder(text).reverse();

        text = reversedText.toString();

        return text;
    }

}