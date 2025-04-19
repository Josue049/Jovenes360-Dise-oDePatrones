package Includify.empleo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco
 */
public class Empleos {
    private String nombreEmpresa;
    private String anuncio;
    private boolean estado;

    public Empleos(String nombreEmpresa, String anuncio) {
        this.nombreEmpresa = nombreEmpresa;
        this.anuncio = anuncio;
        this.estado = true;
    }

    @Override
    public String toString() {
        return "Empleos{" + "nombreEmpresa=" + nombreEmpresa + ", anuncio=" + anuncio + ", estado=" + estado + '}';
    }
    
    
}
