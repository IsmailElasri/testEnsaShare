package com.example.myapplication.model;

import java.io.Serializable;
@SuppressWarnings("serial")
public abstract class User implements Serializable {

    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String password;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void partagerInformaion();
}

