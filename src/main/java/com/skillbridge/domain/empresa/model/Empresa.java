package com.skillbridge.domain.empresa.model;

import com.skillbridge.domain.usuario.Rol;
import com.skillbridge.domain.usuario.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Empresa extends Usuario {
    private String descripcion;
    private String ruc;
    private String rubro;
    private String direccion;
    private int vacantes;

    public Empresa(String nombre, String email, String contrasena, String descripcion, String ruc, String rubro, String direccion, int vacantes) {
        super(nombre, email, contrasena, Rol.EMPRESA);
        this.descripcion = descripcion;
        this.ruc = ruc;
        this.rubro = rubro;
        this.direccion = direccion;
        this.vacantes = vacantes;
    }

}
