/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Marco
 */
class CorreoUsuario {

    private String idCorreo;

    public CorreoUsuario(String idCorreo) {
        this.idCorreo = idCorreo;
    }

    public String getIdCorreo() {
        return idCorreo ;
    }

    public void setIdCorreo(String idCorreo) {
        this.idCorreo = idCorreo;
    }
    
    
    
    public String suCorreo(){
        return "Su correo es:"+ idCorreo;
    }
    
}
