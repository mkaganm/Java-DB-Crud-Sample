package org.example;

import dbconn.DBUsers;
import models.User;

public class Main {
    public static void main(String[] args) {

        DBUsers dbu = new DBUsers();

        User user = new User();

        user.setFakeUser();

        dbu.addUserToDB(user);

        for (User user1 : dbu.getUserList()) {
            System.out.println(user1);
        }

        user.setFakeUser();

        System.out.println(dbu.getUserWithId(10));
        dbu.updateUser(10, user);
        System.out.println(dbu.getUserWithId(10));

        dbu.deleteUser(35);

    }
}