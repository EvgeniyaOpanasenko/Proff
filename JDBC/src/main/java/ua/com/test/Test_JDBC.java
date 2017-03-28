package ua.com.test;

import ua.com.model.Candidate;
import ua.com.model.Clan;

import java.sql.*;

/**
 * Created by EVA on 28.03.2017.
 */
public class Test_JDBC {

    public static final String URL = "jdbc:mysql://localhost:3306/election";
    public static final String USER = "root";
    public static final String PASSWORD = "root";
    public static final String SQL_QUERY_ALL_CANDIDATES = "SELECT id, name, age, clan_id, region_id, hobby_id FROM candidates ";

    public static void main(String[] args) throws ClassNotFoundException {
        // load driver
        Class.forName("com.mysql.jdbc.Driver");

        //open connection
        //driver manager gets all drivers

        // url, password
        //connection need to be closed

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL_QUERY_ALL_CANDIDATES)){

            // start point of the result set begins from ID? start from 1
            // need to be closed as well
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                //TODO how to place Clan, Region and Hobby??? pls Help
                int clan = resultSet.getInt("clan_id");
                int region = resultSet.getInt("region_id");
                int hobby = resultSet.getInt("hobby_id");

                System.out.println(new Candidate(name, age));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
