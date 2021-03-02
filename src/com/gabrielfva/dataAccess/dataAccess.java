package com.gabrielfva.dataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dataAccess {
    Connection connection = null;

    public Connection conexion() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionURL = "jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com:3306/GabrielVargas";
        String user = "sofka_training";
        String password = "BZenX643bQHw";

        connection = DriverManager.getConnection(connectionURL, user, password);
        if (connection != null) {
            System.out.println("Conexión exitosa!!\n");
        } else {
            System.out.println("Conexión fallida");
        }
        System.out.println("\n");

        return connection;
    }
}
