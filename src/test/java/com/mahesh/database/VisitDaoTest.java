package com.mahesh.database;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.Date;

class VisitDaoTest {
    @Test
    public void testInsertVisit(){
        try {
            Connection dbConn = SQLFactory.getConnection();
            VisitDao visitDao = new VisitDao();
            Date date = new Date();
            visitDao.insertVisit(dbConn, 1, 1, date);
            Assert.assertTrue(true);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}