package labs_examples.objects_classes_methods.labs.methods;

import videos_source_code.classes.Person;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {
    public static void main(String[] args) {

     //   int a = add(2,3,4,6);
        System.out.println("Addition of 3 numbers is " + add(2,3,4,6));

        Employee anil = new Employee(39,"Anil","Male");

        Employee pratapani = anil;

        int a = 10;
        System.out.println("Calling passbyvalue from main, value of a now is " + a );

        passbyvalue(a);

        System.out.println("In the main class after calling passbyvalue in the main method, value of a now is " + a );

        System.out.println("Age of " + anil.name + " before calling passByReferenceBirthday method is " + anil.age);

        passByReferenceBirthday(anil);

        System.out.println("Age of " + anil.name + "  after passByReferenceBirthday method call is " + anil.age);

        System.out.println("Age of " + pratapani.name + "  after passByReferenceBirthday method call, through copy reference variable is " + pratapani.age);

        System.out.println("Largest of numbers 5,7,189,195 is " + largest(5,7,189,195));

        System.out.println("Count of consonants in word 'virtue' are " + countConsonants("virtue"));


        asciiArt();

        isPrime(177);

        int [] data = {13,15,2,-1,-77,144,17,420};

        System.out.println("Array is " + Arrays.toString(largeSmall(data)));

        ArrayList<Integer> list = new ArrayList<Integer>(arrayList(20,2,3));

       for ( int i : list) {
           System.out.print(i + ",");
       }

        System.out.println("Length of Array list is " + list.size());

       for( int i: reverseArray(data)) {
           System.out.print(i + ",");
       }




    }

     static int add(int... a) {
        int c = 0;
        for (int b: a) {
            c += b;
        }
        return c;
    }

     static double add(double a, double b) {
        return (double) a+b;
    }


   static void passbyvalue(int a) {
        a *= 10;
       System.out.println("Value of a in passbyvalue method after changing it is " + a);
        // return a*10;
   }

//   void passByReference()

    static void passByReferenceBirthday(Employee emp) {

       emp.age = emp.age + 20;

        System.out.println("Age of " + emp.name + " in passByReferenceBirthday method is " + emp.age);


    }

    static int largest(int... a) {
        int c =0;
        for (int b: a) {

            if (b > c) {
                c = b;
            }

        }
        return c;
    }

    static int countConsonants(String word) {

        char [] toArray = word.toCharArray();

        int count = 0;

        for(int i=0;i < toArray.length; i++) {

            switch (toArray[i]) {

                case 'a':
                    break;

                case 'e':
                    break;

                case 'i':
                    break;


                case 'o':
                    break;

                case 'u':
                    break;


                default:
                         count++;
                         break;

            }


        }

        return count;

    }

    static void asciiArt() {

        int width = 100;
        int height = 30;


        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("Hello", 10, 20);



        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {

                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");

            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(sb);
        }

    }


    static void isPrime(int num) {

        boolean prime = false;

        for(int i=2;i < num;i++) {

            if(num%i==0) {

                prime = false;
                break;

            }
            else {
                prime = true;
            }
        }


        if(prime == true) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }

    }

    static int[] largeSmall(int [] num) {


        int [] ls = {0,0};



        for(int i=0; i < num.length; i++){

            if(i==0) {
                ls[0] = num[i];
                ls[1] = num[i];
                continue;
            }

            if(i != 0 && num[i] < ls[0])
              ls[0] = num[i];

            if(i!= 0 && num[i] > ls[1])
               ls[1] = num[i];


        }
        return ls;
    }

    static ArrayList<Integer> arrayList(int maxNum, int divisor1, int divisor2) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=1; i<=maxNum; i++) {

            if(i%divisor1==0 && i%divisor2==0){

                list.add(i);

            }

        }

        return list;

    }


    static int [] reverseArray(int [] num) {

        int temp = 0;

        for(int i=0; i < num.length/2;i++ ) {

            temp = num[i];
            num[i] = num[num.length-1-i];
            num[num.length-1-i] = temp;

        }

        return num;

    }


}

class Employee {
    int age;
    String name;
    String sex;

    public Employee(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

}

