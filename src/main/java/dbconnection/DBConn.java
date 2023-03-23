package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "root";

    static Connection conn;

    public static Connection connectDB(){
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
     return conn;
    }

    public static  void closeDB(){
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
