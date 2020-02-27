package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    public static void main(String[] args) {


        System.out.println("All odd numbers from 0 to 10 except 7 :");

        for (int i = 0;i < 10; i++) {

            if (i == 7) {
                continue;
            }

            if (i%2 != 0) {
                System.out.println(i);
            }

        }

    }
}
