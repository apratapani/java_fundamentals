package mysql.examples;

import java.sql.*;
import java.util.ArrayList;

public class JDBC_example3 {

    public static void main(String[] args) {

        Connection connection = null;
        Statement  statement = null;
        ResultSet  resultSet = null;
        ResultSet rs = null;
        PreparedStatement ps = null;




        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/employees?" + "user=apratapani&password=codingNomads&useSSL=false&serverTimezone=America/Chicago");

            statement = connection.createStatement();

                      // connection.prepareStatement()

            resultSet = statement.executeQuery("select first_name,last_name,emp_no from employees order by hire_date limit 10");






            ArrayList<Employees> employees = new ArrayList();

            while (resultSet.next()) {

                Employees employee = new Employees();
                employee.setEmpNo(resultSet.getInt("emp_no"));

                employee.setFirstName(resultSet.getString("first_name"));

                employee.setLastName(resultSet.getString("last_name"));

                employees.add(employee);

                System.out.println("Fetching row by row");
            }

            for (Employees e : employees) {
                System.out.println(e.toString());
            }

            ps = connection.prepareStatement("select first_name,last_name,emp_no from employees where emp_no=?");

            ps.setInt(1,14872);

            rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println(("Employee info -> " + rs.getInt("emp_no") + " " + rs.getString("first_name") +" " + rs.getString("last_name")));

            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        finally {

          try {
              statement.close();
              resultSet.close();
              connection.close();
              ps.close();
              rs.close();

          }
             catch (SQLException e) {
                e.printStackTrace();
            }
        }





    }

}


class Employees {

    String firstName;

    String lastName;

    int empNo;

    public Employees() {
    }

    public Employees(String firstName, String lastName, int empNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empNo = empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empNo=" + empNo +
                '}';
    }
}




