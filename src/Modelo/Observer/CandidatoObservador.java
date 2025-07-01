package Modelo.Observer;

import Modelo.Core.Candidato;
import Modelo.GestionEmpleos.Empleo;

public class CandidatoObservador implements Observador {
    private Candidato candidato;

    public CandidatoObservador(Candidato candidato) {
        this.candidato = candidato;
    }

    @Override
    public void actualizar(Empleo nuevoEmpleo) {
        if (coincideConHabilidades(nuevoEmpleo)) {
            System.out.println(">> Alerta para " + candidato.getNombre() + 
                             ": Nuevo empleo de " + nuevoEmpleo.getTitulo());
        }
    }

    private boolean coincideConHabilidades(Empleo empleo) {
        return empleo.getHabilidadesRequeridas().stream()
            .anyMatch(habilidad -> candidato.getHabilidades().contains(habilidad));
    }
}