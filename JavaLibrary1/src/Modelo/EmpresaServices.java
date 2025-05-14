/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Marco
 */
public class EmpresaServices {
    private Empresa empresa;
    
    public String crearEmpresa(String correo, String contrasena, String telefono){
        empresa = new Empresa(correo,contrasena, telefono);
        
        return "Se creo exitosamente el usuario";
    };
    
    public void actualizarEmpresa(String contraseña,String telefono, String correo){
        empresa.setCoontrasena(contraseña);
        empresa.setCorreo(correo);
        empresa.setTelefono(telefono);
    };
    
    public String obtenerEmpresa(){
        return empresa.getCorreo();
    }
    
    /*public String iniciarSecion(String correo, String contrasena){
        if( == correo){
            
        }
        return "Se inicio la secion";    
    };*/

    public void actualizarEmpresa(String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

