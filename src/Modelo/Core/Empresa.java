/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Core;

/**
 *
 * @author josue
 */
public class Empresa extends Usuario {
    private String ruc;
    private String rubro;

    public Empresa(String nombre, String email, String contraseña, String ruc, String rubro) {
        super(nombre, email, contraseña, Rol.EMPRESA);
        this.ruc = ruc;
        this.rubro = rubro;
    }

    @Override
    public void registrar() {
        // Implementación específica para empresa
        System.out.println("Registrando empresa: " + nombre);
    }

    // Getters y setters
    public String getRuc() { return ruc; }
    public void setRuc(String ruc) { this.ruc = ruc; }

    public String getRubro() { return rubro; }
    public void setRubro(String rubro) { this.rubro = rubro; }
}
