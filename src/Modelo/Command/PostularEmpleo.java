package Modelo.Command;

import Modelo.Core.Candidato;
import Modelo.GestionEmpleos.Empleo;
import Repository.PostulacionRepository;

public class PostularEmpleo implements Comando {
    private Candidato candidato;
    private Empleo empleo;
    private PostulacionRepository postulacionRepo;

    public PostularEmpleo(Candidato candidato, Empleo empleo, PostulacionRepository repo) {
        this.candidato = candidato;
        this.empleo = empleo;
        this.postulacionRepo = repo;
    }

    @Override
    public void ejecutar() {
        postulacionRepo.crear(candidato.getId(), empleo.getId());
        System.out.println(">> Postulación exitosa a: " + empleo.getTitulo());
    }

    @Override
    public void deshacer() {
        postulacionRepo.eliminar(candidato.getId(), empleo.getId());
        System.out.println(">> Postulación deshecha: " + empleo.getTitulo());
    }
}