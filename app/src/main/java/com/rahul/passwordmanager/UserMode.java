package com.rahul.passwordmanager;

public class UserMode {
    private String name, number,email;

    public UserMode(){

    }

    public UserMode(String name, String number, String email){
        this.name = name;
        this.number = number;
        this.email = email;

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
