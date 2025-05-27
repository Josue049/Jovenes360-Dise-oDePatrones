/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Servicios;

/**
 *
 * @author josue
 */
import Modelo.Core.Empresa;
import Modelo.GestionEmpleos.Empleo;

public class EmpresaService {

    public void publicarVacante(Empresa empresa, Empleo vacante) {
        // Lógica para publicar vacante
        System.out.println("Vacante publicada por " + empresa.getNombre());
    }

    public void subirVideo(Empresa empresa, Video video) {
        // Lógica para subir video
        System.out.println("Video subido por " + empresa.getNombre());
    }
}
