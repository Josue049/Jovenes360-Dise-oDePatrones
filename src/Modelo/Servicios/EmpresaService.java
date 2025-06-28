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
import Repository.EmpresaRepository;

public class EmpresaService {
    
    private EmpresaRepository empresaRepository;

    public EmpresaService() {
        this.empresaRepository = new EmpresaRepository();
    }
    
    
    public void crearEmpresa(Empresa empresa){
        empresaRepository.crear(empresa);
    }

}
