/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Certificaciones;

/**
 *
 * @author josue
 */
public class ValidadorAutomatico implements ValidadorCertificado {

    @Override
    public boolean validar(Certificado cert) {
        // Validación automática, ejemplo trivial
        return cert != null && cert.getNombre() != null && !cert.getNombre().isEmpty();
    }
}
