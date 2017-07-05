package com.sspku.localecert;

import java.io.Serializable;

/**
 * Created by zuosoul on 2017/6/29.
 */

public class MyUser implements Serializable {
    private int id;
    private String username;
    private String password;
    private String email;
    public MyUser() {
        super();
        // TODO Auto-generated constructor stub
    }
    public MyUser(String username, String password, String email) {
        super();
        this.username = username;
        this.password = password;
        this.email=email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password="
                + password + ", email="+email+"]";
    }
}
