package org.example;

import dbconn.DBUsers;

public class Main {
    public static void main(String[] args) {
        DBUsers.connectDB();
        DBUsers.closeDB();
    }
}