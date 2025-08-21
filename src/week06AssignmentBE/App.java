package week06AssignmentBE;

public class App {

    public static void main(String[] args) {
        // creates the deck and calls the method for the players to begin playing
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // first lines of the game to start. then calls the shuffle method
        System.out.println("Shuffling the deck...");
        deck.shuffle();

        // for loop to add cards to each players' decks 
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck); //player1 gets even numbered cards
            } else {
                player2.draw(deck); //player2 gets odd numbered carsd
            }
        }
 
        // play the game for 26 rounds, actually starting the game
        //use for loop to run 26 times and print out the round number
        System.out.println("\n--- Starting the Game! ---\n");
        for (int i = 0; i < 26; i++) {
            System.out.println("Round " + (i + 1) + ":");
            Card card1 = player1.flip();
            Card card2 = player2.flip(); 

            //printing offset: the name with the getter getName for both players
            System.out.print("  " + player1.getName() + " flips: ");
            card1.describe(); //method to describe the card. see round 1.
            System.out.print("  " + player2.getName() + " flips: ");
            card2.describe();

            //compare card values with getter method. then add to the correct
            //player's score for who wins, plus a console print of who won and
            // respectie scores
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("  " + player1.getName() + " wins the round! Point awarded.");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
                System.out.println("  " + player2.getName() + " wins the round! Point awarded.");
            } else {
                System.out.println("  It's a tie! No points awarded.");
            }
            System.out.println("  Current Score: " + player1.getName() + " = " + player1.getScore() + ", " + player2.getName() + " = " + player2.getScore());
            System.out.println();
        }

        //after 26 rounds, game is over. printing final scores with getter methods
        System.out.println("--- Game Over! ---\n");
        System.out.println("Final Scores:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        //comparing scores of player1 to player2, printing an if-else statement of who wins.
        if (player1.getScore() > player2.getScore()) {
            System.out.println("\n" + player1.getName() + " is the winner!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("\n" + player2.getName() + " is the winner!");
        } else {
            System.out.println("\nIt's a DRAW!");
        }
    }
}