package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */


public class Exercise_07 {


    public static void main(String[] args) {

        try {

            testCustomException();
        }
        catch(customException e) {
            System.out.println("We are in catch block of custom exception");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }

    public static void testCustomException() throws customException {


        System.out.println("In test custom Exception");
        throw new customException();
    }



}


class customException extends Exception {


    public customException() {
        super();
    }

    @Override
    public String toString() {
        System.out.println("Custom Exception occurred");
        return super.toString();
    }

}