/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Core;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author josue
 */

public abstract class Usuario {
    protected String nombre;
    protected String email;
    protected String contraseña;
    protected Rol rol;
    private List<String> habilidades; // 🔹 NUEVO
    private List<String> postulados;

    public Usuario(String nombre, String email, String contraseña, Rol rol) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.rol = rol;
        this.habilidades = new ArrayList<>(); // 🔹 Inicializar lista vacía
    }

    public abstract void registrar();

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }

    // 🔹 Getter de habilidades
    public List<String> getHabilidades() {
        return habilidades;
    }

    // 🔹 Setter de habilidades (opcional)
    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    // 🔹 Agregar una habilidad individual (opcional)
    public void addHabilidad(String habilidad) {
        this.habilidades.add(habilidad);
    }
}
