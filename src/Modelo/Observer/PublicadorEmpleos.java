package Modelo.Observer;

import Modelo.GestionEmpleos.Empleo;
import java.util.ArrayList;
import java.util.List;

public class PublicadorEmpleos {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void publicarEmpleo(Empleo nuevoEmpleo) {
        System.out.println(">> Publicando empleo: " + nuevoEmpleo.getTitulo());
        notificarObservadores(nuevoEmpleo);
    }

    private void notificarObservadores(Empleo empleo) {
        observadores.forEach(obs -> obs.actualizar(empleo));
    }
}