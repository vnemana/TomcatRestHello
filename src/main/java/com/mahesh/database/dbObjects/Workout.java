package com.mahesh.database.dbObjects;

/**
 * Created by mahesh on 5/29/17.
 */
public class Workout {
    private String name;
    private String userName;
    private int idUser;

    public Workout(String name, String userName, int idUser) {
        this.name = name;
        this.userName = userName;
        this.idUser = idUser;
    }

    public Workout(String name, String userName) {
        this.name = name;
        this.userName = userName;
        this.idUser = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
