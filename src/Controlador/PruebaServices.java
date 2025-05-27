package Controlador;

import Modelo.Core.*;
import Modelo.Certificaciones.*;
import Modelo.GestionEmpleos.*;
import Modelo.Servicios.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class PruebaServices {
    public static void main(String[] args) {
        try {
            // Crear candidato con datos de prueba
            Candidato candidato = new Candidato(
                "Josue",
                "josue@gmail.com",
                "1234",
                Arrays.asList("Java", "SQL", "Spring"),
                "link_a_cv.pdf"
            );

            // Crear empleo de prueba
            Empleo empleo = new Empleo("Desarrollador Java", "Backend con Spring", Arrays.asList("Java", "SQL"));

            // Servicio de postulación
            CandidatoService candidatoService = new CandidatoService();
            candidatoService.postular(candidato, empleo);

            // Servicio de certificados
            ValidadorCertificado validador = new ValidadorAutomatico();
            CertificadoService certService = new CertificadoService(validador);

            // Crear certificado con fecha en formato Date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaCertificado = sdf.parse("2023-12-01");

            Certificado cert = new Certificado("CS50", "Harvard", fechaCertificado);
            candidatoService.subirCertificado(candidato, cert);

            boolean valido = certService.validarCertificado(cert);
            System.out.println("Certificado vlido?: " + valido);
        } catch (ParseException e) {
            System.err.println("Error al parsear la fecha: " + e.getMessage());
        }
    }
}
