package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */


class GenericController {

    public static void main(String[] args) {

          GenericClass<Integer,String>  students = new GenericClass(201,"Anil");

          GenericClass<String,String>   emps = new GenericClass("Trish","IT");


        System.out.println(students.getVal1() + " " + students.getVal2());


        System.out.println(emps.getVal1() + " " + emps.getVal2());


    }


}


class GenericClass<T,V> {

    T val1;
    V val2;

    public GenericClass(T val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public V getVal2() {
        return val2;
    }

    public void setVal2(V val2) {
        this.val2 = val2;
    }
}