/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Core;

/**
 *
 * @author josue
 */
import java.util.List;

public class Candidato extends Usuario {
    private String cv;

    public Candidato(String nombre, String email, String contraseña, List<String> habilidades, String cv) {
        super(nombre, email, contraseña, Rol.CANDIDATO);
        this.setHabilidades(habilidades); // 💡 Usa el setter de Usuario
        this.cv = cv;
    }

    @Override
    public void registrar() {
        System.out.println("Registrando candidato: " + nombre);
    }

    // Getter y setter de CV
    public String getCv() { return cv; }
    public void setCv(String cv) { this.cv = cv; }
}
