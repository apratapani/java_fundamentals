package labs_examples.datastructures.hashmap.labs;

import java.sql.SQLOutput;
import java.util.*;

/**
 *      HashMaps Exercise_03
 *
 *      Create a new class that does the following:
 *
 *      1) create a LinkedList
 *      2) create a Stack
 *      3) create a Queue
 *      4) create a HashMap
 *
 *      Then, add millisecond timers before and after each data structure above and print out
 *      how long it takes for each to complete EACH the following tasks, and the total time for
 *      each data structure:
 *
 *      1) add 100 elements
 *      2) update 100 elements
 *      3) search for 100 elements
 *      4) delete 100 elements
 */

class DemoDataStructPerf {


    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList();

        Stack<Integer> stack = new Stack();

        PriorityQueue<Integer> queue = new PriorityQueue();

        long startTimeListAdd = System.nanoTime();

        for(int i=0;i <100; i++) {
            linkedList.add(i);
        }

        long endTimeListAdd = System.nanoTime();

        long elaTimeListAdd = endTimeListAdd - startTimeListAdd;

        System.out.println("Time taken for linked list add of 100 elements is " + elaTimeListAdd);

        // updating linked list of all 100 elements.

        long startTimeListUpd = System.nanoTime();

        for(int i=0; i < 100; i++) {
            linkedList.set(i,5*i);

        }

        long endTimeListUpd = System.nanoTime();

        long elaTimeListUpd = endTimeListUpd -  startTimeListUpd;

        System.out.println("Time taken for linked list update of 100 elements is " + elaTimeListUpd);

        System.out.println(linkedList);


        long startTimeListSearch = System.nanoTime();

        Iterator iterator = linkedList.iterator();


        while(iterator.hasNext()) {

            System.out.print(iterator.next() + ",");

        }

        System.out.println();

        long endTimeListSearch = System.nanoTime();

        long elaTimeListSearch = endTimeListSearch - startTimeListSearch;

        System.out.println("Time taken for search linked list elapsed time is " + elaTimeListSearch);

        long startTimeListDel = System.nanoTime();

          linkedList.clear();


        long endTimeListDel = System.nanoTime();

        long elaTimeListDel = endTimeListDel - startTimeListDel;

        System.out.println("Time taken for list deletion is " + elaTimeListDel);

        System.out.println(linkedList);

        long startTimeStackAdd = System.nanoTime();

       for(int i=0;i<100;i++) {
          stack.add(i);
       }

       long endTimeStackAdd = System.nanoTime();

       long elaTimeStackAdd = endTimeStackAdd- startTimeStackAdd;

        System.out.println("Total time taken for stack add of 100 elements is  " + elaTimeStackAdd);

        long startTimeStackupd = System.nanoTime();

        for(int i=0;i<100;i++) {
            stack.set(i,5*i);
        }

        long endTimeStackUpd = System.nanoTime();

        long elaTimeStackUpd = endTimeStackUpd - startTimeStackupd;

        System.out.println("Total time taken for stack update 100 elements is " + elaTimeStackUpd);

        long startTimeStackSearch = System.nanoTime();

        Iterator iteratorStack = stack.iterator();

        while(iteratorStack.hasNext()) {
            System.out.print(iteratorStack.next() + ",");
        }

        long endTimeStackSearch = System.nanoTime();

        long elaTimeStackSearch = endTimeStackSearch - startTimeStackSearch;

        System.out.println();
        System.out.println("Total time taken for Stack search is " + elaTimeStackSearch);

        long startTimeStackDel = System.nanoTime();

        stack.clear();

        long endTimeStackDel = System.nanoTime();

        long elaTimeStackDel = endTimeStackDel - startTimeStackDel;

        System.out.println("Total time taken for stack deletion is " + elaTimeStackDel);

        long startTimeQueueAdd = System.nanoTime();
        for(int i=0;i<100;i++) {
            queue.add(i);
        }

        long endTimeQueueAdd = System.nanoTime();

        long elaTimeQueueAdd = endTimeQueueAdd - startTimeQueueAdd;

        System.out.println("Total time taken for queue add of 100 elements is " + elaTimeQueueAdd);





    }


}