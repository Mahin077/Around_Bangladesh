package com.example.aroundbangladesh;

public class User {
    public String fullName,email;

    public User()
    {

    }

    public User(String fullName,String email)
    {
        this.fullName = fullName;
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
