public class CardDriver {

    public static void main(String[] args)
    // Declare and create an array of Card, of size 52 (A deck)
    {
        Card[] deck =new Card[52];
        // Fill the deck with the 52 unique playing cards (in any order)
        String[] suit = {"H","D","C","S"};
        String[] face = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        int i = 0;
        for(int j = 0; j < 4; j++)
        {
            for(int k = 0; k < 13; k++)
            {
                deck[i++]=new Card(suit[j],face[k]);
            }
        }
        // Apply 100 random transpositions of cards to the deck.
        // A transposition:
        // •Generate two random indices (each in the range 0 to 51)
        // •Swap the two cards at these indices
        for( i = 0;i < 100; i++)
        {
            int card1 = (int)(Math.random()*1000) % 52;
            int card2=(int)(Math.random()*1000) % 52;
            Card temp=deck[card1];
            deck[card1]=deck[card2];
            deck[card2]=temp;
        }
        // Display the contents of the deck, from index 0 to index 51
        System.out.println("\nContents of the Deck:");
        for(i = 0; i < 51; i++)
        {
            System.out.println(deck[i]);
        }
        // Find and display the index of the Queen of clubs in the deck.
        for(i = 0; i < 51; i++)
        {
            if(deck[i].getFace().equals("Queen") && deck[i].getSuit().equals("Clubs"))
            {
                System.out.println("\nQueen of Clubs is at Index "+ i);
                return;
            }
        }
    }
}