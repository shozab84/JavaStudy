package dayTwo;

/**
 * Created by student on 25-Aug-16.
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class employeeDB {

    List<Employee> employees = new ArrayList<>();
    List<String> data = new ArrayList<>();
    static Connection con;
    static Statement statement = null;
    static ResultSet rs = null;
    static ResultSetMetaData metaData;// information about the result
    static int rowCount = 0;


    String username = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/augustDpp?UseSSL-false";


    public employeeDB() throws Exception {
        //Load driver

        Class.forName("com.mysql.jdbc.Driver");
        // connect to augustDpp

        con = DriverManager.getConnection(url, username, password);// using getConnection() method to establish a connection to the database
    }

    public void queryAll() throws SQLException {// this method would query our database and our List will have string coming
        //

        statement = con.createStatement();
        rs= statement.executeQuery("SELECT * from employee"); // executeQuery returns one ResultSet Object. Used to execute SELECT statements

        metaData = rs.getMetaData();
        int ColumnCount = metaData.getColumnCount();





        while(rs.next()){ // this will go into each row and column of rs
            for(int i = 2; i<=ColumnCount; i++){
                 data.add(rs.getString(i));
            }

            TaskProcessing.createEmployee(data);
            data.clear();// clear temporary data
            rowCount++;

        }
    }


    public void addEmployee(List<String> data) throws SQLException{
        PreparedStatement statement = con.prepareStatement("INSERT INTO employee(firstname," +
                                      "lastname, height,weight,birthdate,sextype,position," +
                                      "hiredate) VALUES (?,?,?,?,?,?,?,?)");

        statement.setString(1,data.get(0));
        // 1 refer to first question mark
        statement.setString(2, data.get(1));
        statement.setInt(3, Integer.parseInt(data.get(2)));
        statement.setDouble(4, Double.parseDouble((data.get(3))));
        statement.setDate(5, Date.valueOf(data.get(4)));
        statement.setString(6, data.get(5));
        statement.setString(7, data.get(6));
        statement.setDate(8, Date.valueOf(data.get(7)));




    }


}
