package com.mahesh.database;

import com.mahesh.database.dbObjects.Exercise;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

class ExerciseDaoTest {
    @Test
    void insertExercise() {
        try {
            Connection dbConn = SQLFactory.getConnection();
            ExerciseDao exerciseDao = new ExerciseDao();
            exerciseDao.insertExercise(dbConn, "exerciseName", Exercise.BodyPart.SHOULDERS.toString(),
                    Exercise.Scope.USER.toString(),
                    Exercise.Type.FREE_WEIGHTS.toString(),1);
            Assert.assertTrue(true);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}