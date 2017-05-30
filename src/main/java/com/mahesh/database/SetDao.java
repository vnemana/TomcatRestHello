package com.mahesh.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SetDao {
    public void insertSet (Connection dbConn, int idVisit, int idExercise, float weight, String unit,
                           int reps, int setNumber) {
        if (idVisit <= 0)
            throw new IllegalArgumentException("Visit ID is invalid");
        if (idExercise <= 0)
            throw new IllegalArgumentException("Exercise ID is invalid");

        String insertSQL = "insert into workoutdb.set (idvisit, idexercise, weight, unit, reps, setnumber) values ("
                + idVisit + ", " + idExercise + ", " + weight + ", '" + unit + "', " + reps + ", " + setNumber + ")";
        try {
            Statement statement = dbConn.createStatement();
            statement.executeUpdate(insertSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
