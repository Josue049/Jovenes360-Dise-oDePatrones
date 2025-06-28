package Repository;

import Modelo.GestionEmpleos.Empleo;



import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class EmpleoRepository extends CrudBase<Empleo> {


    @Override
    public int crear(Empleo empleo) {
        String sql = "INSERT INTO empleo(empresa, titulo, modalidad, salario, descripcion, fecha_publicacion, area) VALUES (?,?, ?, ?, ?, ?, ?)";
        int idGenerado = -1;

        try (PreparedStatement stmt = conexion.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, empleo.getIdEmpresa());
            stmt.setString(2, empleo.getTitulo());
            stmt.setString(3, empleo.getModalidad());
            stmt.setDouble(4, empleo.getSalario());
            stmt.setString(5, empleo.getDescripcion());
            stmt.setDate(6, new java.sql.Date(empleo.getFechaPublicacion().getTime()));
            stmt.setString(7, empleo.getArea());

            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    idGenerado = rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return idGenerado;
    }

    
    @Override
    public List<Empleo> obtenerTodos() {
        List<Empleo> empleos = new ArrayList<>();
        String sql = "SELECT * FROM empleo";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Empleo empleo = new Empleo();
                empleo.setModalidad(rs.getString("modalidad"));
                empleo.setSalario(rs.getDouble("salario"));
                empleo.setDescripcion(rs.getString("descripcion"));
                empleo.setFechaPublicacion(rs.getDate("fecha_publicacion"));
                empleo.setArea(rs.getString("area"));
                empleos.add(empleo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return empleos;
    }
    
    public List<Empleo> obtenerPorEmpresa(int idEmpresa) {
        List<Empleo> empleos = new ArrayList<>();
        String sql = "SELECT * FROM empleo WHERE empresa = ?";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idEmpresa);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Empleo empleo = new Empleo();
                    empleo.setId(rs.getInt("id_empleo"));
                    empleo.setTitulo(rs.getString("titulo"));
                    empleo.setModalidad(rs.getString("modalidad"));
                    empleo.setSalario(rs.getDouble("salario"));
                    empleo.setDescripcion(rs.getString("descripcion"));
                    empleo.setFechaPublicacion(rs.getDate("fecha_publicacion"));
                    empleo.setArea(rs.getString("area"));
                    empleos.add(empleo);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return empleos;
    }

    
}
