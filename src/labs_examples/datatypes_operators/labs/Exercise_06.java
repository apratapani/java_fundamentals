package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code

        float r = 3.14f;

        float p = 3.14f; // value of pi.

        int h = 5;

        float s = (float) (2*Math.PI*r*h + 2*Math.PI*r*r);


        System.out.println("surface area of cylinder is " + s);



        float v = (float) (Math.PI*r*r*h);

        System.out.println("volume of the cylinder is " + v);

    }
}