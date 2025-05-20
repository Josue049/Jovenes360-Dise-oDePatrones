package com.skillbridge.domain.usuario.model;

import com.skillbridge.domain.usuario.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private String nombre;
    private String email;
    private String contrasena;
    private Rol rol;

}
