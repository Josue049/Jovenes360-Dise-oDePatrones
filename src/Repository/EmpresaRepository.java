/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Core.Empresa;

/**
 *
 * @author Equipo
 */
public class EmpresaRepository extends CrudBase<Empresa>{
    
    @Override
    public int crear(Empresa empresa) {
        String sqlUsuario = "INSERT INTO usuario(nombre, email, contrasena) VALUES (?, ?, ?)";
        String sqlEmpresa = "INSERT INTO empresa(usuario, ruc, direccion) VALUES (?, ?, ?)";

        int idUsuario = -1;

        try {
            conexion.setAutoCommit(false);

            PreparedStatement stmtUsuario = conexion.prepareStatement(sqlUsuario, PreparedStatement.RETURN_GENERATED_KEYS);
            stmtUsuario.setString(1, empresa.getNombre());
            stmtUsuario.setString(2, empresa.getEmail());
            stmtUsuario.setString(3, empresa.getContraseña());
            stmtUsuario.executeUpdate();

            try (var rs = stmtUsuario.getGeneratedKeys()) {
                if (rs.next()) {
                    idUsuario = rs.getInt(1);
                }
            }

            PreparedStatement stmtEmpresa = conexion.prepareStatement(sqlEmpresa);
            stmtEmpresa.setInt(1, idUsuario);
            stmtEmpresa.setString(2, empresa.getRuc());
            stmtEmpresa.setString(3, empresa.getDireccion());
            stmtEmpresa.executeUpdate();

            conexion.commit();
        } catch (SQLException e) {
            try {
                conexion.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                conexion.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return idUsuario;
    }

    
}
