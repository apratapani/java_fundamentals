package labs_examples.arrays.labs;

import videos_source_code.arrays.ArrayLists;
import java.util.ArrayList;


/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<String> lists = new ArrayList<String>();
        lists.add("Hello ");
        lists.add("How ");
        lists.add("are ");
        lists.add("you ");
        lists.add("doing!");

                for(String s : lists) {
                    System.out.print(s);
                }

        System.out.println();



    }
}
