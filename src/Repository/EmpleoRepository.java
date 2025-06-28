package Repository;

import Modelo.GestionEmpleos.Empleo;



import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpleoRepository extends CrudBase<Empleo> {


    @Override
    public void crear(Empleo empleo) {
        String sql = "INSERT INTO empleo(modalidad, salario, descripcion, fecha_publicacion, area) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, empleo.getModalidad());
            stmt.setDouble(2, empleo.getSalario());
            stmt.setString(3, empleo.getDescripcion());
            stmt.setDate(4, new java.sql.Date(empleo.getFechaPublicacion().getTime())); // ✔️ Conversión correcta
            stmt.setString(5, empleo.getArea());
            stmt.executeUpdate();
        } catch (SQLException e) {
          
        }
    }
}
