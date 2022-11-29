package ejemplo1.demo.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public Connection openDB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=ejemplo1;"
            + "user=sa;"
            + "password=12345;"
            + "trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
            
        } catch (SQLException e) {
            System.out.println("La base de datos no se ha conectado");
            
        }
        catch(ClassNotFoundException cnfx){
            
        }
        return null;
    }

}
