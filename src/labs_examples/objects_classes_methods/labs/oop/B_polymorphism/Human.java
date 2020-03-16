package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Human implements Animal {

    String sex;

    double height;  // In feets and inches.

    double weight;

    String name;


    public Human(String sex) {
        this.sex = sex;
    }

    public Human(String sex, String name) {
        this.sex = sex;
        this.name = name;
    }

    public void eat() {

        System.out.println("Most of the Human beings are omnivorous. We typically eat cooked vegetables and meat.");


    }

    public void move() {

        System.out.println("Human beings move by walking with two legs and some times can run.");

        System.out.println("This particular person name is " + name);

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
