/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

/**
 *
 * @author Marco
 */
class Usuario {
    private String nombre;
    private String coontrasena;

    public Usuario(String correo, String coontrasena) {
        this.nombre = correo;
        this.coontrasena = coontrasena;
    }
    
    public String getCorreo() {
        return nombre;
    }

    public void setCorreo(String correo) {
        this.nombre = correo;
    }

    public String getCoontrasena() {
        return coontrasena;
    }

    public void setCoontrasena(String coontrasena) {
        this.coontrasena = coontrasena;
    }
    
    
    
}
