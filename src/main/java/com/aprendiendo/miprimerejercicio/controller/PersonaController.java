package com.aprendiendo.miprimerejercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendiendo.miprimerejercicio.Service.PersonaService;
import com.aprendiendo.miprimerejercicio.model.Persona;

@RequestMapping("/api/personas")
@RestController

public class PersonaController {
    // metodos
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public String saludar() {
        return "Hola esto está funcionando";
    }

    @PostMapping
    public Persona guardar(@RequestBody Persona persona) {
        return personaService.guardarPersona(persona);
    }
}
