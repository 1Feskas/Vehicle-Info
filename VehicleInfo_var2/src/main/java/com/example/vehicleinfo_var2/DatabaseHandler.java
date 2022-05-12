package com.example.vehicleinfo_var2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DatabaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    public void signUpUser(User user) {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USER_NAME + "," + Const.USER_IIN + "," + Const.USER_PHONENUMBER + "," +
                Const.USER_PASSWORD + ")" + "VALUES(?,?,?,?)";


        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, user.getName());
            prSt.setString(2, user.getIin());
            prSt.setString(3, user.getPhonenumber());
            prSt.setString(4, user.getPassword());
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addCar(Vehicle vehicle) {
        String insert = "INSERT INTO " + Const2.VEHICLE_TABLE + "(" +
                Const2.VEHICLE_IIN + "," + Const2.VEHICLE_NUMBER + "," +
                Const2.VEHICLE_NAME + ")" + "VALUES(?,?,?)";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, vehicle.getVeh_iin());
            prSt.setString(2, vehicle.getVeh_number());
            prSt.setString(3, vehicle.getVeh_name());
            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public ResultSet getUser(User user) {
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Const.USER_TABLE + " WHERE " + Const.USER_PHONENUMBER + "=? AND " +
                Const.USER_PASSWORD + "=?";

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, user.getPhonenumber());
            prSt.setString(2, user.getPassword());

            resSet = prSt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return resSet;
    }
}
