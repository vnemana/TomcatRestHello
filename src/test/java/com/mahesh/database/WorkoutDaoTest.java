package com.mahesh.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutDaoTest {
    @Test
    void testInsertWorkout() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            WorkoutDao workoutDao = new WorkoutDao();
            workoutDao.insertWorkout(dbConn, "My First Workout", 1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
