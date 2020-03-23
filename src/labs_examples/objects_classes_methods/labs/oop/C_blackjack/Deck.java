package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import sun.security.x509.OtherName;

import java.util.ArrayList;

public class Deck {

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<Integer>();


    public void populate() {



        char[] suit = new char[]{'♠', '♦', '♥', '♣'};

       int j = 0;
       do {

           for (char s: suit) {


               for(int i=1;i<=13;i++) {

                   cards[j] = new Card(i,s);

                   j++;


               }
           }


       } while (j<52);




    }

    public void getCards() {
        for(Card card: cards) {

            if(card.cardValue == 11) {
                System.out.println("J-" + card.suitType);
            }

            else if(card.cardValue == 12) {
                System.out.println("Q-" + card.suitType);
            }

            else if(card.cardValue == 13)
            {
                System.out.println("K-" + card.suitType);
            }
            else if(card.cardValue == 1) {
                System.out.println("A-" +  card.suitType);

            }
            else {
                System.out.println(card.cardValue + "-" + card.suitType);
            }
        }
        System.out.println(cards.length);
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }
}


/*

2-9
Jack,king,queen.

 */