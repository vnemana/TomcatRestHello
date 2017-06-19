package com.mahesh.database;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.Date;

class SessionDaoTest {
    @Test
    public void testInsertSession(){
        try {
            Connection dbConn = SQLFactory.getConnection();
            SessionDao sessionDao = new SessionDao();
            Date date = new Date();
            sessionDao.insertSession(dbConn, 1, 1, date);
            Assert.assertTrue(true);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}