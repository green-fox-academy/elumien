public class Counter {

//    Create Counter class
//    which has an integer field value
//                    when creating it should have a default value 0 or we can specify it when creating
//    we can add(number) to this counter another whole number
//    or we can add() without parameters just increasing the counter's value by one
//    and we can get() the current value
//    also we can reset() the value to the initial value

    int counter;
    int initialValue;

    public Counter(int counter) {
        this.counter = counter;
        this.initialValue = counter;
    }

    public Counter() {
        this.counter = 0;
        this.initialValue = 0;
    }

    public void add(int number)
    {
        this.counter+= number;
    }

    public int get()
    {
        return this.counter;
    }

    public void reset()
    {
        this.counter = this.initialValue;
    }
}
