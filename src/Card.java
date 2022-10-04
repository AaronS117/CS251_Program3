public class Card implements Cloneable{
// All Card Instance Variable
    private String suit;
    private String face;

    public String getSuit() // Getter
    {
        return suit;
    }
    public String getFace() // Getter
    {
        return face;
    }
    private void setSuit(String suit) // Setter
    {
        this.suit = suit;
    }
    private void setFace(String face) // Setter
    {
        this.face = face;
    }

    public Card(String suit, String face)
    {
        this.suit = suit;
        this.face = face;
    }

    public Card() //default constructor
    {
        this.suit = "Clubs";
        this.face = "Ace";
    }

    public String toString()
    // You must not set suit nor rank to something that is not in the domain of the mapping that is
    // inherent to your String toString() method. Do nothing when an argument is invalid.
    // Contain a method String toString() which returns a String representation of the calling Card
    // object’s suit and rank in some reasonable format.
    {
        return face +" of "+suit;
    }

    public boolean equals(Card guest)
    // Contain a method boolean equals(Card guest) which returns whether guest has the
    // same suit and rank as the calling Card object.
    {
        return this.getFace().equals(guest.getFace()) && this.getSuit().equals(guest.getSuit());
    }
    // Card Clone Method
    public Card clone()
    // Contain a method Card clone() which creates and return a reference to a copy of the calling
    // Card object.
    {
        return this.clone();
    }
}