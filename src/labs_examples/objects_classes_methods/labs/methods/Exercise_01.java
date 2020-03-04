package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        System.out.println("Multiplication of 3 and 5 is " + multiply(3,5));

        System.out.println("Division of 10 and 5 is " + divide(10,5));

        joke();

        System.out.println("Number of seconds in 10 years is " + seconds(10));

        System.out.println("Number of arguments in this function call is " + varargs(2,3,4,5,6));




    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b) {
        return a*b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static float divide(int a, int b) {
        if (b != 0) {
            return (float) a/b ;
        }
        else
        {
            return 0;
        }
    }


    // 3) Create a static void method that will print of joke of your choice to the console

    public static void joke() {
        System.out.println("This is a joke");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents


    public static int seconds(int years) {

        int k = years/4;
        return k*366*24*60*60 + (years -k)*365*24*60*60;  // accounting leap years

    }


    // 5) Create a varargs method that will return the length of the varargs array passed in


    public static int varargs(int ... a) {
        return a.length;
    }




}
