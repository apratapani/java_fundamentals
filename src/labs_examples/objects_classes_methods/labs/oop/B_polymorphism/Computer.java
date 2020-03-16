package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Computer {

    protected double ram;
    protected double cores;
    private double size;
    private double wt;
    private String color;

    public Computer(double ram, double cores) {
        this.ram = ram;
        this.cores = cores;
    }


    public void setSize(double size) {
        this.size = size;
    }

    public void setWt(double wt) {
        this.wt = wt;
    }


    public void describeComputer(double ram, double cores) {

        this.ram = ram;
        this.cores = cores;

        System.out.println("This computer has a memory of " + ram + "GB. It has " + cores + "cores.");

    }

    public void describeComputer(double size ) {


        this.size = size;

        System.out.println("This computer has a memory of " + ram + "GB. It has " + cores + "cores.Its size is " + size + "inch.");

    }

    public void describeComputer(double wt,String color ) {

        this.color = color;
        this.wt = wt;

        System.out.println("This computer has a memory of " + ram + "GB. It has " + cores + "cores. Its size is " + size + "inch. Its weight is " + wt + "lbs. Its color is " + color + ".");

    }

}





