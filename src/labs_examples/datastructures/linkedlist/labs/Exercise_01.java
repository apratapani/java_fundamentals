package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */


class DemoBuiltInLinkedList {


    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList();


        myList.add(26);

        myList.add(26);

        myList.add(22);

        myList.add(6);

        myList.add(20);


        Collection<Integer> collection = new ArrayList();

        collection.add(5);

        collection.add(12);

        collection.add(2);

        myList.addAll(0,collection);

        myList.addFirst(1);

        myList.addLast(31);

        System.out.println("Get the first element of the linked list " + myList.getFirst());

        System.out.println("Get the last element of the linked list " + myList.getLast());

        System.out.println("Get the 4th element of the linked list " + myList.get(4));

        myList.set(4,15);

        System.out.println("After setting up the 4th element of the linked list, its value is " + myList.get(4));

        myList.push(28);

        System.out.println("pop the top elements of the linked list " + myList.pop());

        myList.remove(4);

        System.out.println("After removing  the 4th element of the linked list, its value is " + myList.get(4));


        System.out.println("Does value of 2 exists ? " );
                if(myList.contains(2))
                    System.out.println("Yes");
                else
                    System.out.println("No");

        ListIterator listIterator = myList.listIterator(0);

        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());

        }


       myList.clear();


        listIterator = myList.listIterator(0);

        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());

        }




    }




}