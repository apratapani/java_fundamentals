package labs_examples.lambdas.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */


@FunctionalInterface

interface MyFunctionalInter {

    public void printDayOfWeek();


}


@FunctionalInterface

interface MyFunctionalInterSingleArg {

    public int factorial(int num);

}


@FunctionalInterface

interface MyFunctionalInterDoubleArg {
    public int multiply(int a, int b);
}


class DemoLambdaExpression {


    public static void main(String[] args) {


        MyFunctionalInter lambda = () -> {
            Date today = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(today);
            System.out.println("Day of the week is " + cal.get(Calendar.DAY_OF_WEEK));

        };

        // Print current day of the week with Lambda expression.

        lambda.printDayOfWeek();

        MyFunctionalInter anon = new MyFunctionalInter() {
            @Override
            public void printDayOfWeek() {
                Date today = new Date();
                Calendar cal = Calendar.getInstance();
                cal.setTime(today);
                System.out.println("Day of the week is " + cal.get(Calendar.DAY_OF_WEEK));
            }
        };

        // Print current day of the week with Anonymous class.


        anon.printDayOfWeek();


        MyFunctionalInterSingleArg lambdaFact = (int i) -> {
            int fact = 1;
            while (i >= 1) {
                fact = fact * i;
                i -= 1;
            }

            return fact;
        };

        int i = 5;

        System.out.println("Factorial of " + i + " is " + lambdaFact.factorial(i));




        MyFunctionalInterSingleArg anonSingle = new MyFunctionalInterSingleArg() {
            @Override
            public int factorial(int i) {
                int fact = 1;
                while (i >= 1) {
                    fact = fact * i;
                    i -= 1;
                }
                return fact;
            }

        };


        System.out.println("Factorial of " + i + " is " + anonSingle.factorial(i));


        MyFunctionalInterDoubleArg lambdaDoubleArg = (int a, int b) -> {
            return (a*b);
        };

        int j = 120;

        System.out.println("Multiplication of "+ i + " and " + j + " is " + lambdaDoubleArg.multiply(i,j));

        MyFunctionalInterDoubleArg anonDoubleArg = new MyFunctionalInterDoubleArg() {
            @Override
            public int multiply(int a, int b) {
                return a*b;
            }
        };

        System.out.println("Multiplication of "+ i + " and " + j + " is " + anonDoubleArg.multiply(i,j));


//        java.util.function.Predicate

        Predicate<String> testLengthOfString = (String str) -> {
            if(str.length() > 5)
                return true;
            else
               return false;
        };

        String str = "Hello how are you";

       // System.out.println(str.length());

       if (testLengthOfString.test(str))
           System.out.println("Length of String -> " + str + " <- is greater than 5");
       else
           System.out.println("Length of String -> " + str + " <- is less than or equal to 5");


       //java.util.function.Function

        Function<Double,Double> function = (Double num) -> {

            num = num*0.9;

            return num;
        };

        double k = 176000;

        System.out.println("If sal is " + k + ", new sal is " + function.apply(k));




   }


}
