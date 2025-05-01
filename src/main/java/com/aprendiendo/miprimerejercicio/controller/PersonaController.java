package com.aprendiendo.miprimerejercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aprendiendo.miprimerejercicio.Service.PersonaService;
import com.aprendiendo.miprimerejercicio.model.Persona;

@RequestMapping("/api/personas")
@RestController

public class PersonaController {
    // metodos
    @Autowired
    private PersonaService personaService;

    /*
     * @GetMapping
     * public String saludar() {
     * return "Hola esto está funcionando";
     * }
     */

    @PostMapping
    public Persona guardar(@RequestBody Persona persona) {
        return personaService.guardarPersona(persona);
    }

    @GetMapping
    public List<Persona> getPersonas() {
        return personaService.listarPersonas();
    }

    @GetMapping("/id/{id}")
    public Persona getPersonaId(@PathVariable int id) {
        return personaService.buscarxId(id);
    }

    @GetMapping("/rut/{rut}")
    public Persona getPersonaRut(@PathVariable String rut) {
        return personaService.buscarxRut(rut);
    }
}
