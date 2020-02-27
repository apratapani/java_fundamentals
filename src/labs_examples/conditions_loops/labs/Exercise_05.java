package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter lower bound number:");

        int lb = scanner.nextInt();

        System.out.println("Please enter upper bound number:");

        int ub = scanner.nextInt();

        if (ub-lb < 0) {
            System.out.println("Please enter upper bound value higher then lower bound value");
            return;
        }

        int sum = 0;

        float avg = 0;



        for(int i = lb; i <= ub; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);

        avg =  (float) sum/((ub - lb)+1);

        System.out.println("The average is: " + avg);

    }
}
