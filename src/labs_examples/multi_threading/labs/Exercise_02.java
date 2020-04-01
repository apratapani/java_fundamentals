package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Application {

    public static void main(String[] args) {

        Thread thread = new Thread();

        System.out.println("Thread name is " + thread.getName() + " and its priority is " + thread.getPriority());


        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("New priority of this thread " + thread.getName() + " is " + thread.getPriority());

        thread.start();

    }


}