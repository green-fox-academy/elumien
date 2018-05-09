import java.util.Arrays;

public class Domino implements Comparable{
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Object o) {

        double difference = this.getValues()[0] - ((Domino)o).getValues()[0];

        difference+= this.getValues()[1] - ((Domino)o).getValues()[1];


        return 0;
    }
}