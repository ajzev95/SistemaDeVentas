package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
      
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_ventas","root","123456");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion " +e);
        }
        return null;
    }
}
