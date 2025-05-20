package com.skillbridge.domain.candidato.experienciaLaboral;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpericienciaLaboral {
    private String cargo;
    private TipoEmpleo tipoEmpleo;
    private String Empresa;
    private boolean activo;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private String descripcion;

}
