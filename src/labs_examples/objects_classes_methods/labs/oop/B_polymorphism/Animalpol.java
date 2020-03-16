package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Animalpol {

    Animal an;

    public Animalpol(Animal an) {
        this.an = an;
    }


    public void describe() {

        an.eat();
        an.move();

    }


}
