
package blackjackcpttemplate;
import java.util.*;
/**
 * Dealer class for ICS3U Quad 2 2021 CPT
 * @author k_zeb
 */
public class Dealer {
    /*
    FIELDS
    */
    
    public ArrayList<Card> hand; //the dealer's hand
    public int handScore;
    /*
    METHODS
    */
    
    public Dealer(){
        //set the hand to an empty arraylist
        //initialize handScore to 0
    }
    
    public void hit(Deck cards){
        //call the deal method on cards
        //Add the returned value to the hand.
        //Call calculateScore     
        this.handScore = Deck.calculateScore(hand);
    }
    
    public void displayHand(){
        //print out the cards in the dealer's hand
    }
    
    public void calculateScore(){
        //add up the score in the hand and print it out
        //save the value in handScore
        /*
        set score-->0, aceCounter-->0
        Loop through cards of hand.
        for (Card c:hand){
            int card = c.cardValue();
            
            if card>0 && card<11, score+=card
            else if card>10, score+=10
        }
        while aceCounter>0
            if score+11<=21, score+=11, soft=true
            if score+1<=21, score+=1
            else,
                if soft, score-=10. score+=1
                if !soft, score+=1
                
            aceCounter--
        handScore = score OR return score
        
        */
        
    }
    
    public int hardScore(){
        int score=0;
        for (Card c:hand){
            int card = c.cardValue();
            
            if (card<11){ 
                score+=card;
            }else {
                score+=10;
            }
            
        }
        return score;
    }
    public void dealerTurn(Deck cards){
        //Display the dealer's hand
        //Calculate the score and display i
        //While the handScore<17...
        while (hardScore()<17){
            
        }
            //call hit
            //display new card and score
            this.displayHand();
    }
}
