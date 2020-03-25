package labs_examples.static_nonstatic.labs;

public class StaticNostatic {

    public static void main(String[] args) {

        callStaticMethod(); // call another static method in the same class.

        StaticNostatic statNonStat = new StaticNostatic();

        statNonStat.callNonStaticMethod(); // call another non static method in the same class from static method main.

        System.out.println(Math.multiplyExact(30,50)); // call static method of Math class from static method main of StaticNonstatic class.

        StaticNonstaticAnother statNonStatAnother = new StaticNonstaticAnother();

        statNonStatAnother.CallNonStaticAnother(); // call non static method of Another class from static method main.


        statNonStat.callNonStaticMethodInSameClass(); // call non static method in the same class which in turn calls another non static method.

        statNonStat.callNonStaticMethodInAnotherClass(); // calls non static method of this class which in turn calls non static method of another class.

        statNonStat.callStaticMethodInSameClass(); // calls static method which in turn calls another static method in same class.

        statNonStat.callStaticMethodInAnotherClass(); // calls non static method in the same class which in turn calls static method in another class.



    }

    public static void callStaticMethod() {

        System.out.println("Static method called");
    }


    public void callNonStaticMethod() {

        System.out.println("Non static method called");

    }


    public void callNonStaticMethodInSameClass() {

        System.out.println("Call non static method in the same class");

        callNonStaticMethod();

    }

    public void callNonStaticMethodInAnotherClass() {

        StaticNonstaticAnother statNonStatAnother = new StaticNonstaticAnother();
        statNonStatAnother.CallNonStaticAnother();// calling non static method from another class from non static method.
    }


    public void callStaticMethodInSameClass() {

        System.out.println("Calling static method from non static method in same class");
        callStaticMethod();

    }

    public void callStaticMethodInAnotherClass() {

        System.out.println("Calling static method from non static method in another class");

        StaticNonstaticAnother.callStaticAnother();


    }



}
