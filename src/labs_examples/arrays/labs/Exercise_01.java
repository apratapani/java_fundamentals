package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0;
        float avg = 0;


        for(int i=0;i<num.length;i++) {

            System.out.print("Enter numbers : ");
            num[i] = scanner.nextInt();
        }

        for(int i : num) {
            sum += i;
        }
        avg = (float) sum/num.length;
        System.out.println("Sum of all numbers is:" + sum);
        System.out.println("Average of all numbers is:" + avg);
    }

}