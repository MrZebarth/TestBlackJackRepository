package blackjackcpttemplate;

import java.util.*;

/**
 * A single card for ICS3U Quad 2 2021 CPT
 *
 * @author k_zeb
 */
public class Card {

    /*
    FIELDS
     */
    private int value; //the value of the card, from 1-13
    private String name; //the name of the card.
    value cardV;
    public int cardValue(){
        switch (this.cardV){
            case ace:
                return 1;
            case two:
                return 2;
            case three:
                return 3;
            default:
                return 0;
               
        }
        
    }
    /*
    METHODS
     */
    /**
     * Constructor for the card
     *
     * @param v the value from 1-13
     * @param n the name of the card
     */
    public Card(int v, String n) {
        //set the value to v
        //set the name to n
    }

    /**
     * Get the value of the card
     * @return int value from 1-13
     */
    public int getValue() {
        return value;
    }

    
    /**
     * Get the name of the card
     * @return String name
     */
    public String getName() {
        return name;
    }
    
    public enum value{
        ace,two,three
    }

}
