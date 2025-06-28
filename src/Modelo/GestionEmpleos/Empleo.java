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
    private int idEmpresa;
    private String titulo;
    private String modalidad;
    private double salario;
    private String descripcion;
    private Date fechaPublicacion;
    private String area;

    // Constructor

    public Empleo(int idEmpresa, String titulo, String modalidad, double salario, String descripcion, Date fechaPublicacion, String area) {
        this.idEmpresa = idEmpresa;
        this.titulo = titulo;
        this.modalidad = modalidad;
        this.salario = salario;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
        this.area = area;
    }

    
   
    public Empleo() {
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public void setId(int aInt) {
        this.idEmpresa = aInt;
    }
    
       
}