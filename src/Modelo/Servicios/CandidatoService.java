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
import Modelo.GestionEmpleos.Empleo;
import Modelo.Certificaciones.Certificado;

public class CandidatoService {

    public void postular(Candidato candidato, Empleo empleo) {
        // Lógica para postular a un empleo
        System.out.println(candidato.getNombre() + " postulo a " + empleo.getTitulo());
    }

    public void subirCertificado(Candidato candidato, Certificado cert) {
        // Lógica para subir certificado
        System.out.println("Certificado subido para " + candidato.getNombre());
    }
}
