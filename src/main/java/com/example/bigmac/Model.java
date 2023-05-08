package com.example.bigmac;

public class Model {
    User user = new User();

    public User getUser() {
        return user;
    }

    public Model() {
        this.user = new User();
    }

    public void setUser(User user) {
        this.user = user;
    }

}
