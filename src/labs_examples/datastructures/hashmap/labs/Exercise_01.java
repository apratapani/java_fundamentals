package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */


class DemoHashMap {

    public static void main(String[] args) {
        HashMap<String,Integer> oceanMap = new HashMap();

        //ocean depth in meters.

        oceanMap.put("Indian",3741);

        oceanMap.put("Pacific",3970);

        oceanMap.put("Atlantic",3646);

        oceanMap.put("Southern",3270);

        oceanMap.put("Arctic",1205);

        Set entries = oceanMap.entrySet();

        Iterator iterator = entries.iterator();

        while(iterator.hasNext()) {

            Map.Entry data = (Map.Entry)iterator.next();

            System.out.print("Key = " + data.getKey() + " -> Value = " + data.getValue());
            System.out.println();

        }

        System.out.println("Indian ocean depth is " + oceanMap.get("Indian") + " meters");

       HashMap<String,Integer> oceanCopy = new HashMap();

       oceanCopy.putAll(oceanMap);


        System.out.println("Pacific ocean depth from copy map is " + oceanCopy.get("Pacific") + " meters");

        System.out.println("Size of ocean hash map is " + oceanMap.size());

        if(oceanMap.containsKey("Pacific"))
            System.out.println(oceanMap.get("Pacific") + " meters");


        Set oceans = oceanMap.keySet();

        System.out.println("Set of oceans in the world are " + oceans);









    }


}