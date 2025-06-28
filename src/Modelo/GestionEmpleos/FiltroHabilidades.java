/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.GestionEmpleos;

/**
 *
 * @author josue
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FiltroHabilidades implements FiltroBusqueda {
    private final List<String> habilidadesRequeridas;
    private final List<Empleo> empleos;

    public FiltroHabilidades(List<String> habilidadesRequeridas, List<Empleo> empleos) {
        this.habilidadesRequeridas = habilidadesRequeridas;
        this.empleos = empleos;
    }

    // Devuelve empleos compatibles (tienen al menos una habilidad del usuario)
    public List<Empleo> filtrarEmpleosCompatibles() {
        return null;
    }

    // Devuelve habilidades faltantes para empleos compatibles
    @Override
    public List<String> filtrar() {
        return null;
    }

    // Getters y setters si necesitas
}
