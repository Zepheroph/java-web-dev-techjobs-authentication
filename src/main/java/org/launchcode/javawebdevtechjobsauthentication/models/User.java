package org.launchcode.javawebdevtechjobsauthentication.models;

import org.launchcode.javawebdevtechjobsauthentication.models.AbstractEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {



    public  String username;

    public String password;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public User(){}


    public User (String username, String password){
        this.username = username;
        this.password = encoder.encode(password);
    }

    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, password);
    }





    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }





}
