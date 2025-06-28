/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Core.Usuario;
import Repository.CrudBase;

/**
 *
 * @author Equipo
 */
public class UsuarioRepository extends CrudBase<Usuario>{
    
    public int iniciarSesion(String email, String contrasena) {
        String sql = "SELECT id_usuario FROM usuario WHERE email = ? AND contrasena = ?";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, contrasena);

            try (var rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id_usuario");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return -1;
    }
    
}
