package labs_examples.lambdas.labs;

import java.sql.SQLOutput;
import java.util.function.Function;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */


class DemoStaticMethodref {

    public static void main(String[] args) {

      //Function<Integer,Integer> funx = (a) -> DemoStaticMethodref.redCovid(a);

        // Below is a static method reference call.

        Function<Integer,Integer> funx = DemoStaticMethodref::redCovid;

        System.out.println("New pay after reduction is " + funx.apply(180000));

        DemoInstanceMethod demoInst = new DemoInstanceMethod();

        Function<Integer,Integer> funxInst = demoInst::calcBonus;

        System.out.println("Bonus missed is about " + funxInst.apply(180000));


        CarInterface car = VehicleConstRef::new;

        VehicleConstRef newCar = car.newVehicle("Honda","Accord");

        System.out.println("Make and model of this new car is " + newCar.getMake() + " " + newCar.getModel() );




    }

   public static int redCovid(int a) {

        return (int) (a * 0.90);
    }



}

class DemoInstanceMethod {

    public int calcBonus(int a) {

        return (int) (a * 0.10);
    }

}


 interface  CarInterface {

        VehicleConstRef newVehicle(String make,String model);

        }

 class VehicleConstRef {

    String make;

    String model;

    String type; // car, truck,plane etc.

     public VehicleConstRef(String make, String model) {
         this.make = make;
         this.model = model;
     }

     public VehicleConstRef(String make, String model, String type) {
         this.make = make;
         this.model = model;
         this.type = type;
     }

     public String getMake() {
         return make;
     }

     public void setMake(String make) {
         this.make = make;
     }

     public String getModel() {
         return model;
     }

     public void setModel(String model) {
         this.model = model;
     }

     public String getType() {
         return type;
     }

     public void setType(String type) {
         this.type = type;
     }
 }