package labs_examples.multi_threading.labs;

import java.util.ArrayList;
import java.util.Random;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class SeqNumbers {

    public static void main(String[] args) {

        PrintNumbers threadEven = new PrintNumbers(0,"thread Even");

        PrintNumbers threadOdd = new PrintNumbers(1,"thread Odd");

        try
        {
            threadEven.thread.join();
            threadOdd.thread.join();
        }
        catch (InterruptedException exec) {
            exec.printStackTrace();
        }

        System.out.println("Main thread ends");


    }


}


class PrintNumbers implements Runnable {
    static int num =1;
    int evenOdd;
    Thread thread;
    static Object lock = new Object();

    public PrintNumbers(int evenOdd,String name) {
        this.evenOdd = evenOdd;
        thread = new Thread(this,name);
        thread.start();
    }

    @Override

    public void run() {

        while(num <= 100)
        {
          synchronized (lock) {
              try {
                  if (num % 2 == evenOdd) {                                             //wait for the remainder equal to 0;
                      System.out.println(Thread.currentThread().getName() + " " + num);
                      num++;


                  } else {
                      lock.wait();
                  }

              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              lock.notifyAll();
          }

          }


        }


}
