import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(1, 3));
        cards.add(new Card(2, 3));
        cards.add(new Card(3, 2));
        cards.add(new Card(4, 4));
        cards.add(new Card(5, 2));
        Algorithm alg = new Algorithm(cards);
        for (Integer integer : alg.doWork()) {
            System.out.println(integer);
        }
    }
}
