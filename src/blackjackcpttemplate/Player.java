package blackjackcpttemplate;
import java.util.*;
/**
 * The player class for ICS3U Quad 2 2021 CPT
 * @author k_zeb
 */
public class Player {
    /*
    FIELDS
    */
    public ArrayList<Card> hand; //hand of cards.
    public int handScore;
    public int bank; //the total score of the player
    
    /*
    METHODS
    */
    
    /**
     * Constructor for Player
     */
    public Player(){
        //Create an empty array list for hand
        //Initialize handScore to 0
        //Initialize bank to a setting (probably 1000)
        bank=1000;
    }
    
    
    public void hit(Deck cards){
        //Call the deal method on cards
        hand.add(cards.deal());
        //Add the returned value to your hand.
        //Call calculateScore()
        this.handScore = Deck.calculateScore(this.hand);
    }
    
    
    public void reset(){
        hand.clear();
    }
    public void displayHand(){
        //print out the values of the cards in the hand. Loops are helpful here!
        //Method #1: Standard for loop
        for (int x=0;x<hand.size();x++){
            Card c=hand.get(x);
            System.out.println(c.getValue()+" of "+c.getName());
        }
        
        //Method #2: for each loop
        for (Card c:hand){
            //System.out.println(c.cardValue(c)+" of "+c.getName());
        }
    }
    
    public void playerTurn(Deck cards){
        //print out player's hand
        //calculate the total of the hand
        //while the total <21 and they have not said STAY...
            //ask HIT or STAY
            //If HIT,
                //call hit(cards)
                //if new total>21, print BUST
            //else if STAY
                //break out of loop
                Dealer d= new Dealer();
                
        
    }
    
}
