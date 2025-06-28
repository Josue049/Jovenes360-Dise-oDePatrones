package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexionBD {
    private static conexionBD instancia;
    private Connection conexion;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/jovenes360";
    private final String usuario = "root";
    private final String contrasena = "1234";


    private conexionBD(){
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, contrasena);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static conexionBD getInstancia() {
        if (instancia == null){
            instancia = new conexionBD();
        }
        return instancia;
    }

    public Connection getConnection(){
        return conexion;
    }
}
