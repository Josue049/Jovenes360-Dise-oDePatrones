package Repository;

import Modelo.GestionEmpleos.Empleo;



import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class EmpleoRepository extends CrudBase<Empleo> {


    @Override
    public void crear(Empleo empleo) {
        String sql = "INSERT INTO empleo(titulo, modalidad, salario, descripcion, fecha_publicacion, area) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, empleo.getTitulo());
            stmt.setString(2, empleo.getModalidad());
            stmt.setDouble(3, empleo.getSalario());
            stmt.setString(4, empleo.getDescripcion());
            stmt.setDate(5, new java.sql.Date(empleo.getFechaPublicacion().getTime())); // ✔️ Conversión correcta
            stmt.setString(6, empleo.getArea());
            stmt.executeUpdate();
        } catch (SQLException e) {
          e.printStackTrace();
        }
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
}
