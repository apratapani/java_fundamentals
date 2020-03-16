package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Laptop extends Computer {

    String brand;
    boolean touchScreen;
    boolean ssd;

    public Laptop(double ram, double cores) {
        super(ram, cores);

    }

    @Override
    public void describeComputer(double size) {
        //super.describeComputer(size);
        System.out.println("This computer has a memory of " + ram + "GB. It has " + cores + "cores.Its size is " + size + "inch. This is a laptop");
    }
}
