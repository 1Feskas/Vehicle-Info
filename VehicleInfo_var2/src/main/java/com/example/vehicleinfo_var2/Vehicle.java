package com.example.vehicleinfo_var2;

public class Vehicle {
    private String veh_iin;
    private String veh_number;
    private String veh_name;

    public Vehicle(String veh_iin, String veh_number, String veh_name) {
        this.veh_iin = veh_iin;
        this.veh_number = veh_number;
        this.veh_name = veh_name;
    }

    public Vehicle() {}

    public String getVeh_iin() {
        return veh_iin;
    }

    public void setVeh_iin(String veh_iin) {
        this.veh_iin = veh_iin;
    }

    public String getVeh_number() {
        return veh_number;
    }

    public void setVeh_number(String veh_number) {
        this.veh_number = veh_number;
    }

    public String getVeh_name() {
        return veh_name;
    }

    public void setVeh_name(String veh_name) {
        this.veh_name = veh_name;
    }
}
