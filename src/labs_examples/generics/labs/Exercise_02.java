package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */


class Exercise_02 {

    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList(Arrays.asList(100,500,600,700,800));

   /*     Integer sum = 0;

        for(Integer val : nums) {

            sum = sum + val.intValue();

        } */

        System.out.println("Total value is " + GenericMethodDemo.genericMethodArrNum(nums));

       // System.out.println(sum);


    }

}


 class GenericMethodDemo {


    public static <T extends Number> Double genericMethodArrNum(ArrayList<T> arrayList) {

        Double sum = 0.0;

        for(T val : arrayList) {
           sum = sum + val.doubleValue();
        }
        return sum;
    }

}