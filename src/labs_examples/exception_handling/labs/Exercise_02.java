package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 * <p>
 * Demonstrate a try/catch with multiple catch statements.
 */

public class Exercise_02 {


    public static void main(String[] args) {


        try {
            int[] nums = {1, 2, 3, 4};
            System.out.println(nums[4] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in Array index out of bound");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception occurred");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}

