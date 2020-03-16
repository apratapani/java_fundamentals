package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

class Food {

    int cal;

    int glycemicIndex;

    double vitaminA;

    double vitaminB;

    double vitaminC;

    public Food(int cal, int glycemicIndex, double vitaminA, double vitaminB, double vitaminC) {
        this.cal = cal;
        this.glycemicIndex = glycemicIndex;
        this.vitaminA = vitaminA;
        this.vitaminB = vitaminB;
        this.vitaminC = vitaminC;
    }

    public int getCal() {
        return cal;
    }

    public int getGlycemicIndex() {
        return glycemicIndex;
    }

    public double getVitaminA() {
        return vitaminA;
    }

    public double getVitaminB() {
        return vitaminB;
    }

    public double getVitaminC() {
        return vitaminC;
    }
}


class Veg extends Food {

    String rawOrCooked;  // raw or cooked.

    String physicalState;  // liquid or solid




    public Veg(int cal, int glycemicIndex, double vitaminA, double vitaminB, double vitaminC, String rawOrCooked, String physicalState) {
        super(cal,glycemicIndex,vitaminA,vitaminB,vitaminC);
        this.rawOrCooked = rawOrCooked;
        this.physicalState = physicalState;
    }

    @Override
    public String toString() {
        return "Veg{" +
                "rawOrCooked='" + rawOrCooked + '\'' +
                ", physicalState='" + physicalState + '\'' +
                '}';
    }

    public String getRawOrCooked() {
        return rawOrCooked;
    }

    public String getPhysicalState() {
        return physicalState;
    }


}


class Fruit extends Veg {

    String color;
    int wt;

    public Fruit(int cal, int glycemicIndex, double vitaminA, double vitaminB, double vitaminC, String rawOrCooked,String physicalState, String color,int wt) {

        super(cal, glycemicIndex, vitaminA, vitaminB, vitaminC, rawOrCooked, physicalState);
        this.color = color;
        this.wt = wt;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                ", wt=" + wt +
                '}';
    }

    public String getColor() {
        return color;
    }

    public int getWt() {
        return wt;
    }
}

class Vegetables extends Veg {

    String color;

    boolean leafyGreen;

    public Vegetables(int cal, int glycemicIndex, double vitaminA, double vitaminB, double vitaminC, String rawOrCooked,String physicalState,String color, boolean leafyGreen) {

        super(cal, glycemicIndex, vitaminA, vitaminB, vitaminC, rawOrCooked, physicalState);
        this.color = color;
        this.leafyGreen = leafyGreen;
    }

   static void cook(int temp) {
        System.out.println("This is cooked at " + temp);
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "color='" + color + '\'' +
                ", leafyGreen=" + leafyGreen +
                '}';
    }

    public String getColor() {
        return color;
    }

    public boolean isLeafyGreen() {
        return leafyGreen;
    }
}


public class Inheritance_food {

    public static void main(String[] args) {

        Fruit banana = new Fruit(89,51,0,0,0,"raw","Solid","yellow",118);


        System.out.println(banana.toString());

        System.out.println("This can be eaten" + banana.rawOrCooked + ". It has Gylcemic index of " + banana.glycemicIndex + " and has " + banana.cal + " calories");




    }


}
