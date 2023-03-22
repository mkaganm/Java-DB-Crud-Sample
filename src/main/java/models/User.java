package models;

import lombok.Data;

@Data
public class User {

    int userId;

    String username;

    String password;

    String email;

    String name;

    String lastName;

    String phoneNumber;
}
