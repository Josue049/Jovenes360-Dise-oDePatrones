/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.GestionEmpleos;

/**
 *
 * @author josue
 */
import java.util.List;

public class Empleo {
    private String titulo;
    private String descripcion;
    private List<String> requisitos;

    public Empleo(String titulo, String descripcion, List<String> requisitos) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.requisitos = requisitos;
    }

    // Getters y setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public List<String> getRequisitos() { return requisitos; }
    public void setRequisitos(List<String> requisitos) { this.requisitos = requisitos; }
}