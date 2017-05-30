package com.mahesh.database;

import com.mahesh.database.dbObjects.Workout;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WorkoutDao {
    public void insertWorkout (Connection dbConn, String name, int idUser) {
        if (name == null || name.equals(""))
            throw new IllegalArgumentException("name is null or empty");
        if (idUser <= 0)
            throw new IllegalArgumentException("User ID is invalid");

        String insertSQL = "insert into workout (name, idUser) values ('" + name + "'," + idUser + ")";
        try {
            Statement statement = dbConn.createStatement();
            statement.executeUpdate(insertSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Workout> getWorkoutsForUser(Connection dbConn, int idUser) {
        ArrayList<Workout> workouts = new ArrayList<>();
        try {
            String getSQL = "select w.name, u.name from workout w, user u where w.idUser=u.idUser and u.idUser=" + idUser;
            Statement statement = dbConn.createStatement();
            ResultSet rs = statement.executeQuery(getSQL);
            while (rs.next()) {
                workouts.add(new Workout(rs.getString(1), rs.getString(2)));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return workouts;
    }
}
