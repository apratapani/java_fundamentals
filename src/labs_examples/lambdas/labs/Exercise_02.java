package labs_examples.lambdas.labs;

import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class DemoBuiltInFunctionalInterfaces {

    public static void main(String[] args) {


       //java.util.function.DoubleFunction


        Supplier<Integer> sup = () -> {
         int i = (int) (Math.random()*100);
         return i;
        };

        System.out.println("Random number from 1 to 100 is " + sup.get());

        BiFunction<Integer,Integer,Integer> biFunction = (Integer a,Integer b) -> {
            return (a+b)*(a+b);
        };

        System.out.println("A + B whole square for 5 and 10 is " + biFunction.apply(5,10));


        BiPredicate<Integer,Integer> biPredicate =(Integer i,Integer j) -> {
            if(j%i==0)
                return true;
            else
                return false;

        };

        int i = 5;
        int j =10;

        if(biPredicate.test(5,10))
            System.out.println("Yes " + j + " is divisible by " + i);

        else
            System.out.println("No" + j +" is not divisible by " + i);


        Consumer<String> consumer = (String str) -> {
            if(str.toLowerCase()=="hello")
                System.out.println("Hello, How are you doing ? ");
            else if(str.toLowerCase() == "bye")
                System.out.println("Bye,Have a great day!");
            else
                System.out.println("I don't know what to do");
        };

        consumer.accept("hello");

        DoubleFunction<Integer> doubleFunction = (double val) ->  {

            int num = (int) (Math.random() * val);

            return num;

        };

        System.out.println("Random number between 1 and 10 is " + doubleFunction.apply(10.5));


         //java.util.function.Function





    }






}