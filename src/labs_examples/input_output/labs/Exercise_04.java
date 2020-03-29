package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */
class Csv_Parser {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList();

        String filePath = "src/labs_examples/input_output/files/employees.csv";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath)))
        {
            String line;

            while((line=bufferedReader.readLine())!=null){

                String[] vals = line.split(",");

                employees.add(mapValuesToEmployeeobject(vals));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        for(Employee emp : employees) {

            System.out.println(emp.toString());

        }


    }

    private static Employee mapValuesToEmployeeobject(String[] empvals) {

        Employee employee = new Employee();

        employee.setEmployeeID(Integer.parseInt(empvals[0]));

        employee.setName(empvals[1]);

        employee.setSal(Double.parseDouble(empvals[2]));

        employee.setRole(empvals[3]);

        return employee;

    }


}



class Employee {

    private int employeeID;

    private String name;

    private double sal;

    private String role;


    public Employee() {
    }

    public Employee(int employeeID, String name, double sal, String role) {
        this.employeeID = employeeID;
        this.name = name;
        this.sal = sal;
        this.role = role;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                ", role='" + role + '\'' +
                '}';
    }
}