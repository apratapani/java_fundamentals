package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {


    char[] suit = new char[]{'♠', '♦', '♥', '♣'};

    int cardValue;

    char suitType;

    public Card() {
    }

    public Card(int cardValue, char suitType) {
        this.cardValue = cardValue;
        this.suitType = suitType;
    }

    public int getCardValue() {

        return cardValue;
    }

    public char getSuitType() {
        return suitType;
    }
}



