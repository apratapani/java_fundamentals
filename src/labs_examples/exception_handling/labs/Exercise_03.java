package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        try {
            int i = 1;
            System.out.println(1/0);

        }
        catch(Exception e) {

            System.out.println("Ran into error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

       finally {
            System.out.println("Program completed");
        }

        System.out.println("Out of catch block");

    }


}