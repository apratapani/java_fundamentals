package labs_examples.multi_threading.labs;

import java.io.*;

/**
 * Multithreading Exercise 4:
 * <p>
 * Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 * working as expected
 */

class DemoSynchronization {

    public static void main(String[] args) throws IOException {

        String filepath = "src/labs_examples/input_output/files/an.csv";


        Mythread thread1 = new Mythread("thread1", filepath, "1000,Anil Pratapani,160000,Enterprise Architect\n");

        Mythread thread2 = new Mythread("thread2", filepath, "2000,Bhavana,100000,Full Stack developer\n");

        System.out.println("Main thread ends");

        try {
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }


        MythreadMethod thread3 = new MythreadMethod("thread3", filepath);

        try {
            thread3.thread.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted");
        }


    }

}


class Mythread implements Runnable {

    Thread thread;
    String filePath;
    String data;


    public Mythread(String name, String fp, String data) {
        this.filePath = fp;
        this.data = data;
        thread = new Thread(this, name);
        thread.start();

    }

    @Override
    public void run() {

        System.out.println(thread.getName() + " starting");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        synchronized (filePath) {

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
                bw.write(data);


            } catch (IOException exec) {
                exec.getMessage();
                exec.printStackTrace();
            }


        }


    }


}

class MythreadMethod implements Runnable {


    Thread thread;
    String filePath;


    public MythreadMethod(String name, String fp) {
        this.filePath = fp;
        thread = new Thread(this, name);
        thread.start();

    }


    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " starting");

        System.out.println("Amount of Salary calculated is " + salCalc());


    }


    synchronized double salCalc() {

        double totalSal = 0;


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String data;


            while ((data = br.readLine()) != null) {

                String[] vals = data.split(",");

                totalSal += Double.parseDouble(vals[2]);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return totalSal;

    }


}


