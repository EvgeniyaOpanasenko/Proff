package ua.com.test;

import org.apache.log4j.Logger;
import ua.com.model.Candidate;

import java.sql.*;


/**
 * Created by EVA on 28.03.2017.
 */
public class Test_JDBC {

    final static Logger logger = Logger.getLogger(Test_JDBC.class);

    public static final String URL = "jdbc:mysql://localhost:3306/election";
    public static final String USER = "root";
    public static final String PASSWORD = "root";
    public static final String SQL_QUERY_ALL_CANDIDATES = "SELECT id, name, age, clan_id, region_id, hobby_id FROM candidates";
    /*public static final String SQL_QUERY_ALL_CANDIDATES = "SELECT candidates.id, candidates.name, candidates.age, clans.id " +
            "FROM candidates inner join clans on candidates.clan_id = clans.id";*/

    public static void main(String[] args) throws ClassNotFoundException {

        //Candidate candidate = new Candidate("");
        // load driver
        Class.forName("com.mysql.jdbc.Driver");

        //open connection
        //driver manager gets all drivers

        // url, password
        //connection need to be closed

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQL_QUERY_ALL_CANDIDATES)){

            //ResultSet resultSetClans = statement.executeQuery("SELECT id, name FROM clans WHERE "))

            connection.setAutoCommit(false);

            // start point of the result set begins from ID? start from 1
            // need to be closed as well
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                //TODO how to place Clan, Region and Hobby??? pls Help
                String clan = resultSet.getString("name");
                //int region = resultSet.getInt("region_id");
                //int hobby = resultSet.getInt("hobby_id");

                //System.out.println(new Candidate(name, age));

            }

            //add new Candidate
           /* statement.executeUpdate("INSERT INTO candidates(age, name, clan_id, region_id, hobby_id)" +
                    "VALUES(25, 'griga', 1, 1, 1);");
            connection.commit();*/

        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("nothing to show" + e);

        }
    }
}
