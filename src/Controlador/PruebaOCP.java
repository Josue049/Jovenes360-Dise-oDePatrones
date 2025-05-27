package Controlador;

import Modelo.Core.*;
import Modelo.GestionEmpleos.*;

import java.util.Arrays;
import java.util.List;

public class PruebaOCP {
    public static void main(String[] args) {
        // Crear candidato con habilidades
        Candidato candidato = new Candidato(
            "Josué",
            "josue@gmail.com",
            "1234",
            Arrays.asList("Java", "Spring Boot"),
            "cv.pdf"
        );

        // Crear lista de empleos
        Empleo emp1 = new Empleo("Backend Developer", "Spring Boot y APIs", Arrays.asList("Java", "Spring Boot"));
        Empleo emp2 = new Empleo("Diseñador UI", "Diseño con Figma", Arrays.asList("Figma", "UX"));
        Empleo emp3 = new Empleo("Fullstack", "React y Java", Arrays.asList("React", "Java"));

        List<Empleo> empleos = Arrays.asList(emp1, emp2, emp3);

        // Crear el filtro con los datos requeridos
        FiltroBusqueda filtro = new FiltroHabilidades(candidato.getSkills(), empleos);

        // Filtrar los empleos
        List<Empleo> empleosFiltrados = filtro.filtrar();

        // Mostrar resultados
        System.out.println("Empleos compatibles con habilidades del candidato:");
        for (Empleo empleo : empleosFiltrados) {
            System.out.println("- " + empleo.getTitulo());
        }
    }
}
