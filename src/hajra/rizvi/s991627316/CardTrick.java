package hajra.rizvi.s991627316;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Hajra Rizvi
 * @date 06/05/2021
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(c.randomValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[c.randomSuit()]);
            magicHand[i] = c;
        }
        //Printing out the randomly generated hand using for each loop
        for (Card magicHands : magicHand) {
            System.out.println(magicHands.getValue() + " of " + magicHands.getSuit());
        }
        //Creating a new Card object luckyCard
        Card luckyCard = new Card();
        luckyCard.setSuit("Hearts");
        luckyCard.setValue(5);
        
        
        System.out.println("Lucky Card: " + luckyCard.getValue()+ " of " + luckyCard.getSuit());
        
        String finalValue = "Sorry! You didn't pick the lucky card.";
        for (Card magicHands : magicHand){
            if (luckyCard.getValue() == magicHands.getValue() && luckyCard.getSuit().equals(magicHands.getSuit())){
                finalValue = "Congratulations! You picked a lucky card!";
            }
        }
        System.out.println(finalValue);
        
        //insert code to ask the user for Card value and suit, create their card
//         System.out.println("Let's Begin!");
//         System.out.println("Pick a card! Any Card!");
//         System.out.print("Pick the card value (1-13): ");
//         int inputValue = in.nextInt();
//         System.out.print("Pick the card suit (Hearts = 1, Diamonds = 2, "
//                 + "Spades = 3, Clubs = 4): ");
//         int inputSuit = in.nextInt();
        
//         String userSuit;
//         if (inputSuit == 1){
//             userSuit = "Hearts";
//         } else if (inputSuit == 2){
//             userSuit = "Diamonds";
//         } else if (inputSuit == 3){
//             userSuit = "Spades";
//         } else {
//             userSuit = "Clubs";
//         }
        
//         System.out.println("Your Card: " + inputValue + " of " 
//                 + userSuit);
        
        
//        // and search magicHand here
//        String finalValue = "You Lose!";
//        for (Card magicHands : magicHand){
//            if (inputValue == magicHands.getValue() && userSuit.equals(magicHands.getSuit())){
//                finalValue = "You Win!";
//            }
//        }
//        //Then report the result here
//        System.out.println(finalValue);    
        
        

    }
}


