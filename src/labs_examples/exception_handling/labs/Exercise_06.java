package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        try {

            testThrowExceptionA();

        }
        catch(Exception e) {

            System.out.println("Execution is now at main catch block");
            e.getMessage();
            e.printStackTrace();
        }

    }

    public static void testThrowExceptionA() throws Exception
    {
        try {
            testThrowExceptionB();
        }
        catch (NullPointerException e) {
            System.out.println("Exception caught in throwExceptionA");
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }


    public static void testThrowExceptionB() throws Exception
    {
        System.out.println("We are in testThrowExceptionB");
        String a = null;
        System.out.println(a.charAt(0));

    }


}

