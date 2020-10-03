package com.k4soft.api.controller;

import com.k4soft.api.command.PersonaCommand;
import com.k4soft.api.model.Persona;
import com.k4soft.api.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;


    public Persona findById(int idPersona){
        return personaService.findById(idPersona);
    }

}
