package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BlackjackController {


    public static void main(String[] args) {


        //  Player player1 = new Player("Anil");

        //  Player player2 = new Player("Bhavana");

        // Player player3 = new Player("Advith");

        Deck deck = new Deck();

        deck.populate();

        deck.getCards();


        System.out.println("Deck populated");

        playBlackJack(deck);




      /*    // deal(player1,deck);
           deal(player2,deck);
           deal(player3,deck);
          // deal(player1,deck);
           deal(player2,deck);
           deal(player3,deck);

        for(int j: deck.usedCards) {
            System.out.println(deck.cards[j-1].cardValue + " - " + deck.cards[j-1].suitType);
        }

       // System.out.println("Anil current score is " + player1.hand.scoreHand());
        System.out.println("Bhavana current score is " + player2.hand.scoreHand());
        System.out.println("Advith current score is " + player3.hand.scoreHand()); */

    }


    public static void deal(Player player, Deck deck) {

        int i = 0;

        do {
            Random r = new Random();

            int j = r.nextInt(52) + 1;

            if (!deck.usedCards.contains(j)) {
                i = j;
                deck.usedCards.add(i);
                Card cardtemp = new Card(deck.cards[i - 1].cardValue, deck.cards[i - 1].suitType);
                player.hand.cards.add(cardtemp);
                break;
            }

        } while (true);


        //  System.out.println(i);


    }

    public static void playBlackJack(Deck deck) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = scanner.nextLine();

        Player player1 = new Player(name);

        Player player2 = new Player("Computer");

        deal(player1, deck);
        deal(player2, deck);
        deal(player1, deck);
        deal(player2, deck);
        System.out.println(player1.name + " cards are ");
        player1.hand.printHandCardValue();
        System.out.println(player1.name + " hand value is " + player1.hand.scoreHand());

        String wantCard = "";


        //loop until either player wants card and either player does not go over 21
        do {

            if (!wantCard.equalsIgnoreCase("no") || wantCard.isEmpty()) {
                System.out.println(player1.name + " do you want another card ?:");
                wantCard = scanner.nextLine();
                if (wantCard.equalsIgnoreCase("yes")) {
                    deal(player1, deck);
                    System.out.println(player1.name + " cards are ");
                    player1.hand.printHandCardValue();
                    System.out.println(player1.name + " hand value is " + player1.hand.scoreHand());

                }
            }


            if (player2.computeAI()) {
                deal(player2, deck);
                System.out.println(player2.name + "  took another card");
            } else {
                System.out.println(player2.name + " did not take another card");
            }

        } while ((wantCard.equalsIgnoreCase("yes") || player2.computeAI()) && (player1.hand.scoreHand() < 21 && player2.hand.scoreHand() < 21));

        System.out.println(player1.name + " cards are ");
        player1.hand.printHandCardValue();
        System.out.println(player1.name + " hand value is " + player1.hand.scoreHand());
        System.out.println(player2.name + " cards are ");
        player2.hand.printHandCardValue();
        System.out.println(player2.name + " hand value is " + player2.hand.scoreHand());


        if (player1.hand.scoreHand() > 21 && player2.hand.scoreHand() > 21) {
            System.out.println("No body won");

        } else if (player1.hand.scoreHand() > 21 && player2.hand.scoreHand() <= 21) {
            System.out.println(player2.name + " won the game");
        } else if (player2.hand.scoreHand() > 21 && player1.hand.scoreHand() <= 21) {
            System.out.println(player1.name + " won the game");
        } else if ((player1.hand.scoreHand() <= 21 && player2.hand.scoreHand() <= 21) && player1.hand.scoreHand() > player2.hand.scoreHand()) {
            System.out.println(player1.name + " won the game");
        } else if ((player1.hand.scoreHand() <= 21 && player2.hand.scoreHand() <= 21) && player2.hand.scoreHand() > player1.hand.scoreHand()) {
            System.out.println(player2.name + " won the game");
        } else if (player1.hand.scoreHand() == player2.hand.scoreHand()) {
            System.out.println(player1.name + " and " + player2.name + " both won the game");
        } else {
            System.out.println("No body won the game");
        }


    }


}
