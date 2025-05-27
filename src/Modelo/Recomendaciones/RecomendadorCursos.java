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

public class RecomendadorCursos implements Recomendador {
    
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
    
    Curso curso1 = new Curso(
        "Fundamentos de Excel",
        "Aprende a usar Excel para análisis de datos, funciones y tablas dinámicas.",
        "LinkedIn Learning",
        15,
        "Principiante",
        "https://www.linkedin.com/learning/excel-essential-training",
        "Excel"
    );

    Curso curso2 = new Curso(
        "Python para Todos",
        "Curso completo para aprender a programar en Python desde cero.",
        "Coursera",
        25,
        "Intermedio",
        "https://www.coursera.org/specializations/python",
        "Python"
    );

    Curso curso3 = new Curso(
        "Programación en C++",
        "Domina C++ desde lo básico hasta estructuras de datos avanzadas.",
        "Udemy",
        35,
        "Avanzado",
        "https://www.udemy.com/course/beginning-c-plus-plus-programming/",
        "C++"
    );
    
    
    List<Curso> listaCursos = List.of(curso1, curso2, curso3);


    @Override
    public List<String> generarRecomendaciones(Usuario usuario) {
        List<String> habilidadesUsuario = usuario.getHabilidades();

        // Obtener habilidades faltantes mediante el filtro
        FiltroHabilidades filtro = new FiltroHabilidades(habilidadesUsuario, listaEmpleos);
        List<String> habilidadesFaltantes = filtro.filtrar();

        // Lista de cursos disponibles

        // Filtrar habilidades faltantes que tengan un curso asociado
        List<String> habilidadesConCurso = habilidadesFaltantes.stream()
            .filter(habilidad -> listaCursos.stream()
                .anyMatch(curso -> curso.getHabilidad().equalsIgnoreCase(habilidad)))
            .collect(Collectors.toList());

        System.out.println("Cursos recomendados: " + habilidadesConCurso);

        return habilidadesConCurso;
    }




}
