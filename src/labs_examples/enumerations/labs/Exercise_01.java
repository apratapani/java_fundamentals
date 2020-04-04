package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */


enum NaftaCountries {

    USA,MEXICO,CANADA;

}


enum  Oceans {

    // Avg depth is in meters, volume is in Km3

    ARCTIC(1205,18750000),SOUTHERN(3270,71800000),INDIAN(3741,264000000),ATLANTIC(3646,310410900),PACIFIC(3970,669880000);

     int avgDepth;
     double vol;


     final String DUOM = "meters";
     final String VUOM ="km3";


    Oceans(int avgDepth,double vol) {

        this.avgDepth = avgDepth;
        this.vol = vol;

    }

    public int getAvgDepth() {
        return avgDepth;
    }

    public void setAvgDepth(int avgDepth) {
        this.avgDepth = avgDepth;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }
}



class DemoEnum {


    public static void main(String[] args) {

        NaftaCountries myCountry = NaftaCountries.USA;

        System.out.println("I like  " + myCountry);;


        for(Oceans val : Oceans.values()) {

            System.out.print(val + " ocean has an average depth of " + val.getAvgDepth() + " " + val.DUOM);
            System.out.println(" it has volume of " + val.getVol() + " " + val.VUOM);

        }


    }


}