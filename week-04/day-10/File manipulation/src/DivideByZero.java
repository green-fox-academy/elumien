public class DivideByZero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0

    public static void main(String[] args) {

        division(0);
    }

    private static void division(int divisor) {

        try {
            int quotient = 10/divisor;
            System.out.println(quotient);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }


    }


}
