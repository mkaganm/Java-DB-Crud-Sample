package dbconn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.Data;

import java.io.File;
import java.sql.*;

@Data
public class DBConn {

    private static DBConn dbConn;
    private String dbUrl;
    private String dbUser;
    private String dbPassword;

    protected static Connection conn;
    protected Statement st;
    protected PreparedStatement preSt;

    static {
        try {
            ObjectMapper om = new ObjectMapper(new YAMLFactory());
            dbConn = om.readValue(new File("src/main/resources/db_credentials.yaml"), DBConn.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    protected static Connection connectDB() {
        try {
            conn = DriverManager.getConnection(dbConn.getDbUrl(), dbConn.getDbUser(), dbConn.getDbPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return conn;
    }

    protected static void closeDB() {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
