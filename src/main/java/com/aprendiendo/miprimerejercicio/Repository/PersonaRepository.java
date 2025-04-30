package com.aprendiendo.miprimerejercicio.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aprendiendo.miprimerejercicio.model.Persona;

@Repository

public class PersonaRepository {
    // clase auxiliar
    private List<Persona> personas = new ArrayList<>();

    public Persona create(Persona persona) {
        personas.add(persona);
        System.out.println(personas.toString());// solo para prueba
        return persona;
    }
}
