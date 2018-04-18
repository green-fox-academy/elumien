//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorio {

    public static void main(String[] args) {

        int ao = 5;

        ao = factorio(ao);

        System.out.println(ao);
    }

    private static int factorio(int ao) {

        int factor = 1;

        for (int i = 1; i <= ao; i++) {
            factor *= i;
        }

        return factor;
    }
}
