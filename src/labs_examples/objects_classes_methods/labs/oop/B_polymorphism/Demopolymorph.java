package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Demopolymorph {

    public static void main(String[] args) {



      Computer an = new Computer(16,4);

      Laptop an_lap = new Laptop(32,8);

      an.describeComputer(15);

      an_lap.describeComputer(15);  // This uses method overriding. This is one form of polymorphism.

      an.describeComputer(4.4,"white");  // This is method overloading. This is one form of polymorphism.

      Human anil = new Human("Male","Anil");

      Animalpol anpol = new Animalpol(anil);  // demo of Interfaces.

      anpol.describe();

    }




}

