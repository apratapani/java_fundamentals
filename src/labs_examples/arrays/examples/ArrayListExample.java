package labs_examples.arrays.examples;

import java.util.*;

class ArrayListExample {
    public static void main(String args[]) {

        // create array list of String
        ArrayList<String> obj = new ArrayList<String>();

        // add items to the array list
        obj.add("Ryan");
        obj.add("Kim");
        obj.add("Caden");

        // print out the array list
        System.out.println("Currently the arraylist has following elements:" + obj);

        // remove an item from the array list
        obj.remove("Caden");

        // print out modified array list
        System.out.println("Now the arraylist has following elements:" + obj);

        ArrayList<String> obj2 = new ArrayList();

        obj2.add("Anil");
        obj2.add("Mike");
        obj2.add("Trish");
        obj2.add("Brenda");
        obj2.add("Raja");

        obj.addAll(obj2);

        obj.remove("Trish");

        for(String name: obj) {

            System.out.println(name + ",");
        }

        System.out.println(obj.size());



    }
}
