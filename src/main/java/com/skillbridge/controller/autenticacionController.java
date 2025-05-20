package com.skillbridge.controller;

import com.skillbridge.domain.candidato.model.Candidato;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class autenticacionController {

    @GetMapping
    public ResponseEntity<Candidato> iniciarSesion(){
        return null;
    }


}
