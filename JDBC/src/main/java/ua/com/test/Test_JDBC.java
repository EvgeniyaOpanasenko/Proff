package ua.com.test;

import java.sql.*;

/**
 * Created by EVA on 28.03.2017.
 */
public class Test_JDBC {

    public static final String URL = "jdbc:mysql://localhost:3306/election";
    public static final String USER = "root";
    public static final String PASSWORD = "root";
    public static final String SQL_QUERY_ALL_CANDIDATES = "SELECT id, name FROM candidates ";

    public static void main(String[] args) throws ClassNotFoundException {
        // load driver
        Class.forName("com.mysql.jdbc.Driver");

        //open connection
        //driver manager grts all drivers

        // url, password
        //connection need to be closed
        try (Connection connection =
                     DriverManager.getConnection(URL, USER, PASSWORD)){

            // select

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_QUERY_ALL_CANDIDATES);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
