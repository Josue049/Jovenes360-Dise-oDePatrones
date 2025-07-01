package Modelo.Observer;

import Modelo.GestionEmpleos.Empleo;

public interface Observador {
    void actualizar(Empleo nuevoEmpleo);
}