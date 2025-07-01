package Modelo.Proxy;

import Modelo.GestionEmpleos.Empleo;
import Repository.EmpleoRepository;
import java.util.List;

public class EmpleoProxy implements EmpleoRepository {
    private EmpleoRepository repositorioReal;
    private List<Empleo> cacheEmpleos;
    private long tiempoExpiracionCache; // Cache válida por 5 minutos

    public EmpleoProxy(EmpleoRepository repositorioReal) {
        this.repositorioReal = repositorioReal;
        this.tiempoExpiracionCache = System.currentTimeMillis() + 300000; // 5 minutos en milisegundos
    }

    @Override
    public List<Empleo> obtenerPorEmpresa(int idEmpresa) {
        if (cacheEmpleos == null || System.currentTimeMillis() > tiempoExpiracionCache) {
            System.out.println(">> Consultando BD real (cache vacía/expirada)");
            cacheEmpleos = repositorioReal.obtenerPorEmpresa(idEmpresa);
            tiempoExpiracionCache = System.currentTimeMillis() + 300000; // Resetear tiempo
        } else {
            System.out.println(">> Recuperando empleos desde cache");
        }
        return cacheEmpleos;
    }

    // Métodos delegados al repositorio real
    @Override
    public void crear(Empleo empleo) {
        repositorioReal.crear(empleo);
    }
}