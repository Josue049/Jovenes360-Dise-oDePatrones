package Repository;

import Modelo.Core.Candidato;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CandidatoRepository extends CrudBase<Candidato> {

    @Override
    public void crear(Candidato candidato) {
    String sqlUsuario = "INSERT INTO usuario(nombre, email, contrasena) VALUES (?, ?, ?)";
    String sqlCandidato = "INSERT INTO candidato(usuario) VALUES (?)";

    try {
        // Desactivar autocommit para transacción
        conexion.setAutoCommit(false);

        // Insertar en la tabla `usuario`
        PreparedStatement stmtUsuario = conexion.prepareStatement(sqlUsuario, PreparedStatement.RETURN_GENERATED_KEYS);
        stmtUsuario.setString(1, candidato.getNombre());
        stmtUsuario.setString(2, candidato.getEmail());
        stmtUsuario.setString(3, candidato.getContraseña());
        stmtUsuario.executeUpdate();

        // Obtener el ID generado
        int idUsuario = -1;
        try (var rs = stmtUsuario.getGeneratedKeys()) {
            if (rs.next()) {
                idUsuario = rs.getInt(1);
            }
        }

        // Insertar en la tabla `candidato`
        PreparedStatement stmtCandidato = conexion.prepareStatement(sqlCandidato);
        stmtCandidato.setInt(1, idUsuario);
        stmtCandidato.executeUpdate();

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


    // Aquí podrías implementar los otros métodos: obtenerPorId, actualizar, eliminar, etc.
}
