package dbconn;

import models.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUsers extends DBConn{

    Connection conn;
    Statement st;

    User user;
    List<User> userList;

    public DBUsers(){
        user = new User();
        userList = new ArrayList<>();
    }

    public List<User> getUserList(){

        String query = "SELECT * FROM users";

        conn = connectDB();

        try {

            st = conn.createStatement();
            ResultSet data = st.executeQuery(query);

            while (data.next()) {

                user = new User();

                user.setUserId(data.getInt("user_id"));
                user.setUsername(data.getString("username"));
                user.setPassword(data.getString("password"));
                user.setEmail(data.getString("email"));
                user.setPhone(data.getString("phone"));
                user.setFirstname(data.getString("firstname"));
                user.setLastName(data.getString("lastname"));
                user.setUpdateOn(data.getTimestamp("update_on"));

                userList.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        closeDB();

        return userList;
    }
}
