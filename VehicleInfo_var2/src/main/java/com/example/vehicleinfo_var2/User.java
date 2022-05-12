package com.example.vehicleinfo_var2;

public class User {
    private String name;
    private String iin;
    private String phonenumber;
    private String password;

    public User(String name, String iin, String phonenumber, String password) {
        this.name = name;
        this.iin = iin;
        this.phonenumber = phonenumber;
        this.password = password;
    }

    public User() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIin() {
        return iin;
    }

    public void setIin(String iin) {
        this.iin = iin;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
