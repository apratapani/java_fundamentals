package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: It prints 10 as the object a is defined by A class.
 *              If a parent reference variable holding child object reference and if both parent class and subclass have the same variable,it will refer to the parent class value of that variable, even if its holding child class object refrence.
 *              Compiler uses special run-time polymorphism only for methods.
 *
 */
class A {
    int i = 10;

}

class B extends A{
    int i = 20;

}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}