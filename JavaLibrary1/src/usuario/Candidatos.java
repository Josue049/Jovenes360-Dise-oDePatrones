/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

/**
 *
 * @author Marco
 */
public class Candidatos extends Usuario{
    private int experienciaLaboral;

    public Candidatos(int experienciaLaboral, String correo, String coontrasena) {
        super(correo, coontrasena);
        this.experienciaLaboral = experienciaLaboral;
    }
    
    
}
