/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Servicios;

/**
 *
 * @author josue
 */
import Modelo.Certificaciones.Certificado;
import Modelo.Certificaciones.ValidadorCertificado;

public class CertificadoService {
    private ValidadorCertificado validador;

    public CertificadoService(ValidadorCertificado validador) {
        this.validador = validador;
    }

    public boolean validarCertificado(Certificado cert) {
        return validador.validar(cert);
    }
}
