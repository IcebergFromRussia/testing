package com.untitled.tests.entities;

public class AccountData {
    private String mail;
    private String password;

    public AccountData(String mail, String password){
        this.mail = mail;
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword(){
        return password;
    }
}
