package blackjackcpttemplate;

import java.util.*;

/**
 * Deck of cards for ICS3U Quad 2 2021 CPT
 * @author k_zeb
 */
public class Deck {
    /*
    FIELDS
    */
    ArrayList<Card> cards;
    
    /*
    METHODS
    */
    
    /**
     * Constructor. Fill the deck with cards.
     */
    public Deck(){
        //call fillDeck 
        //call shuffle
    }
    
    /**
     * Fill the deck with 52 cards
     */
    public void fillDeck(){
        //Create 52 cards and add them to the deck
    }
    
    /**
     * Calculate the score based on the hand
     * @param h The hand of cards
     * @return The int value of the hand score
     */
    public static int calculateScore(ArrayList<Card> h){
        //add up the values of all the cards in hand
        //save the value in handScore and print out the value
        return 0;
    }
    /**
     * Shuffle the cards
     */
    public void shuffle(){
        //Create a random number generator
        //Loop through deck
            //Pick a random value from 0-51
            //swap the current card with the randomly selected position
    }
    
    /**
     * Deal out a single card
     * @return integer value of card
     */
    public Card deal(){
        //Remove the first card of the deck (position 0)
        //Return the card that was removed.
        return new Card(1,"test"); //RETURN THE ACTUAL CARD, NOT this fake card
    }
    
    /**
     * Add two cards to the player and two cards to the dealer
     */
    
    public void firstDeal(Player p, Dealer d){
        //loop two times
            //call deal and add it to p
            //call deal and add it to d
        //Print out the players hand
        //Print out the dealers top card
    }
}
