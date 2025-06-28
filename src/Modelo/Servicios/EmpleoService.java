/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Servicios;

import Modelo.GestionEmpleos.Empleo;
import Repository.EmpleoRepository;

/**
 *
 * @author Equipo
 */
public class EmpleoService {
    
    private EmpleoRepository empleoRepository;

    public EmpleoService() {
        this.empleoRepository = new EmpleoRepository();
    }
    
    public void crearEmpleo(Empleo empleo){
        empleoRepository.crear(empleo);
    }

    
}
