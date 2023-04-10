package com.example.intent_intentfilter;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String userName;

    public User(String name, String lastName) {
        this.name = name;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return userName;
    }

    public void setLastName(String userName) {
        this.userName = User.this.userName;
    }
}
