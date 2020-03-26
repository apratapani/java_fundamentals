package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 * <p>
 * 1) Demonstrate a try/catch.
 */


public class Exercise_01 {


    public static void main(String[] args) {

        try {
            int i = 5;
            System.out.println(i/0);
        } catch (ArithmeticException e) {
            System.out.println("Ran into Arithmetic exception");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }


}
