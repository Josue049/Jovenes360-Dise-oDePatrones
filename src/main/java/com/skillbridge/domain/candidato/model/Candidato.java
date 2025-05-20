package com.skillbridge.domain.candidato.model;

import com.skillbridge.domain.candidato.experienciaLaboral.ExpericienciaLaboral;
import com.skillbridge.domain.candidato.Modalidad;
import com.skillbridge.domain.certidicado.Certificado;
import com.skillbridge.domain.curso.model.Curso;
import com.skillbridge.domain.usuario.Rol;
import com.skillbridge.domain.usuario.model.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Candidato extends Usuario {
    private String foto;
    private String descripcion;
    private String cv;
    private Date fechaNacimiento;
    private List<ExpericienciaLaboral> laborals;
    private String area;
    private List<Certificado> certificados;
    private Modalidad modalidad;

    public Candidato(String nombre, String email, String contrasena, Rol rol, String foto, String descripcion, String cv, Date fechaNacimiento, List<ExpericienciaLaboral> laborals, String area, List<Certificado> certificados, Modalidad modalidad) {
        super(nombre, email, contrasena, rol);
        this.foto = foto;
        this.descripcion = descripcion;
        this.cv = cv;
        this.fechaNacimiento = fechaNacimiento;
        this.laborals = laborals;
        this.area = area;
        this.certificados = certificados;
        this.modalidad = modalidad;
    }
}
