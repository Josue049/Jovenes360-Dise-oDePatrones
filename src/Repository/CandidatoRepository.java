package Repository;

import Modelo.Core.Candidato;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CandidatoRepository extends CrudBase<Candidato> {

    @Override
    public int crear(Candidato candidato) {
        String sqlUsuario = "INSERT INTO usuario(nombre, email, contrasena) VALUES (?, ?, ?)";
        String sqlCandidato = "INSERT INTO candidato(usuario) VALUES (?)";

        try {
            conexion.setAutoCommit(false);

            PreparedStatement stmtUsuario = conexion.prepareStatement(sqlUsuario, PreparedStatement.RETURN_GENERATED_KEYS);
            stmtUsuario.setString(1, candidato.getNombre());
            stmtUsuario.setString(2, candidato.getEmail());
            stmtUsuario.setString(3, candidato.getContraseña());
            stmtUsuario.executeUpdate();

            int idUsuario = -1;
            try (var rs = stmtUsuario.getGeneratedKeys()) {
                if (rs.next()) {
                    idUsuario = rs.getInt(1);
                }
            }

            PreparedStatement stmtCandidato = conexion.prepareStatement(sqlCandidato);
            stmtCandidato.setInt(1, idUsuario);
            stmtCandidato.executeUpdate();

            conexion.commit();
            return idUsuario;

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
        return -1;
    }

}
