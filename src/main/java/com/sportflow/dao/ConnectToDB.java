package com.sportflow.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {
    private final String dbURI = "jdbc:mysql://localhost:3306/sportflow";
    private final String dbUsername = "root";
    private final String dbPassword = "admin";

    public ConnectToDB () {}

    public Connection getConnection () {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURI, dbUsername, dbPassword);
            System.out.println("database connected");
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return con;
    }
}
