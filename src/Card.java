public class Card
{
    private int face;

    public int getFace(int face)
    {
        return this.face;
    }

    public int setFace(int face)
    {
        this.face = 1;
        return this.face;
    }

    private int suit;

    public int getSuit(int suit)
    {
        return this.suit;
    }

    public int setSuit(int suit)
    {
        this.suit = 0;
        return this.suit;
    }

    public Card(int rank, int suit)
    {
        this.face = rank;
        this.suit = suit;
    }

    public String toString()
    {
        String[] faces = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"clubs", "Diamonds", "Hearts", "Spades"};
        String s = faces[getFace(face)] + " of " + suits[getSuit(suit)];
        return s;
    }
}
