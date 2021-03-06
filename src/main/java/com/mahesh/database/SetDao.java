package com.mahesh.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SetDao {
    public void insertSet (Connection dbConn, int idSession, int idExercise, float weight, String unit,
                           int reps, int setNumber) {
        if (idSession <= 0)
            throw new IllegalArgumentException("Session ID is invalid");
        if (idExercise <= 0)
            throw new IllegalArgumentException("Exercise ID is invalid");

        String insertSQL = "insert into workoutdb.set (idsession, idexercise, weight, unit, reps, setnumber) values ("
                + idSession + ", " + idExercise + ", " + weight + ", '" + unit + "', " + reps + ", " + setNumber + ")";
        try {
            Statement statement = dbConn.createStatement();
            statement.executeUpdate(insertSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
