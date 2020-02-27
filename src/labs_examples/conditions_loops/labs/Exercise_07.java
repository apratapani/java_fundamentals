package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the word: ");

        String word = sc.nextLine();

                int i = 0;
                char c;

        first:
           while (i <= word.length())  {

                    c = word.charAt(i);

                    switch (c) {

                        case 'a':
                            System.out.println("Word is " + word + " first vowel is " + c);
                            break first;

                        case 'e':
                            System.out.println("Word is " + word + " first vowel is " + c);
                            break first;

                        case 'i':
                            System.out.println("Word is " + word + " first vowel is " + c);
                            break first;


                        case 'o':
                            System.out.println("Word is " + word + " first vowel is " + c);
                            break first;

                        case 'u':
                            System.out.println("Word is " + word + " first vowel is " + c);
                            break first;

                        default:
                            break;

                    }

                     i++;

                }


    }
}
