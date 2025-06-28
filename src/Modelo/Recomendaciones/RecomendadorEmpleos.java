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
    public List<Empleo> generarRecomendaciones(List<String> habilidadesUsuario) {
        return listaEmpleos.stream()
            .filter(empleo -> tieneCoincidencias(empleo, habilidadesUsuario))
            .collect(Collectors.toList());
    }

    private boolean tieneCoincidencias(Empleo empleo, List<String> habilidadesUsuario) {
        // Convertir ambas listas a minúsculas para comparación case-insensitive
        List<String> requisitosEmpleo = empleo.getRequisitos().stream()
            .map(String::toLowerCase)
            .collect(Collectors.toList());

        List<String> habilidadesUser = habilidadesUsuario.stream()
            .map(String::toLowerCase)
            .collect(Collectors.toList());

        // Verificar si alguna habilidad del usuario coincide con los requisitos
        return habilidadesUser.stream()
            .anyMatch(requisitosEmpleo::contains);
    }

}
