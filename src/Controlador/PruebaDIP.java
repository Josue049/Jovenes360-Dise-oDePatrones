/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controlador;

import Modelo.Certificaciones.Certificado;
import Modelo.Certificaciones.ValidadorAutomatico;
import Modelo.Servicios.CertificadoService;
import java.util.Date;

/**
 *
 * @author josue
 */
public class PruebaDIP {
    public static void main(String[] args) {
        Certificado cert = new Certificado("CS50x", "Harvard University", new Date());

         // Validador Automático
        CertificadoService servicioAuto = new CertificadoService(new ValidadorAutomatico());
        boolean resultadoAuto = servicioAuto.validarCertificado(cert);
        System.out.println("Resultado automático: " + resultadoAuto);

    }
}
