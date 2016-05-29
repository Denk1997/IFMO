import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by denis on 29.05.16.
 */
public class Algorithm {
    private ArrayList<Card> cards;
    private HashSet<Integer> redNumbers = new HashSet<>();
    private HashSet<Integer> blackID = new HashSet<>();

    public Algorithm(ArrayList<Card> cards) {
        if (cards.size() > 0) {
            this.cards = cards;
        }
    }

    public HashSet<Integer> doWork() {
        for (Card card:cards) {
            if(!redNumbers.contains(card.getRedCardID())) {
                redNumbers.add(card.getRedCardID());
                blackID.add(card.getBlackColorID());
            }
        }
        return this.blackID;
    }
}
