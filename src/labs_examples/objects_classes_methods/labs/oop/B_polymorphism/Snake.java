package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Snake implements Animal {


    String type; // type of the snake.

    Boolean venomous;

    public Snake(String type) {
        this.type = type;
    }

    @Override
    public void eat() {

        System.out.println("Snake eats Frogs,rats etc.");


    }

    @Override
    public void move() {

        System.out.println("Snake moves by crawling. It doesnt have any legs.");

    }

    public Boolean getVenomous() {
        return venomous;
    }

    public void setVenomous(Boolean venomous) {
        this.venomous = venomous;
    }
}
