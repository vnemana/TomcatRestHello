package com.mahesh.database;

import com.mahesh.database.dbObjects.Set;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class SetDaoTest {
    @Test
    void insertSet() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            SetDao setDao = new SetDao();
            setDao.insertSet(dbConn, 1, 1, (float) 10.0, Set.Unit.POUNDS.toString(),
                    12, 1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}