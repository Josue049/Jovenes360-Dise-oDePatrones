/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Marco
 */
public class Empresa extends Usuariologin{
    
    private String telefono;
    
    public Empresa(String telefono, String correo, String coontrasena) {
        super(correo, coontrasena);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }   

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
