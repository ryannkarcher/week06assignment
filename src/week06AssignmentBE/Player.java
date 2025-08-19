package week06AssignmentBE;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> hand; //create list of cards in a player's hand
    private int score; //keeps score
    private String name; //name of player

    //constructor to create players, starting with no cards and a score of 0
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    //use method describe again to combine player names and scores
    //describes what their hand is, which is a card.
    public void describe() {
        System.out.println("Player: " + name + " | Score: " + score);
        System.out.println("Hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    //use flip method  
    //removes first card from player's hand until empty.
    public Card flip() {
        if (hand.isEmpty()) {
            return null;
        }
        return hand.remove(0);
    }
    
    //draw method: dck as argument and object type.
    //to remove top card from deck and add to hand in play
    public void draw(Deck deck) {
        Card card = deck.draw();
        if (card != null) {
            hand.add(card);
        }
    }

    //method to add points to the player's score
    public void incrementScore() {
        this.score++;
    }

    //getters for the scores and names
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}

