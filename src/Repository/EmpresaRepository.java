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
    public void crear(Empresa empresa) {
        String sqlUsuario = "INSERT INTO usuario(nombre, email, contrasena) VALUES (?, ?, ?)";
        String sqlEmpresa = "INSERT INTO empresa(usuario, ruc, direccion) VALUES (?, ?, ?)";

        try {
            // Desactivar autocommit para manejo transaccional
            conexion.setAutoCommit(false);

            // Insertar en la tabla `usuario`
            PreparedStatement stmtUsuario = conexion.prepareStatement(sqlUsuario, PreparedStatement.RETURN_GENERATED_KEYS);
            stmtUsuario.setString(1, empresa.getNombre());
            stmtUsuario.setString(2, empresa.getEmail());
            stmtUsuario.setString(3, empresa.getContraseña());
            stmtUsuario.executeUpdate();

            // Obtener el ID generado
            int idUsuario = -1;
            try (var rs = stmtUsuario.getGeneratedKeys()) {
                if (rs.next()) {
                    idUsuario = rs.getInt(1);
                }
            }

            // Insertar en la tabla `empresa`
            PreparedStatement stmtEmpresa = conexion.prepareStatement(sqlEmpresa);
            stmtEmpresa.setInt(1, idUsuario);
            stmtEmpresa.setString(2, empresa.getRuc());
            stmtEmpresa.setString(3, empresa.getDireccion());
            stmtEmpresa.executeUpdate();

            // Confirmar transacción
            conexion.commit();
        } catch (SQLException e) {
            try {
                conexion.rollback(); // Revertir si ocurre error
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                conexion.setAutoCommit(true); // Restaurar autocommit
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    
}
