package com.k4soft.api.service.impl;

import com.k4soft.api.fabrica.PersonaFabrica;
import com.k4soft.api.model.Persona;
import com.k4soft.api.repository.PersonaRepository;
import com.k4soft.api.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private PersonaFabrica personaFabrica;

    @Override
    public Persona findById(int idPersona) {
        return personaFabrica.entityToModel(personaRepository.findById(idPersona).orElse(null));
    }
}
