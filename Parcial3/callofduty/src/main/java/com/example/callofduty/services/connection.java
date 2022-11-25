package com.example.callofduty.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    public Connection openDb(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName = Parcial3; user = sa; password = Alex312003; trustServerCertificate = true";
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
            
        } catch (SQLException E) {
           System.out.println("LA BASE DE DATOS NO HA PODIDO SER CONECTADA. ");
           int x = 1;
        }
        catch(ClassNotFoundException cnfx){
            int x = 1;
        }
        return null;
    }
}
