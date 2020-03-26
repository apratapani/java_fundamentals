package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        try {
            testThrowException();
        }
        catch (Exception e) {
            System.out.println("In main method catch block");
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }

    public static void testThrowException() throws Exception
    {

        try {
            int [] nums = new int[5];

            System.out.println(nums[5]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception raised in method");
            throw e;
        }
    }
}

