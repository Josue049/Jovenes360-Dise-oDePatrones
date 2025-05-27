/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;

import Modelo.Core.Candidato;
import Modelo.Core.Empresa;
import Modelo.Core.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josue
 */
// Clase que demuestra el principio LSP
public class PruebaLCP {
    public static void main(String[] args) {
        // Crear lista de usuarios (puede contener tanto Candidatos como Empresas)
        List<Usuario> usuarios = new ArrayList<>();
        
        // Crear un candidato
        Usuario candidato = new Candidato("Juan Pérez", "juan@example.com", "pass123", 
                                        List.of("Java", "Spring"), "Experto en desarrollo backend");
        
        // Crear una empresa
        Usuario empresa = new Empresa("Tech Solutions", "contacto@tech.com", "secure456", 
                                    "123456789", "Desarrollo de software");
        
        // Añadir a la lista (sustitución de Liskov en acción)
        usuarios.add(candidato);
        usuarios.add(empresa);
        
        // Procesar usuarios (el código no necesita saber el tipo concreto)
        System.out.println("=== Procesando registro de usuarios ===");
        for (Usuario usuario : usuarios) {
            // LSP: Podemos llamar a métodos de Usuario sin saber el tipo concreto
            usuario.registrar();
            usuario.getNombre();
            
            if (usuario instanceof Candidato) {
                System.out.println("CV del candidato: " + ((Candidato) usuario).getCv());
                System.out.println("Skills: " + ((Candidato) usuario).getHabilidades());
            } else if (usuario instanceof Empresa) {
                System.out.println("RUC de la empresa: " + ((Empresa) usuario).getRuc());
                System.out.println("Rubro: " + ((Empresa) usuario).getRubro());
            }
            System.out.println("--------------------");
        }
        
        // Demostración de que funciona con métodos que esperan Usuario
        System.out.println("\n=== Enviando notificaciones ===");
        enviarNotificacionBienvenida(candidato);
        enviarNotificacionBienvenida(empresa);
    }
    
    // Método que acepta cualquier tipo de Usuario (base o derivado)
    public static void enviarNotificacionBienvenida(Usuario usuario) {
        System.out.println("Enviando notificacion de bienvenida a: " + usuario.getEmail());
        // LSP: El comportamiento es correcto independientemente del tipo concreto
    }
}