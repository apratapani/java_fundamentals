package labs_examples.objects_classes_methods.labs.objects;

public class AeroPlane {

    public static void main(String[] args) {

        Airengine planeAirengine = new Airengine(110000);
        Tv planeTv = new Tv("Samsung");
        Catering planeCatering = new Catering("Chuys");
        Systems planeSystems = new Systems("GE");

        String fuellevel = "Full";

        double cap = 323546;

        Airplane flight = new Airplane(planeAirengine,planeTv,planeCatering,planeSystems,cap,fuellevel);

        // System.out.println("This Airplane has a horse power of " + flight.airengine.horsePower + " and its televisions are from " + flight.tv.brand + ". Its catering service is from " + flight.catering.restaurant + ". It has a " +
          //      "fuel capacity uptil " + flight.fuelCap + " and filled up to " + flight.currentFuelLevel ); */

        System.out.println("This Airplane engine is  " + planeAirengine.toString() + ". This Airplan TV is " + planeTv.toString() + ". This Airplane Catering is served by " + planeCatering.toString() + ". This Plane systems " +
                "is from " + planeSystems.toString());

    }


}

class Airengine {
    private double horsePower;

    public Airengine(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Airengine{" +
                "horsePower=" + horsePower +
                '}';
    }
}

class Tv {
    private String brand;

    public Tv(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

class Catering {
    private String restaurant;

    public Catering(String restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Catering{" +
                "company='" + restaurant + '\'' +
                '}';
    }
}

class Systems {
    private String provider;

    public Systems(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Systems{" +
                "provider='" + provider + '\'' +
                '}';
    }
}

class Airplane {
   private Airengine airengine;

   private Tv tv;

    private Catering catering;

    private Systems systems;

    private double fuelCap;
    private String currentFuelLevel;

    public Airplane(Airengine engine, Tv tv, Catering catering, Systems systems, double fuelCap, String currentFuelLevel) {
        this.airengine = engine;
        this.tv = tv;
        this.catering = catering;
        this.systems = systems;
        this.fuelCap = fuelCap;
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "engine=" + airengine +
                ", tv=" + tv +
                ", catering=" + catering +
                ", systems=" + systems +
                ", fuelCap=" + fuelCap +
                ", currentFuelLevel='" + currentFuelLevel + '\'' +
                '}';
    }
}