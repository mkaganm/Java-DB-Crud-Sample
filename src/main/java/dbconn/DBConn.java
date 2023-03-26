package dbconn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.Data;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Data
public class DBConn {

    private static DBConn dbConn;
    private String dbUrl;
    private String dbUser;
    private String dbPassword;

    static {
        try {
            ObjectMapper om = new ObjectMapper(new YAMLFactory());
            dbConn = om.readValue(new File("src/main/resources/db_credentials.yaml"), DBConn.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    static Connection conn;

    public static Connection connectDB() {
        try {
            conn = DriverManager.getConnection(dbConn.getDbUrl(), dbConn.getDbUser(), dbConn.getDbPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return conn;
    }

    public static void closeDB() {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
