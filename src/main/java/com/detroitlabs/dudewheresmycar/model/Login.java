package com.detroitlabs.dudewheresmycar.model;

import java.time.LocalDateTime;

public class Login {
    String userName;
    String password;
    LocalDateTime timestamp;

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

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Login(String userName, String password, LocalDateTime timestamp) {
        this.userName = userName;
        this.password = password;
        this.timestamp = timestamp;
    }


}//end class Login
