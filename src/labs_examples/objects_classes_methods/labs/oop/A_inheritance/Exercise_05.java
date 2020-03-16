// Without running the code below, please tell me what will print. Why?

// it should print "Parent called and then Child called". Because by default super constructor of parent is called from child even if its not explicitly called.



// public class InheritanceTest
public class Exercise_05
{
  public static void main(String[] args)
  {
    Parent c = new Child();
  }
}

class Parent
{
  public Parent()
  {
    System.err.println("Parent called");
  }
}

class Child extends Parent
{
  public Child()
  {
    System.err.println("Child called");
  }
}