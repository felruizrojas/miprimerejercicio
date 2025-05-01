package com.aprendiendo.miprimerejercicio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendiendo.miprimerejercicio.Repository.PersonaRepository;
import com.aprendiendo.miprimerejercicio.model.Persona;

@Service

public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona guardarPersona(Persona persona) {
        return personaRepository.create(persona);
    }

    public List<Persona> listarPersonas() {
        return personaRepository.readAll();
    }

    public Persona buscarxId(int id) {
        return personaRepository.read(id);
    }

    public Persona buscarxRut(String rut) {
        return personaRepository.read(rut);
    }
    
}
