/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.GestionEmpleos;

/**
 *
 * @author josue
 */
import java.util.Date;

public class Empleo {
    private String modalidad;
    private double salario;
    private String descripcion;
    private Date fechaPublicacion;
    private String area;

    // Constructor

    public Empleo(String modalidad, double salario, Date fechaPublicacion, String descripcion, String area) {
        this.modalidad = modalidad;
        this.salario = salario;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
        this.area = area;
    }
    

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
}