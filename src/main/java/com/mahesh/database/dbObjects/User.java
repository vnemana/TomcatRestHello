package com.mahesh.database.dbObjects;

/**
 * Created by mahesh on 5/18/17.
 */
public class User {
    private String firstName;
    private String lastName;
    private String middleName;
    private String username;
    private String password;

    public User (String fname, String lname, String mname, String username, String password) {
        this.firstName = fname;
        this.lastName = lname;
        this.middleName = mname;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

}
