package dbconn;

import models.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUsers extends DBConn{

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

            st.close();

        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }

        closeDB();

        return userList;
    }

    public void addUserToDB(User user1) {

        String query = "INSERT INTO users (username,password,email,phone,firstname,lastname) VALUES(?,?,?,?,?,?)";

        conn = connectDB();

        try {

            preSt = conn.prepareStatement(query);

            preSt.setString(1,user1.getUsername());
            preSt.setString(2,user1.getPassword());
            preSt.setString(3, user1.getEmail());
            preSt.setString(4,user1.getPhone());
            preSt.setString(5,user1.getFirstname());
            preSt.setString(6,user1.getLastName());

            preSt.executeUpdate();

            preSt.close();

        } catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }

        closeDB();
    }
}
