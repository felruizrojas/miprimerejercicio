package com.aprendiendo.miprimerejercicio.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aprendiendo.miprimerejercicio.model.Persona;

@Repository

public class PersonaRepository {
    // clase auxiliar
    private List<Persona> personas = new ArrayList<>();

    PersonaRepository() {
        // Constructor
        // Inicializar la lista de personas con algunos datos
        personas.add(new Persona(1, "12345678-0", "Wacoldo", "Ruiz", 35));
        personas.add(new Persona(2, "87654321-1", "Marcela", "González", 29));
        personas.add(new Persona(3, "11223344-2", "Tomás", "Valenzuela", 42));
        personas.add(new Persona(4, "44332211-3", "Lucía", "Paredes", 31));
        personas.add(new Persona(5, "99887766-4", "Esteban", "Morales", 27));
    }

    public Persona create(Persona persona) {
        personas.add(persona);
        System.out.println(personas.toString());
        return persona;
    }

    public List<Persona> readAll() {
        return personas;
    }

    public Persona read(int id) {
        for (Persona persona : personas) {
            if (persona.getId() == id) {
                return persona;
            }
        }
        return null;
    }

    public Persona read(String rut) {
        for (Persona persona : personas) {
            if (persona.getRut().equals(rut)) {
                // Si el rut coincide, devuelve la persona
                return persona;
            }
        }
        return null;
    }
}
