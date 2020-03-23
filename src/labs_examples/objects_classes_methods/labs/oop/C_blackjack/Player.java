package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Player {

    String name;

    Hand hand = new Hand();


    int potValue;


    public Player(String name) {
        this.name = name;
    }

    public Player() {
    }

    public boolean computeAI() {

        if (this.hand.scoreHand() >=16 )
            return false;
        else
            return true;

    }


}
