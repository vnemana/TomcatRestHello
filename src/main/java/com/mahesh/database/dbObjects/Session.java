package com.mahesh.database.dbObjects;

import java.sql.Date;

/**
 * Created by mahesh on 5/29/17.
 */
public class Session {
    int idWorkout;
    int idUser;
    String nameOfUser;
    String workoutName;
    Date date;

    public Session(int idWorkout, int idUser, String nameOfUser, String workoutName, Date date) {
        this.idWorkout = idWorkout;
        this.idUser = idUser;
        this.nameOfUser = nameOfUser;
        this.workoutName = workoutName;
        this.date = date;
    }

    public Session(String nameOfUser, String workoutName, Date date) {
        this.idWorkout = 0;
        this.idUser = 0;
        this.nameOfUser = nameOfUser;
        this.workoutName = workoutName;
        this.date = date;
    }

    public int getIdWorkout() {
        return idWorkout;
    }

    public void setIdWorkout(int idWorkout) {
        this.idWorkout = idWorkout;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }
}
