/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Recomendaciones;

/**
 *
 * @author josue
 */
import Modelo.Core.Usuario;
import Modelo.GestionEmpleos.Empleo;
import java.util.List;

public interface Recomendador {
    List<Empleo> generarRecomendaciones(List<String> habil);
}
