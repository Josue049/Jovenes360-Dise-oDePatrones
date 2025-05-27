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
        return empleos.stream()
            .filter(empleo -> empleo.getRequisitos().stream()
                .anyMatch(habilidadesRequeridas::contains))
            .collect(Collectors.toList());
    }

    // Devuelve habilidades faltantes para empleos compatibles
    @Override
    public List<String> filtrar() {
        List<Empleo> empleosCompatibles = filtrarEmpleosCompatibles();

        Set<String> habilidadesFaltantes = new HashSet<>();
        for (Empleo empleo : empleosCompatibles) {
            for (String req : empleo.getRequisitos()) {
                if (!habilidadesRequeridas.contains(req)) {
                    habilidadesFaltantes.add(req);
                }
            }
        }
        return new ArrayList<>(habilidadesFaltantes);
    }

    // Getters y setters si necesitas
}
