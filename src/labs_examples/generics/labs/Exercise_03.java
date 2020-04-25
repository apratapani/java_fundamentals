package labs_examples.generics.labs;

import java.util.*;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Exercise_03 {



   static <T extends Number,V extends Number> double sumOfnums(T val1,V val2) {
        return (val1.doubleValue() + val2.doubleValue());
    }

    static <T extends String> int countPalindromes(T[] coll) {

       int count = 0;

       for(T val: coll) {

           for(int i=0;i < val.length(); i++) {


              if(val.charAt(i) == val.charAt(val.length()-1-i))
                 {
                  if(i==val.length()-1) {
                      count++;
                  }

                 }
              else
              {
                  break;
              }


           }

       }

       return count;

    }

    static <T> ArrayList<T> swapElements(ArrayList<T> list,int pos, int swap) {


       T temp = list.get(pos);
       list.set(pos,list.get(swap));

       list.set(swap,temp);

       return list;

    }

    static <T> T largesRange(List<T> list,int begin, int end) {

       List<T> subArr = list.subList(begin,end);

       T val = (T) Collections.max(subArr,null);

       return val;

    }


    public static void main(String[] args) {


        System.out.println(sumOfnums(5.5,6.2));

        String[] pals = {"madam","hello","how","level","civic","are"};

        System.out.println(countPalindromes(pals));

        ArrayList<String> swapPos = new ArrayList(Arrays.asList("madam","hello","how","level","civic","are"));

        ArrayList<String> x = swapElements(swapPos,1,5);

        System.out.println(x);

        ArrayList<Integer> nums = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,4));

       System.out.println(largesRange(nums,5,8));


    }





}