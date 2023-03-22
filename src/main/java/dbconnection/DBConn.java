package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "root";

    static Connection conn;

    public static Connection connectDB(){
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
            System.err.println(e.getMessage());
            System.err.println(e.getCause());
        }
     return conn;
    }

    public static  void closeDB(){

    }
}
