package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */


class DemoMultiThread {

    public static void main(String[] args) {

        // Intiating thread1 with in the constructor of Mythreadrunnable class. Also


     MyThreadRunnable thread1 = new MyThreadRunnable("thread1");



     MyOtherThreadRunnable myOtherThreadRunnable = new MyOtherThreadRunnable();

     Thread thread2 = new Thread(myOtherThreadRunnable,"thread2");

     thread2.start();

     Thread thread3 = new Thread(new MyOtherThreadRunnable(),"thread3");

     thread3.start();

        System.out.println("End of Main thread");

    }

}


class MyThreadRunnable implements Runnable {

     Thread thread;


    public MyThreadRunnable(String name) {
        thread = new Thread(this,name);
        thread.start();
    }

    @Override
    public void run() {

        System.out.println(thread.getName() + " starting");


        for(int i=0; i < 5; i++) {


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(thread.getName() + " " + Math.pow(i,i));


        }



    }




}

class MyOtherThreadRunnable implements Runnable {


    public MyOtherThreadRunnable() {
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " starting");

        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " " + Math.sqrt(i * i * i * i));

        }

    }

}


