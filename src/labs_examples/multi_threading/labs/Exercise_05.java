package labs_examples.multi_threading.labs;

import java.util.ArrayList;
import java.util.Random;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class DemoWaitNotify {


    public static void main(String[] args) {

        ArrayList<Integer> sharedQueue = new ArrayList<Integer>();

        MyProducer thread_producer = new MyProducer("thread_producer",sharedQueue,10);

        MyConsumer thread_consumer = new MyConsumer(sharedQueue,"thread_consumer");



        System.out.println("End of Main thread");



    }


}


class MyProducer implements Runnable {

    Thread thrd;
    String name;
    ArrayList<Integer> queue;
    int maxCap;

    public MyProducer(String name,ArrayList<Integer> queue,int maxCap) {
        this.name = name;
        this.thrd = new Thread(this, name);
        this.queue = queue;
        this.maxCap = maxCap;
        thrd.start();


    }


    @Override

    public void run() {

        Random random = new Random();
         for(int i =0; i < 100; i++) {

             synchronized (queue) {

                 while (queue.size() == maxCap) {
                     System.out.println(thrd.getName() + " should wait as shared queue reached max capacity of " + maxCap);

                     try {
                         queue.wait();
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 // int j = (int) Math.random();

                 int randomInteger = random.nextInt();


                 queue.add(randomInteger);
                 System.out.println("Produced " + randomInteger);

                 queue.notifyAll();

             }
         }


    }

}




class MyConsumer implements Runnable {

    ArrayList<Integer> queue;
    String name;
    Thread thrd;

    public MyConsumer(ArrayList<Integer> queue,String name) {
        this.queue = queue;
        this.name = name;
        this.thrd = new Thread(this,name);
        thrd.start();

    }


    @Override
    public void run() {

        System.out.println(thrd.getName() + " starting");

        for(int i=0;i <100; i++) {

            synchronized (queue) {

                while (queue.isEmpty()) {

                    System.out.println(thrd.getName() + " should wait as the shared queue is empty");

                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int j = queue.remove(0);

                System.out.println("Consumed " + j);

                queue.notifyAll();


            }

        }

    }


}