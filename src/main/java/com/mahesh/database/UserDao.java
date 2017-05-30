package com.mahesh.database;

import com.mahesh.database.dbObjects.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDao {

    public void insertUser(Connection dbConn, String fname, String lname, String mname, String username,
                           String password) {
        try {
            if (username == null || username.equals(""))
                throw new IllegalArgumentException("username is null or empty.");
            if (fname == null || fname.equals(""))
                throw new IllegalArgumentException("First name is null or empty.");
            if (lname == null || lname.equals(""))
                throw new IllegalArgumentException("Last name is null or empty.");
            if (password == null || password.equals(""))
                throw new IllegalArgumentException("password is null or empty");

            String insertSQL = "insert into user " +
                    "(first_name, last_name, middle_name, username, password) values " +
                    "('" + fname + "','" + lname + "','" + mname + "','" + username + "','" + password + "')";
            Statement statement = dbConn.createStatement();
            statement.executeUpdate(insertSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<User> getAllUsers(Connection dbConn) {
        ArrayList<User> users = new ArrayList<>();
        try {
            String getSQL = "select first_name, middle_name, last_name, username, password from user";
            Statement statement = dbConn.createStatement();
            ResultSet rs = statement.executeQuery(getSQL);
            while (rs.next()) {
                User user = new User(rs.getString("first_name"), rs.getString("last_name"),
                        rs.getString("middle_name"), rs.getString("username"),
                        rs.getString("password"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}

