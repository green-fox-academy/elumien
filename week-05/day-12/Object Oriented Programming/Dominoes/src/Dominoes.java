import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);
        System.out.println(orderDominoes(dominoes));

    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    static List<Domino> orderDominoes(List<Domino> originalOrder) {
        List<Domino> newOrder = new ArrayList<>();

        int valueA;
        int valueB;

        newOrder.add(originalOrder.get(0));
        valueB = newOrder.get(0).getValues()[1];
        originalOrder.remove(0);

        for (Domino d1 : originalOrder) {

            for (Domino d2 : originalOrder) {
                valueA = d2.getValues()[0];
                if (valueA == valueB) {
                    newOrder.add(d2);
                    valueB = d2.getValues()[1];
                    //originalOrder.remove(d2);
                }
            }
        }
        return newOrder;
    }
}