package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    int handValue;

    ArrayList<Card> cards = new ArrayList<Card>();


    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Hand() {
    }


    public int scoreHand() {

        int i = 0;

        for(Card card : cards) {

            if(card.cardValue > 10) {
                i += 10;
            }
            else {
                i += card.cardValue;
            }
        }

        return i;

    }

    public boolean handValIfLessThan21() {

        int i = 0;

        for(Card card : cards) {

            i += card.cardValue;
        }

        if (i > 21)
          return false;
        else
            return true;
    }


    public void printHandCardValue() {


        for (Card eachCard : this.cards) {

            if (eachCard.getCardValue() > 10) {

                if (eachCard.getCardValue() == 11) {
                    System.out.print("J ");
                    System.out.println(eachCard.getSuitType());
                } else if (eachCard.getCardValue() == 12) {
                    System.out.print("Q ");
                    System.out.println(eachCard.getSuitType());
                } else if (eachCard.getCardValue() == 13) {
                    System.out.print("K ");
                    System.out.println(eachCard.getSuitType());
                }

            } else {

                System.out.println(eachCard.getCardValue() + " " + eachCard.getSuitType());
            }

        }



    }

}
