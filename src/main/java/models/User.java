package models;

import com.github.javafaker.Faker;
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

    public void setFakeUser(){
        Faker faker = new Faker();

        this.username = faker.name().username();
        this.password = faker.internet().password();
        this.email = faker.internet().emailAddress();
        this.phone = faker.phoneNumber().phoneNumber();
        this.firstname = faker.name().firstName();
        this.lastName = faker.name().lastName();
    }
}


