package com.skillbridge.domain.candidato.experienciaLaboral;

public enum TipoEmpleo {
    JornadaCompleta("Jornada Completa"),
    JornadaParcial("Jornada Parcial"),
    Autonomo("Autonomo"),
    ContratoTemporal("Controto Temporal"),
    ContratoPracticas("Contrato Parcial"),
    ContratoFormacion("Contrato Formación"),
    Temporal("Temporal");

    private String tipoEmpleo;

    TipoEmpleo(String tipoEmpleo) {
        this.tipoEmpleo = tipoEmpleo;
    }

}
