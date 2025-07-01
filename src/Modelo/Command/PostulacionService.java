package Modelo.Servicios;

import Modelo.Command.Comando;
import Modelo.Command.PostularEmpleo;
import Modelo.Core.Candidato;
import Modelo.GestionEmpleos.Empleo;
import Repository.PostulacionRepository;

public class PostulacionService {
    private PostulacionRepository postulacionRepo;

    public PostulacionService() {
        this.postulacionRepo = new PostulacionRepository();
    }

    public Comando postular(Candidato candidato, Empleo empleo) {
        Comando comando = new PostularEmpleo(candidato, empleo, postulacionRepo);
        comando.ejecutar();
        return comando; // Para poder deshacer luego
    }
}