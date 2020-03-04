package labs_examples.objects_classes_methods.labs.objects;

public class Patientdetails {

    public static void main(String[] args) {

        Patient p1 = new Patient("Anil");

        Patient p2 = new Patient("Mike",48);

        Patient p3 = new Patient("Brenda",55,"Female");

        System.out.println("We have 3 patients. One is " + p1.name + " second one is " + p2.name + " who is " + p2.age + " years old. Third patient is " + p3.name + " who is " + p3.age
        + " years old and is " + p3.sex);


    }

}



class Patient {
    String name;
    int age;
    String sex;

    public Patient(String name) {
        this.name = name;
    }

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Patient(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}