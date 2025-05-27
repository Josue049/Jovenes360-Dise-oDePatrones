/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Recomendaciones;

/**
 *
 * @author josue
 */

public class Curso {
    private String nombre;
    private String descripcion;
    private String proveedor; // Puede ser el nombre de la institución o plataforma
    private int duracionHoras; // Duración del curso en horas
    private String nivel; // Ej: "Principiante", "Intermedio", "Avanzado"
    private String enlace; // URL del curso para acceder
    private String habilidad; // Habilidad que enseña o refuerza

    // Constructor
    public Curso(String nombre, String descripcion, String proveedor, int duracionHoras, String nivel, String enlace, String habilidadAsociada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.duracionHoras = duracionHoras;
        this.nivel = nivel;
        this.enlace = enlace;
        this.habilidad = habilidadAsociada;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getProveedor() { return proveedor; }
    public void setProveedor(String proveedor) { this.proveedor = proveedor; }

    public int getDuracionHoras() { return duracionHoras; }
    public void setDuracionHoras(int duracionHoras) { this.duracionHoras = duracionHoras; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }

    public String getEnlace() { return enlace; }
    public void setEnlace(String enlace) { this.enlace = enlace; }

    public String getHabilidad() { return habilidad; }
    public void setHabilidad(String habilidadAsociada) { this.habilidad = habilidadAsociada; }

    // Representación como texto
    @Override
    public String toString() {
        return nombre + " (" + nivel + ") - " + habilidad + "\n" +
               "Duración: " + duracionHoras + "h\n" +
               "Proveedor: " + proveedor + "\n" +
               "Enlace: " + enlace + "\n" +
               "Descripción: " + descripcion;
    }
}
