package Controlador;

import Modelo.Core.Candidato;
import Modelo.Core.Usuario;
import Modelo.Recomendaciones.*;

import java.util.List;

public class PruebaISP {
    public static void main(String[] args) {
        // Crear empleos de ejemplo
        // Ejemplo ajustado de creación de empleos en PruebaISP.java
        // Crear una instancia del recomendador
        Recomendador recomendadorEmpleos = new RecomendadorEmpleos();
        Recomendador recomendadorCursos = new RecomendadorCursos();

        // Crear un candidato de prueba con algunas habilidades
        Usuario candidato = new Candidato("Ana López", "ana@example.com", "pass123",
                List.of("SQL"), "Desarrolladora Junior");

        System.out.println("=== DEMOSTRACION DE SISTEMA DE RECOMENDACION ===");

        // Generar recomendaciones de empleo basadas en habilidades
        procesarRecomendaciones(recomendadorEmpleos, candidato);
        procesarRecomendaciones(recomendadorCursos, candidato);
    }

    public static void procesarRecomendaciones(Recomendador recomendador, List<String> habilida) {
        List<String> recomendaciones = recomendador.generarRecomendaciones(habilida);
        
        if (recomendaciones.isEmpty()) {
            System.out.println("No se encontraron coincidencias.");
        } else {
            recomendaciones.forEach(empleo -> 
                System.out.println("- " + empleo)
            );
        }
    }
}
