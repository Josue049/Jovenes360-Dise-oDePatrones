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

    public Candidato(String nombre, String email, String contraseña) {
        super(nombre, email, contraseña, Rol.CANDIDATO);
    }

    @Override
    public void registrar() {
        System.out.println("Registrando candidato: " + nombre);
    }

}
