package models;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {

    int userId;

    String username;

    String password;

    String email;

    String phone;

    String firstname;

    String lastName;

    Timestamp updateOn;
}
