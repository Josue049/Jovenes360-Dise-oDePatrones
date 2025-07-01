package Modelo.Proxy;

import Modelo.Core.Empresa;
import Modelo.GestionEmpleos.Empleo;

public class PermisosProxy {
    private Empresa empresa;

    public PermisosProxy(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean puedeEditarEmpleo(Empleo empleo) {
        // Verifica si la empresa es la dueña de la vacante
        if (empleo.getIdEmpresa() == empresa.getId()) {
            System.out.println(">> Permiso concedido para editar empleo ID: " + empleo.getId());
            return true;
        }
        System.out.println(">> ERROR: Empresa no tiene permisos para editar este empleo");
        return false;
    }
}