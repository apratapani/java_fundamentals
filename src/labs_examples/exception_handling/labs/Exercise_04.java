package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        try {
            System.out.println("First try block");
            try {
                System.out.println("Second try block");
                int [] scores = {1,4,8,16};
                System.out.println(scores[4]);
            }
            catch (Exception e) {
                System.out.println("First catch exception block");
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

            System.out.println("Done with child try/catch blocks, back in parent try block");
        }
        catch (Exception e) {
            System.out.println("Second catch expression block");
        }
    }
}
