public class Fibonacci {

    //Write a function that computes a member of the fibonacci sequence by a given index
    //Create tests that covers all types of input (like in the previous workshop exercise)


    public int Fibonacci(int index){

        if(index == 1 || index == 2) {
            return 1;
        }

        else {
            return Fibonacci(index-1) + Fibonacci( index-2);
        }

    }

}
