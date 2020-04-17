package labs_examples.datastructures.queue.labs;
import java.util.PriorityQueue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

class  JavaPriorityQueue {


    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue();

        queue.add("Mike");

        queue.add("Anil");

        queue.add("Brenda");

        queue.add("Trish");

        queue.add("Tamil");

        queue.add("Kalyan");

        queue.offer("Raja");

        System.out.println("Intial priority of queue" + queue);

        System.out.println("Peek of queue " + queue.peek());

        System.out.println("calling poll method of queue " + queue.poll());

        System.out.println("calling remove method of queue " + queue.remove("Mike"));

        System.out.println("Final priority of queue" + queue);

        System.out.println("calling queue element " + queue.element());



    }




}


