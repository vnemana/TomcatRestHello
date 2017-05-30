package com.mahesh.database;

import com.mahesh.database.dbObjects.Session;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class SessionDao {
    public void insertSession(Connection dbConn, int idWorkout, int idUser, Date date) {
        if (idWorkout <= 0)
            throw new IllegalArgumentException("Workout ID is invalid");
        if (idUser <= 0)
            throw new IllegalArgumentException("User ID is invalid");
        if (date == null)
            throw new IllegalArgumentException("Date is null");

        java.text.SimpleDateFormat sdf =
                new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(date);

        String insertSQL = "insert into session (idWorkout, idUser, date) values (" + idWorkout + "," + idUser + ",'"
                + currentTime + "')";
        try {
            Statement statement = dbConn.createStatement();
            statement.executeUpdate(insertSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Session> getWorkoutSessionsForUser(Connection dbConn, int idUser) {
        ArrayList<Session> sessions = new ArrayList<>();
        try {
            String getSQL = "select w.name, u.name, s.date from workout w, user u, session s where " +
                    "s.idWorkout = w.idWorkout and w.idUser=u.idUser and u.idUser=" + idUser;
            Statement statement = dbConn.createStatement();
            ResultSet rs = statement.executeQuery(getSQL);
            while (rs.next()) {
                sessions.add(new Session(rs.getString(1), rs.getString(2), rs.getDate(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sessions;
    }
}
