package com.skillbridge.controller;

import com.skillbridge.domain.empresa.model.Empresa;
import com.skillbridge.domain.empresa.service.EmpresaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("empresa")
public class EmpresaController {

    private EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @PostMapping("registrar/empresa")
    public ResponseEntity<Empresa> crearEmpresa(){
        Empresa empresa = new Empresa("boris", "boris@gmail.com", "1234", "estudiante utp", "123445", "tecnologia"
                , "ficus", 0);
        URI uri = URI.create("/auth/registrar/empresa");
        return ResponseEntity.created(uri).body(empresa);
    }
}
