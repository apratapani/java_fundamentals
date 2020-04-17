package mysql.examples;

import java.sql.*;

public class JDBC_example2 {


    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");


            // I have to put serverTimezone for exact time zone. Otherwise I get CDT time zone represents multiple timezones.

            connection = DriverManager.getConnection("jdbc:mysql://localhost/employees?" + "user=apratapani&password=codingNomads&useSSL=false&serverTimezone=America/Chicago");

            statement = connection.createStatement();

            resultSet = statement.executeQuery("select count(*) from employees");

            while (resultSet.next()) {
                int cnt = resultSet.getInt("count(*)");

                System.out.println(" There are " + cnt + " employees");
            }

        }

        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }



}
