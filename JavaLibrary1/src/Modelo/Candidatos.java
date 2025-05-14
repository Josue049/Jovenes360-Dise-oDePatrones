/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Marco
 */
public class Candidatos extends Usuariologin{
    private int experienciaLaboral;

    public Candidatos(int experienciaLaboral, String correo, String coontrasena) {
        super(correo, coontrasena);
        this.experienciaLaboral = experienciaLaboral;
    }
    
    
}
