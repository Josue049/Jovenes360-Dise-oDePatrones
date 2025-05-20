package com.skillbridge.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    private static ConexionBD instancia;
    private Connection conexion;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/skill_Bridge";
    private final String usuario = "sa";
    private final String contrasena = "1234";


    private ConexionBD(){
        try{
            Class.forName(driver);
            System.out.print("Conexion exitosa a mysql");
            conexion = DriverManager.getConnection(url, usuario, contrasena);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ConexionBD getInstancia() {
        if (instancia == null){
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public Connection getConnection(){
        return conexion;
    }

}
