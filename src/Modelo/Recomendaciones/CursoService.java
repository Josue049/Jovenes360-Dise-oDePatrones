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
import java.util.List;

public interface CursoService {
    List<Curso> getCursosRecomendados(Usuario usuario); // Cambiar parámetro a Usuario
}