/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Servicios;

import Modelo.GestionEmpleos.Empleo;
import Repository.EmpleoRepository;
import java.util.List;

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

    public List<Empleo> obtenerEmpleosPorEmpresa(int idEmpresa) {
        return empleoRepository.obtenerPorEmpresa(idEmpresa);
    }
}
