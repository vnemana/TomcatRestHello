package com.mahesh.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExerciseDao {
    public void insertExercise(Connection dbConn, String name, String bodyPart, String scope, String type, int idUser) {
        if (name == null || name.equals(""))
            throw new IllegalArgumentException("name is null or empty");
        if (bodyPart == null || bodyPart.equals(""))
            throw new IllegalArgumentException("BodyPart is null or empty");
        if (scope == null || scope.equals(""))
            throw new IllegalArgumentException("Scope is null or empty");
        if (type == null || type.equals(""))
            throw new IllegalArgumentException("Type is null or empty");
        if (idUser <= 0)
            throw new IllegalArgumentException("User ID is invalid");

        String insertSQL = "insert into exercise (name, bodypart, scope, type, idUser) values " +
                "('" + name + "','" + bodyPart + "','" + scope + "','" + type + "'," + idUser + ")";
        try {
            Statement statement = dbConn.createStatement();
            statement.executeUpdate(insertSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}