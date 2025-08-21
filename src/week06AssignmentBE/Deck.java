package week06AssignmentBE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

   //create a constructor to populate the deck with 52 cards
    public Deck() { 
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        //split into suits and ranks (symbols and numbers)
        for (String suit : suits) {
        	//for-each loop to compare the string suit to the suits array
            for (int i = 0; i < ranks.length; i++) {
                String name = ranks[i] + " of " + suit;
                int value = i + 2;
                cards.add(new Card(value, name));
            } //value and name come from Card Class.
        }// for loop to create card values from 2 to 14 and add "of" between the ranks and suits
    }

    //method to shuffle; randomly reorder the cards we've established in the Card class and Deck class above
    public void shuffle() {
        Collections.shuffle(cards);
    } 

    //method to draw cards; instructs first to return null if the cards array is empty;
    //if else, remove card in position 1, or (0)
    public Card draw() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}