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
import Repository.UsuarioRepository;

public class EmpresaService {
    
    private EmpresaRepository empresaRepository;
    private UsuarioRepository usuarioRepository;

    public EmpresaService() {
        this.empresaRepository = new EmpresaRepository();
    }
    
    
    public int crearEmpresa(Empresa empresa){
        return empresaRepository.crear(empresa);
    }

    public int iniciarSesion(String email, String contrasena) {
        return usuarioRepository.iniciarSesion(email, contrasena);
    }
}
