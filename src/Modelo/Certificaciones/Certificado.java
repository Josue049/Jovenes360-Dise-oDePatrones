/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Certificaciones;

/**
 *
 * @author josue
 */
import java.util.Date;

public class Certificado {
    private String nombre;
    private String institucion;
    private Date fecha;

    public Certificado(String nombre, String institucion, Date fecha) {
        this.nombre = nombre;
        this.institucion = institucion;
        this.fecha = fecha;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getInstitucion() { return institucion; }
    public void setInstitucion(String institucion) { this.institucion = institucion; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
}
