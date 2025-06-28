/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.util.List;

/**
 *
 * @author Equipo
 */
public interface CrudRepository<T> {
    void crear(T entidad);
    T obtenerPorId(int id);
    List<T> obtenerTodos();
    void actualizar(T entidad);
    void eliminar(int id);
}
