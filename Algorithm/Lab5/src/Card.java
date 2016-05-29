/**
 * Created by denis on 29.05.16.
 */
public class Card {
    private int blackColorID;
    private int redCardID;

    public Card(int blackColorID, int redCardID) {
        this.blackColorID = blackColorID;
        this.redCardID = redCardID;
    }
    public int getRedCardID() {
        return redCardID;
    }

    public void setRedCardID(int redCardID) {
        this.redCardID = redCardID;
    }

    public int getBlackColorID() {
        return blackColorID;
    }

    public void setBlackColorID(int blackColorID) {
        this.blackColorID = blackColorID;
    }
}
