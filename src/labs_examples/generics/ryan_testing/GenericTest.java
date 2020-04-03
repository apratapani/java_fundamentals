package labs_examples.generics.ryan_testing;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericTest {


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        ArrayList<Integer> nums = new ArrayList<>();

        words.add("word");

        words.add("more");

        nums.add(1);

        nums.add(2);

       GenericClass<String,Double> genericString = new GenericClass("Hello",3.14);

       String s = genericString.getVal();

        HashMap<String,Integer> map = new HashMap<>();

        map.put("USA",230000000);

    }

    public static <N extends Number> double getSum(N val,N val2) {

        return val.doubleValue() + val.doubleValue();

    }

}
