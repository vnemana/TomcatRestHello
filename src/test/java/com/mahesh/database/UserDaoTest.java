package com.mahesh.database;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by mahesh on 5/13/17.
 */
public class UserDaoTest {
    @Test
    public void testInsertUser() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            UserDao userDao = new UserDao();
            userDao.insertUser(dbConn, "FirstName", "LastName", "M", "username",
                    "password");
            Assert.assertTrue(true);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test (expected=IllegalArgumentException.class)
    public void testInsertWithNullPassword() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            UserDao userDao = new UserDao();
            userDao.insertUser(dbConn, "FirstName", "LastName", "M", "username",
                    null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test (expected=IllegalArgumentException.class)
    public void testInsertWithBlankPassword() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            UserDao userDao = new UserDao();
            userDao.insertUser(dbConn, "FirstName", "LastName", "M", "username",
                    "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test (expected=IllegalArgumentException.class)
    public void testInsertWithNullUsername() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            UserDao userDao = new UserDao();
            userDao.insertUser(dbConn, "FirstName", "LastName", "M", null,
                    "password");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test (expected=IllegalArgumentException.class)
    public void testInsertWithBlankUsername() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            UserDao userDao = new UserDao();
            userDao.insertUser(dbConn, "FirstName", "LastName", "M", "",
                    "password");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test (expected=IllegalArgumentException.class)
    public void testInsertWithNullFirstName() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            UserDao userDao = new UserDao();
            userDao.insertUser(dbConn, null, "LastName", "M", "username",
                    "password");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test (expected=IllegalArgumentException.class)
    public void testInsertWithBlankFirstName() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            UserDao userDao = new UserDao();
            userDao.insertUser(dbConn, "", "LastName", "M", "username",
                    "password");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test (expected=IllegalArgumentException.class)
    public void testInsertWithNullLastName() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            UserDao userDao = new UserDao();
            userDao.insertUser(dbConn, "FirstName", null, "M", "username",
                    "password");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test (expected=IllegalArgumentException.class)
    public void testInsertWithBlankLastName() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            UserDao userDao = new UserDao();
            userDao.insertUser(dbConn, "FirstName", "", "M", "username",
                    "password");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}