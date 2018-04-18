//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

public class Sum {
    public static void main(String[] args) {

        int an = 5;
        System.out.println(sum(an));

    }

    private static int sum(int param) {

        int sum = 0;

        for (int i = 1; i <= param; i++) {
            sum+= i;
        }

        return sum;
    }
}
