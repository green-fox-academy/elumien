public class Reverse {
// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};

        int[] ja = new int[5];

        for (int i = 0; i < aj.length; i++) {

            ja[i] = aj[4-i];

        }

        aj = ja;

        for (int number: aj) {
            System.out.println(number);
        }

    }

}
