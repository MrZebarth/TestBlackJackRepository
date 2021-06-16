package blackjackcpttemplate;

import java.util.*;

/**
 * The main game loop for BlackJack ICS3U Quad 2 2021
 *
 * @author k_zeb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a scanner
        Scanner in = new Scanner(System.in);
        //Make a new deck, player, dealer
        Deck cards = new Deck();
        Player p = new Player();
        Dealer d = new Dealer();
        boolean play = true;

        while (play && p.bank > 0) {
            //Shuffle the cards
            p.reset();
            cards.fillDeck();
            cards.shuffle();

            //Deal out the first two cards
            cards.firstDeal(p, d);

            //Player's turn
            p.playerTurn(cards);
            //Dealer's turn
            d.dealerTurn(cards);

            if (p.handScore > d.handScore) {
                p.bank += 10;
                //printout that player wins
            } else if (p.handScore < d.handScore) {
                p.bank -= 10;
                //printout that the dealer wins

            } else {
                //printout that it is a PUSH. no points awarded.
            }
            //if they're out of money, end the game.
            if (p.bank <= 0) {
                System.out.println("You're out of money!");
            } 
            //if they still have money, ask if they want to keep playing.
            else {
                System.out.println("Do you want to keep playing?");
                String response = in.nextLine().toUpperCase();
                play = response.charAt(0) == 'Y'; //This sets it to true if they want to keep playing.
            }
        }
        //close the Scanner
        in.close();
    }

}
