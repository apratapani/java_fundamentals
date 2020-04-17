package labs_examples.datastructures.stack.labs;

import java.util.*;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */



class DemoJavaStack {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack();

        myStack.push(100);

        myStack.push(150);

        myStack.push(95);

        myStack.push(65);

        myStack.push(420);

        System.out.println("First element of the stack is " + myStack.peek());

        // removing the last element of the stack.

        System.out.println(myStack.pop());


        System.out.println("First element of the stack is " + myStack.peek());


        if(myStack.isEmpty()) {
            System.out.println("My stack is empty");
        }
        else
        {
            System.out.println("My stack is not empty");

        }

        System.out.println(myStack.search(100));

        // This method is from vector class. Stack extends vector class and thats why we are able to access firstElement.

        System.out.println(myStack.firstElement());


       // PriorityQueue<String> myQueue = new PriorityQueue();

        //myQueue.



    }



}
