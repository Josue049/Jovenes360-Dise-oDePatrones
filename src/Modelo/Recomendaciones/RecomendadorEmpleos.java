/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Recomendaciones;

/**
 *
 * @author josue
 */
import Modelo.Core.Usuario;
import Modelo.GestionEmpleos.Empleo;
import Modelo.GestionEmpleos.FiltroHabilidades;
import java.util.List;
import java.util.stream.Collectors;

public class RecomendadorEmpleos implements Recomendador {
    
    Empleo empleo1 = new Empleo(
        "Desarrollador Backend",
        "Responsable del desarrollo de la lógica del servidor y base de datos",
        List.of("Java", "SQL")
    );

    Empleo empleo2 = new Empleo(
        "Diseñador UI",
        "Diseñar interfaces amigables para aplicaciones web y móviles",
        List.of("Figma", "Adobe Photoshop")
    );

    Empleo empleo3 = new Empleo(
        "Data Analyst",
        "Analizar datos para extraer insights y apoyar la toma de decisiones",
        List.of("Python", "SQL", "Power BI")
    );


    List<Empleo> listaEmpleos = List.of(empleo1, empleo2, empleo3);

    @Override
    public List<String> generarRecomendaciones(Usuario usuario) {
        List<String> habilidadesUsuario = usuario.getHabilidades();

        // Crear filtro con habilidades y lista completa de empleos
        FiltroHabilidades filtro = new FiltroHabilidades(habilidadesUsuario, listaEmpleos);

        // Obtener empleos compatibles usando el filtro (que devuelve List<Empleo>)
        List<Empleo> empleosCompatibles = filtro.filtrarEmpleosCompatibles();
        
        System.out.println("Empleos Recomendados: ");
        // Devolver títulos de esos empleos
        return empleosCompatibles.stream()
            .map(Empleo::getTitulo)
            .collect(Collectors.toList());
    }


}
