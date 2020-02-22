package labs_examples.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 2: Type conversion and casting
 * <p>
 * Write the necessary code to demonstrate type conversion:
 * <p>
 * Widening:
 * 1. Declare and initialize an int with the value 10
 * 2. Declare a double and set it equal to the int
 * 3. Print out the double
 * <p>
 * Narrowing (with casting):
 * 1. Declare and initialize a new double with the value 10.5
 * 2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 * 3. Print out the int
 * <p>
 * Notice how each type is converted. In which direction is information lost?
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // write code here

        int a = 10;

        double b = a;

        System.out.println("This is widening of data type - value of double b now is " + b);

        double c = 10.5;

        int d = (int) c;

        System.out.println("This is narrowing with casting value of d after casting value of c which is 10.5  is " + d);

    }
}
