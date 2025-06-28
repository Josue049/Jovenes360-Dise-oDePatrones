/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Servicios;

/**
 *
 * @author josue
 */
import Modelo.Core.Candidato;
import Modelo.Certificaciones.Certificado;
import Repository.CandidatoRepository;
import Repository.UsuarioRepository;

public class CandidatoService {
    
    private CandidatoRepository candidatoRepository;
    private UsuarioRepository usuarioRepository;

    public CandidatoService() {
        this.candidatoRepository = new CandidatoRepository();
    }

    
    public void crearCandidato(Candidato candidato){
        candidatoRepository.crear(candidato);
    }


    public void subirCertificado(Candidato candidato, Certificado cert) {
        // Lógica para subir certificado
        System.out.println("Certificado subido para " + candidato.getNombre());
    }
    
    public int iniciarSesion(String email, String contrasena) {
        return usuarioRepository.iniciarSesion(email, contrasena);
    }
}
